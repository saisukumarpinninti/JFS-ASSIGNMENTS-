const isEven = (num) => num % 2 == 0; 
let arr=[1,3,5,4,2];
const Sqr = (num) => num * num;
var resarr = [];
function find(arr, func) {
    if(func(arr.slice(0,1))){return arr.slice(0,1);}
    else{
    arr= arr.slice(1,(arr.length));
    return find(arr,func);
    }
}
function map(arr,fun){
    if(arr.length==0){
        return resarr;}
    else{
    resarr.push(fun(arr.slice(0,1)))
    console.log(resarr);
    arr= arr.slice(1,(arr.length));
    return map(arr,fun);
    }
}
function Q1(){
    document.getElementById("hello").innerHTML = `The Orginal array is : <br>[${arr}] <br> and the result of find(arr, isEven) is : <br> [${find(arr, isEven)}]`;
}
function Q2(){
    document.getElementById("hello").innerHTML = `The Orginal array is : <br>[${arr}] <br> and the result of map(arr, Sqr) is : <br> [${map(arr, Sqr)}]`;
}
var Q3=function(a,b){return a*b;}
console.log(Q3);