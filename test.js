var arr=[1,2,3,4,5,6,7];
arr.pop();
console.log(arr);
arr.shift();
console.log(arr);
arr.reverse();
console.log(arr);

var x=9;
x=x>>2;
x=x<<2;
x=x^3;
console.log(x);
document.writeln(x);

console.log("before"+typeof tfunction);
function tfunction(I){}
console.log("after"+typeof tfunction);

var total=0;
for(var x=1;x<5;x=x<<1){
    total+=x;
}
console.log(total);

a=typeof new Number(0);
console.log(a);