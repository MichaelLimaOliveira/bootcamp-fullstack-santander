"use strict";
let frutas = ['abacaxi', 'maca', 'laranja', 'pera', 'melancia'];
console.log(frutas[1]);
let objFrutas = ['abacaxi', 'maca', 'laranja', 'pera', 'melancia'];
console.log(objFrutas[4]);
objFrutas = [...objFrutas, 'banada', 'tomate', 'uva'];
console.log(objFrutas);
function retornaFrutas(frutas) {
    for (let i = 0; i < frutas.length; i++) {
        console.log(frutas[i]);
    }
}
retornaFrutas(objFrutas);
