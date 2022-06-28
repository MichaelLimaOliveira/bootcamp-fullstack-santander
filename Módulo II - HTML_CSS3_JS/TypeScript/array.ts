let frutas: string[] = ['abacaxi', 'maca', 'laranja', 'pera', 'melancia'];
console.log(frutas[1]);

let objFrutas: Array<string> = ['abacaxi', 'maca', 'laranja', 'pera', 'melancia'];
console.log(objFrutas[4]);

objFrutas = [...objFrutas, 'banada', 'tomate', 'uva']

console.log(objFrutas)

function retornaFrutas(frutas: Array<string>) {
    for (let i = 0; i < frutas.length; i++) {
        console.log(frutas[i]);
    }
}

retornaFrutas(objFrutas)