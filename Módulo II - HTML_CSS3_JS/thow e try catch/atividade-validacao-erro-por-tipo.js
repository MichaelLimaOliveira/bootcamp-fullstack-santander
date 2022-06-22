function tryErrorInArray(array, arraySize){
    if(!array || !arraySize){
        throw ReferenceError('Envie os parametros')
    }
    else if(typeof array !== 'object' || typeof arraySize !== 'number') {
        throw TypeError('array ou numero diferente de obj e number')
    }
    else if (array.length !== arraySize) {
        throw RangeError('Tamanho do array diferente')
    }

    return array
}

function tryCatchError(array, arraySize){
    try {
        tryErrorInArray(array, arraySize)
    } catch (error) {
        if (error instanceof ReferenceError) {
            console.log(error.name + ' : ' + error.message)
        }
        else if (error instanceof TypeError) {
            console.log(error.name + ' : ' + error.message)
        }
        else if (error instanceof RangeError) {
            console.log(error.name + ' : ' + error.message)
        }
    }
}
const myArray = []
const size = 2
tryCatchError(myArray)
