import { Component, OnInit } from '@angular/core';
import { MovieserviceService } from '../services/movieservice.service';

@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent {

  add :any ={movie_id:'',name:'',genere:'',review:'',budget:'',ticket_price:''};
  constructor(private movieservice : MovieserviceService){

    
  }
  addMovie(): void {

    this.movieservice.addMovie(this.add).subscribe({

      next:(response:any)=>{

        alert("added successfully");
      }
    })

  }
}
