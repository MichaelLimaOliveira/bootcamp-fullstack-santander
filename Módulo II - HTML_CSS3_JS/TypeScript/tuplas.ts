let pessoa: [string, string, number];
pessoa = ['Michael lima', 'Estudante', 28]

console.log(pessoa);
console.log(pessoa[1]);

let listaFrutas: [string, ...string[]] = ['maca', 'pera', 'uva', 'banana', 'kaki', 'kiwi', 'laranja', 'tomate']
console.log(...listaFrutas);

let pessoa2: [name: string, ocupation: string, age: number] = ['Michael lima', 'Estudante', 28];

let listaFrutas2: [number, boolean, ...string[]] = [5, true, ...listaFrutas];

console.log(listaFrutas2)

function listaDePessoas(nomes: string[], idades: number[]) {
    return [...nomes, ...idades]
}

console.log(listaDePessoas(['esteevao', 'alexandre', 'caio', 'augusto', 'antonio', 'michael'], [22, 22, 22, 22, 22, 28]));

type Nome = 
        | [primeiroNome: string, sobrenome: string]
        | [primeiroNome: string, nomeDoMeio: string, ultimoNome: string]
        | [age: number, name: string, ocupation: boolean]

function criarPessoa(...nome: Nome) {
    return [...nome]
}

console.log(criarPessoa('michael', 'lima', 'oliveira'))

enum Idioma {
    Prtugues,
    Ingles,
    Espanhol,
    Frances
}


enum Idioma2 {
    Prtugues = 'Pt-Br',
    Ingles = 'En',
    Espanhol = 'Es',
    Frances = 'Fr'
}

console.log(Idioma)
console.log(Idioma2.Prtugues)