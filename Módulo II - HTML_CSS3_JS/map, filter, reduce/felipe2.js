function calcular(){
    let array = document.getElementsByName("calculo");
    var calculo = 0;

    for(var i = 0; i < array.length; i++) {
      if(array[i].checked)
        calculo = array[i]
    }

    if(calculo == 0){ 
      alert("selecione um calculo"); 
     return 0;
    }

   if(calculo.value == "div") {
         var div = 0;
         var resultado = document.getElementById("exibe_resultado")
         var numero_1 = document.getElementById("numero_1").value;
         var numero_2 = document.getElementById("numero_2").value;
         div = numero_1 / numero_2;
         resultado.innerHTML = ("Resultado do Calculo: "+ div);
       } 

   if(calculo.value == "som") {
     var div = 0;
     var resultado = document.getElementById("exibe_resultado")
     var numero_1 = document.getElementById("numero_1").value;
     var numero_2 = document.getElementById("numero_2").value;
     div = parseInt(numero_1) + parseInt(numero_2);
     resultado.innerHTML = ("Resultado do Calculo: "+ div)
   }

   if(calculo.value == "sub") {
     var div = 0;
     var resultado = document.getElementById("exibe_resultado")
     var numero_1 = document.getElementById("numero_1").value;
     var numero_2 = document.getElementById("numero_2").value;
     div = numero_1 - numero_2;
     resultado.innerHTML = ("Resultado do Calculo: "+ div);
   }

   if(calculo.value == "mult") {
     var div = 0;
     var resultado = document.getElementById("exibe_resultado")
     var numero_1 = document.getElementById("numero_1").value;
     var numero_2 = document.getElementById("numero_2").value;
     div = numero_1 * numero_2;
     resultado.innerHTML = ("Resultado do Calculo: "+ div);
   }
}