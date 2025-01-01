import { Component } from '@angular/core';
import { MovieserviceService } from '../services/movieservice.service';

@Component({
  selector: 'app-updatemovie',
  templateUrl: './updatemovie.component.html',
  styleUrls: ['./updatemovie.component.css']
})
export class UpdatemovieComponent {

  updatedata :any ={movie_id:'',name:'',genere:'',review:'',budget:'',ticket_price:''};

  constructor(private movieservice: MovieserviceService){
    
  }

  update(){

  this.movieservice.updateMovie(this.updatedata.name, this.updatedata).subscribe({

    next:(res:any)=>{
        alert("updated successfully");
    }
  });
}
}
