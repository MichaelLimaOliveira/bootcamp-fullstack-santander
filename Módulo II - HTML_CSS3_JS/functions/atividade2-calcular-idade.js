function calcularIdade(years) {
    return `Daqui a ${years} anos, ${this.name} terá ${this.age + years} anos de idade.`;
}


const persons = {
    name: 'Augusto',
    age: 22
}

const animal = {
    name: 'Zeus',
    age: 8,
    race: 'Shi tsu'
}

console.log(calcularIdade.call(persons, 10))
console.log(calcularIdade.apply(animal, [10]))

function minhaFunçao (num = 0) {
    return num;
}

console.log(minhaFunçao())
