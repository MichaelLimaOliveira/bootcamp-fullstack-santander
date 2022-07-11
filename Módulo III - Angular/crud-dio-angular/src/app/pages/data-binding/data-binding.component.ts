import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
  name = 'Michael Lima';
  imageUrl = 'https://picsum.photos/300/300';
  imageDescription = 'essa é uma imagen';
  buttonText = 'Clique aki';
  textRed = true;
  backgroundColor = 'green';
  fontSize = '20px';
  widthImg = 600;
  textInput = '';
  numberIncrement: number = 0
  destroy = false;

  constructor() { }

  ngOnInit(): void {
  }

  returnName() {
    return this.name;
  }

  click(input: string) {
    this.name = 'Estevão Alves';
    console.log('clicou aqui');
  }

  clicouNoFilho(text: any) {
    console.log(text)
  }

  increment() {
    this.numberIncrement++;
  }

  destroyComponent() {
    this.destroy = true;
  }
}
