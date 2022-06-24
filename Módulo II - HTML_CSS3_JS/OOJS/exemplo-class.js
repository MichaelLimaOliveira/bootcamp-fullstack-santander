var Meal = function(food) {
    this.food = food
}

Meal.prototype.eat = function() {
    return ':p'
}

class MealTwo { 
    constructor (food) {
        this.food = food
    }

    eat() {
        return ':p'
    }
}

const gatooo = new Meal()
const gatooo2 = new Meal()
console.log(gatooo.eat())
console.log(gatooo2.eat())

gatooo2.food = 'rice'

console.log(gatooo2.food)
console.log(gatooo.food)