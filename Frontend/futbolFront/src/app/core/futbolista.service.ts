import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { IFutbolista } from '../models/ifutbolista';

@Injectable({
  providedIn: 'root',
})
export class FutbolistaService {
  private apiUrl = 'http://localhost:8080/futbolista';
  constructor(private http: HttpClient) {}

  getAllFutbolistas(): Observable<IFutbolista[]> {
    return this.http.get<IFutbolista[]>(this.apiUrl);
  }

  //metodo para buscar un futbolista por su Id

  getFutbolistaById(id: number): Observable<IFutbolista> {
    return this.http.get<IFutbolista>(`${this.apiUrl}/${id}`);
  }
}
