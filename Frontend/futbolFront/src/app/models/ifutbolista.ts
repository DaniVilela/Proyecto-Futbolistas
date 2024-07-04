import { IPosicion } from './iposicion';

export interface IFutbolista {
  id?: number;
  nombres: string;
  apellidos: string;
  fecha_nacimiento: string;
  caracteristicas: string;
  posicion: IPosicion;
}
