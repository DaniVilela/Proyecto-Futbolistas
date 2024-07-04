import { Routes } from '@angular/router';
import { TablaFutbolistasComponent } from './components/tabla-futbolistas/tabla-futbolistas.component';
import { FutbolistaDetailComponent } from './components/futbolista-detail/futbolista-detail.component';

export const routes: Routes = [
  { path: '', redirectTo: '/futbolista', pathMatch: 'full' },
  { path: 'futbolista', component: TablaFutbolistasComponent },
  { path: 'futbolista/:id', component: FutbolistaDetailComponent },
];
