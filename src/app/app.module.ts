import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { MovielistComponent } from './movielist/movielist.component';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { FormsModule } from '@angular/forms';
import { UpdatemovieComponent } from './updatemovie/updatemovie.component';
import { DeletemovieComponent } from './deletemovie/deletemovie.component';

@NgModule({
  declarations: [
    AppComponent,
    MovielistComponent,
    AddmovieComponent,
    UpdatemovieComponent,
    DeletemovieComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
