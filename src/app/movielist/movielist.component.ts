import { Component, OnInit } from '@angular/core';
import { MovieserviceService } from '../services/movieservice.service';

@Component({
  selector: 'app-movielist',
  templateUrl: './movielist.component.html',
  styleUrls: ['./movielist.component.css']
})
export class MovielistComponent implements OnInit{
  getData=[];
  constructor(private movieservice: MovieserviceService){


  }
  ngOnInit():void{

    
    this.movieservice.movieList().subscribe({

      next:(httpresponse:any)=>{
        this.getData=httpresponse;
      }
    })
  }
  
  
}
