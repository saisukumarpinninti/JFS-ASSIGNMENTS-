const double= function(x) { return x * 2;};
const square = x => x * x;
const isEven = x => x % 2 === 0;
var arr = [9, 3, 5, 4, 2];

function composedValue(f1,f2,f){
    return(f1(f2(f)));
}
function Q1(){
    alert(composedValue(square,double,parseInt(prompt ('enter the Number'))));
}
function Q2(form){
   var m1 = form.m1.value;
    var m2 = form.m2.value;
    var n = parseInt(form.f.value);
    if(m1=='square' && m2=='double'){
        var result = composedValue(square,double,n);}
    else if(m1=='square' && m2=='square'){
        var result = composedValue(square,square,n);}
    else if(m1=='double' && m2=='double'){
        var result = composedValue(double,double,n);}
    else if(m1=='double' && m2=='square'){
        var result = composedValue(double,square,n);}
    else 
        alert('invalid input');
     document.getElementById('hello').innerHTML = `The result of composedvalue of ${m1}(${m2}(${n})) is ` + result;
}
function Q3(){
    var i = 0;
    while(i<arr.length){
        if(isEven(arr[i])){
            var even = arr[i];
            break;
        }
        i++;
    }
    document.getElementById('hello').innerHTML = `The even number is ${even}`;
}