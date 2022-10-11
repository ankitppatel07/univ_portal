import { Component, OnInit } from '@angular/core';
import { HomeService } from 'src/app/services/home.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  dataFromAPI : string = '';

  constructor(private homeService : HomeService) { }

  ngOnInit(): void {
    this.homeService.getDataFromAPI().subscribe(
      (data) => {
        console.log("The data from API is:", data);
        this.dataFromAPI = data.testData;
      },
      (err) => {
        console.log("Error fetching data!!!")
      }
    );
  }

}
