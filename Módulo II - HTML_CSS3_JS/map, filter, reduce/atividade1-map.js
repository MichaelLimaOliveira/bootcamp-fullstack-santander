const apple = {
    value: 2
}

const orange = {
    value: 3
}

function mapThis(array, thisArg) {
    return array.map(function(item){
       return item * this.value;
    }, thisArg);
}

const array = [1, 2, 3]

console.log('this apple ' + mapThis(array, apple))

console.log('this orange ' + mapThis(array, orange))
