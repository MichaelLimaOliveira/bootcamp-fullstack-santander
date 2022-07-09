import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  count: number = 0;
  nome: string = 'Michael Lima de Oliveira';
  text: string = ''; 

  pessoas = [
    {
      nome: "Michael",
      sobrenome: "Lima"
    },
    {
      nome: "Estevão",
      sobrenome: "Alves"
    },
    {
      nome: "Alexandre",
      sobrenome: "Queiroz"
    },
    {
      nome: "Augusto",
      sobrenome: "Kaic"
    }
  ];

  animais = [
    {
      race: 'Baleia'
    },
    {
      race: 'dog'
    },
    {
      race: 'cat'
    },
    {
      race: 'chinchila'
    }
  ];

  constructor() {

  }
  ngOnInit() {
    let interval = setInterval(() => {
      this.count++;
      if(this.count === 10) {
        clearInterval(interval);
      }
    }, 1000);
  }

  clicou(nome: string):void {
    console.log(`Quem Clicou foi : ${nome}`);
  }
  
}
