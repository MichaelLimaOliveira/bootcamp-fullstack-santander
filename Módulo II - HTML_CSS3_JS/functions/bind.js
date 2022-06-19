var name
this.x = 9; //this aqui se refere ao objeto global "window" do navegado
this.name = 'Caio Fake'; //this aqui se refere ao objeto global "window" do navegado
var module = {
  x: 81,
  name: 'Caio',
  getX: function() { return this.x; },
  getName: function() {return this.name}
};

module.getX(); // 81
module.getName();
console.log(module.getName()); // 'Caio'

var retrieveX = module.getX;
var retrieveName = module.getName;
retrieveX();
console.log(retrieveName());
// retorna 9 - a função foi invocada no escopo global

// Criando uma nova função com 'this' vinculada ao módulo
// Programadores novatos podem confundir a variável x
// global com a propriedade x do módulo
var boundGetX = retrieveX.bind(module);
var boundGetName = retrieveName.bind(module);
boundGetX(); // 81
console.log(boundGetName()); // 'Caio'