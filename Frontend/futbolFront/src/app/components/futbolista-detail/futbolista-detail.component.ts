import { Component, OnInit } from '@angular/core';
import { IFutbolista } from '../../models/ifutbolista';
import { FutbolistaService } from '../../core/futbolista.service';
import { ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-futbolista-detail',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './futbolista-detail.component.html',
  styleUrl: './futbolista-detail.component.scss',
})
export class FutbolistaDetailComponent implements OnInit {
  futbolista?: IFutbolista;
  constructor(
    private futbolistaService: FutbolistaService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    //para traer la id desde la url
    this.route.paramMap.subscribe((params) => {
      const id = +params.get('id')!;
      this.getFutbolista(id);
    });
  }

  //traer un solo futbolista por su id
  getFutbolista(id: number): void {
    this.futbolistaService.getFutbolistaById(id).subscribe({
      next: (response) => {
        this.futbolista = response;
        console.log('Futbolista encontrado:', this.futbolista);
      },
      error: (error) => {
        console.log('Error al obtener el futbolista:', error);
      },
    });
  }
}
