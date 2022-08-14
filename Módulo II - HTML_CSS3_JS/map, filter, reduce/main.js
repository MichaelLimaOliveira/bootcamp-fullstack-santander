const resultado = document.getElementById("exibe_resultado");

function sum (n1, n2) {
    let result = n1 + n2;
    resultado.innerHTML = 'Resultado do Calculo: ' + result;
}

function sub (n1, n2) {
    let result = n1 - n2;
    resultado.innerHTML = 'Resultado do Calculo: ' + result;
}

function div (n1, n2) {
    let result = n1 / n2;
    resultado.innerHTML = 'Resultado do Calculo: ' + result;
}

function mult (n1, n2) {
    let result = n1 * n2;
    resultado.innerHTML = 'Resultado do Calculo: ' + result;
}

function calcular() {
    const checkbox = document.getElementsByName('calculo');
    const num1 = document.getElementById("numero_1").value;
    const num2 = document.getElementById("numero_2").value;

    let operador;

    for(var i = 0; i < checkbox.length; i++) {
        if(checkbox[i].checked)
          operador = checkbox[i]
    }


    switch(operador.value) {
        case "div":
            div(num1, num2);
            break;
        case "som":
            sum(num1, num2);
            break;
        case "sub":
            sub(num1, num2);
            break;        
        case "mult":
            mult(num1, num2);
            break;
        default:
            resultado.innerHTML = 'Resultado do Calculo: ' + 'CHECK BOX NOT MARKED'
            break;
    }
}
