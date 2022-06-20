let numbers = [30, 30, 40, 5, 223, 2049, 3034, 5];

function uniqueValues(array) {
    const onlyNumbers = new Set(array);
    return [...onlyNumbers];
}




console.log(uniqueValues(numbers))