function restParameterFunction(x, y) {
    var a = Array.prototype.slice.call(arguments, 2);
    return (x + y) * a.length;
}

console.log(restParameterFunction(1, 2, 'hello', true, 7));

let [x, y] = ['a', 'b'];

[x, y] = [y, x];

let obj = {x, y};
console.log(obj);