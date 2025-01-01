import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class MovieserviceService {

  constructor(private http :HttpClient) { 

  }

  
  movieList(){
      return this.http.get('http://localhost:8080/movies/all')   
  }

  addMovie(moviedata:any){
    return this.http.post('http://localhost:8080/movies',moviedata)
  }

  updateMovie(name:any,updateddata:any){
    return this.http.put(`http://localhost:8080/movies/update/${name}`,updateddata)
  }

  deleteMovie(name:any)
  {
    return this.http.delete(`http://localhost:8080/delete/${name}`)
  }

}
