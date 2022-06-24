class Animal {
    construtor(type = 'animal') {
        this._type = type;
    }

    get type() {
        return this._type
    }

    set type(val) {
        this._type = val.toUpperCase()
    }

    makeSound() {
        console.log('Making animal sound')
    }
}

class Cat extends Animal {
    construtor() {
        Super('cat')
    }

    makeSound() {
        Super.makeSound()
        console.log('Meow')
    }
}

let dog = new Animal('dog');
console.log(dog.type)

let shimbica = new Cat()
console.log(shimbica.type)