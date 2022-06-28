let nome: string = 'maria';
let age: number = 45;
let maried: boolean = true;

let animals: string[] = ['Macaco', 'NFT', 'Estevao', 'Viado', 'Dev', 'Alexandre'];

let cars: {
    nome: string,
    ano: number,
    price: number
};

cars = {nome: 'marea', ano: 2019, price: 80000};


function dividirNumeros(num1: number, num2: number){
    return num1 / num2;
}

console.log(cars);
console.log(dividirNumeros(10,5))
