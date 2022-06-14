console.log("Hello world!")

function ReturnEvenNumbers(array) {
    var evenNumbers = []
    for(let i = 0; i<array.length; i++){
       if(array[i] % 2 === 0) {
            evenNumbers.push(array[i]);
       }
        
    }
    console.log(evenNumbers)
}

var array = [1, 2, 3, 4, 5, 6]

ReturnEvenNumbers(array)