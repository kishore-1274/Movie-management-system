import { Component } from '@angular/core';
import { MovieserviceService } from '../services/movieservice.service';

@Component({
  selector: 'app-deletemovie',
  templateUrl: './deletemovie.component.html',
  styleUrls: ['./deletemovie.component.css']
})
export class DeletemovieComponent {

  deletemovie:any;
  constructor(private movieservice:MovieserviceService){

      
  }
  delete(){
    this.movieservice.deleteMovie(this.deletemovie).subscribe({
      next:(res:any)=>{
        alert("delted succesfully");
      }
    });
  }

}
