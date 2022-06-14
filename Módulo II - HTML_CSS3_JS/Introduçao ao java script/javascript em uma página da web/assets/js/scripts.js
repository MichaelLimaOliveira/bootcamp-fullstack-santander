document.getElementById("increment-button").addEventListener("click", IncrementNumber)
document.getElementById("decrement-button").addEventListener("click", DecrementNumber)

var call = document.getElementById("value")
var currentNumber = 0

function changeColorNumber(number){
    if (number <0){
        call.style.color="red";
    }
    else if (number>=0) {
        call.style.color="white";
    }
} 

function IncrementNumber() {
    if(currentNumber < 10) {
        currentNumber += 1
        call.innerHTML = currentNumber 
    }
    changeColorNumber(currentNumber)
}

function DecrementNumber() { 
    if (currentNumber > -10){
        currentNumber -= 1
        call.innerHTML = currentNumber
    }
    changeColorNumber(currentNumber)
}
