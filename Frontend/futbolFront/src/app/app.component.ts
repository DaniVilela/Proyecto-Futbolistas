import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TablaFutbolistasComponent } from './components/tabla-futbolistas/tabla-futbolistas.component';
import { HttpClientModule } from '@angular/common/http';
import { FutbolistaDetailComponent } from './components/futbolista-detail/futbolista-detail.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    TablaFutbolistasComponent,
    HttpClientModule,
    FutbolistaDetailComponent,
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
})
export class AppComponent {
  title = 'futbolFront';
}
