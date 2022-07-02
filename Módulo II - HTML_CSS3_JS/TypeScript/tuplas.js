"use strict";
let pessoa;
pessoa = ['Michael lima', 'Estudante', 28];
console.log(pessoa);
console.log(pessoa[1]);
let listaFrutas = ['maca', 'pera', 'uva', 'banana', 'kaki', 'kiwi', 'laranja', 'tomate'];
console.log(...listaFrutas);
let pessoa2 = ['Michael lima', 'Estudante', 28];
let listaFrutas2 = [5, true, ...listaFrutas];
console.log(listaFrutas2);
function listaDePessoas(nomes, idades) {
    return [...nomes, ...idades];
}
console.log(listaDePessoas(['esteevao', 'alexandre', 'caio', 'augusto', 'antonio', 'michael'], [22, 22, 22, 22, 22, 28]));
function criarPessoa(...nome) {
    return [...nome];
}
console.log(criarPessoa('michael', 'lima', 'oliveira'));
var Idioma;
(function (Idioma) {
    Idioma[Idioma["Prtugues"] = 0] = "Prtugues";
    Idioma[Idioma["Ingles"] = 1] = "Ingles";
    Idioma[Idioma["Espanhol"] = 2] = "Espanhol";
    Idioma[Idioma["Frances"] = 3] = "Frances";
})(Idioma || (Idioma = {}));
var Idioma2;
(function (Idioma2) {
    Idioma2["Prtugues"] = "Pt-Br";
    Idioma2["Ingles"] = "En";
    Idioma2["Espanhol"] = "Es";
    Idioma2["Frances"] = "Fr";
})(Idioma2 || (Idioma2 = {}));
console.log(Idioma);
console.log(Idioma2.Prtugues);
