function checkNumbers(value1, value2) {
    if (!value1 || !value2){
        return 'invalid values'
    }

    let equalsOrDifferent;
    let greaterOrLessThanTen;
    let greaterOrLessThantwenty;
    let sum = value1 + value2;

    (value1 === value2) ?  equalsOrDifferent = " são iguais" : equalsOrDifferent = " não são iguais";
       
    (value1+value2 >10) ? greaterOrLessThanTen = "maior que" : greaterOrLessThanTen = "menor que";
    
    (value1+value2 >20) ? greaterOrLessThantwenty = "maior que" : greaterOrLessThantwenty = "menor que";

    let result = 'Os numeros ' + value1 + ' e '  + value2  +  equalsOrDifferent  + ' iguais. sua soma é ' + sum  + ', que é ' + greaterOrLessThanTen  + ' 10 e ' + greaterOrLessThantwenty + ' 20.';

    return result;                           
}

let value1 = 1;
let value2 = 2;

console.log(checkNumbers(value1, value2))