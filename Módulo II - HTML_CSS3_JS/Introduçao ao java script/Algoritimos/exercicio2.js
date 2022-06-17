function changeEvenNumberToZero(array) {
    if (!array) return -1

    for(let i = 0; i < array.length; i++) {
        if(array[i] % 2 === 0) {
            array[i] = 0
        }
    }
    return array
}

let array = [0, 2, 3, 5, 4, 6, 8]

console.log(changeEvenNumberToZero(array))