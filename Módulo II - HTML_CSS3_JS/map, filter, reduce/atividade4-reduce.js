function sumAllNumberInArray(array){
    const result = array.reduce(function (previous, current) {
        console.log({previous})
        console.log({current})
        return previous + current

    },0)
    
    return result
}
const array = [10, 5, 5, 10]

console.log(sumAllNumberInArray(array))