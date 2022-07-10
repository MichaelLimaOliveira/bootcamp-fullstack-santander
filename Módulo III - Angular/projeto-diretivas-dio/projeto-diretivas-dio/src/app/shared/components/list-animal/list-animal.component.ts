import { Component, OnInit } from '@angular/core';
import { AnimalService } from '../../services/animal.service';

@Component({
  selector: 'app-list-animal',
  templateUrl: './list-animal.component.html',
  styleUrls: ['./list-animal.component.css']
})
export class ListanimalComponent implements OnInit {

  animais = [
    {
      race: '',
      name: ''
    }
	];

  constructor(private animalService: AnimalService) { }

  ngOnInit(): void {
    this.loadAnimal();
  }

  loadAnimal() {
    this.animalService.getAnimal().subscribe((animal) => {
      this.animais = animal;
    });
  }
}
