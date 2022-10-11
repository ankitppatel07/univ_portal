import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs'

const dataEndpointUrl = "http://localhost:8080/home"

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  constructor(private http: HttpClient) { }

  getDataFromAPI(): Observable<any> {
    return this.http.get<any>(dataEndpointUrl);
  }


}
