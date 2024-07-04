import { IFutbolista } from './../../models/ifutbolista';
import { FutbolistaService } from './../../core/futbolista.service';
import { Component, OnInit, ViewChild } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';

@Component({
  selector: 'app-tabla-futbolistas',
  standalone: true,
  imports: [CommonModule, MatTableModule, MatPaginator],
  templateUrl: './tabla-futbolistas.component.html',
  styleUrl: './tabla-futbolistas.component.scss',
})
export class TablaFutbolistasComponent implements OnInit {
  futbolistas: IFutbolista[] = [];

  dataSource = new MatTableDataSource(this.futbolistas);

  @ViewChild(MatPaginator) paginator!: MatPaginator;

  constructor(private futbolistaService: FutbolistaService) {}

  ngOnInit(): void {
    this.getAllFutbolistas();
  }
  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
  }

  getAllFutbolistas(): void {
    this.futbolistaService.getAllFutbolistas().subscribe({
      next: (response) => {
        this.futbolistas = response;
        this.dataSource.data = this.futbolistas;
        console.log('Datos de futbolistas:', this.futbolistas);
      },
      error: (error) => {
        console.log('error al obtener los futbolitas', error);
      },
    });
  }

  displayedColumns: string[] = [
    'id',
    'nombres',
    'apellidos',
    'fechaNacimiento',
    'caracteristicas',
    'posicion',
  ];
}
