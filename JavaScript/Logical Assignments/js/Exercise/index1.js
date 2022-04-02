//Q1
   
var fillArray = v => { var arr=Array.from(Array(v)).map(x=>Math.random()); return arr; }
function Q1A(){
    var fourNums = fillArray(4);
    alert(fourNums);
    console.log(fourNums);
}

function Q2A(){
    var hundredNums = new Array(100);
    for(var i=0;i<100;i++){
        hundredNums[i]=Math.floor(Math.random()*100);
    }
    console.log(hundredNums);
}
function Q3A(){
    var Strings =  ["1.2", "2.3", "3.4",];
    // convert to string array to number array 
    var nums = Strings.map(Number);
    console.log(nums);
}

function Q4A(){
    const string = "ababcdababefgababhiab";
    const myArray = string.split("");
    const myS = [];
    var s = "";
    for(i=0;i<myArray.length;i++){
        if((myArray[i]!="a"&& myArray[i]!="b") &&( myArray[i+1]!="b"&& myArray[i+1]!="a") ){
        s = s + myArray[i];
        if(myArray[i+2]=="a" || myArray[i+2]=="b"){
        s = s + myArray[i+1];
        myS[i] = s;
        s="";}
        }
        else
            s=s;
    }
    
    //get the max element in array
    myS.sort(function (a, b) { return b.length - a.length });
    //remove empty elements
    myS.reduce( (el) => { return el != null });
    //console.log(myS);
    console.log(myS[0]);
    alert(myS[0]);
}

function Q5A(){
    var test1 = ["stop", "quit", "exit","q"];
    var q =test1.filter(function (s) { return !s.includes("q") }); 
    // console.log(test1);
    return q;
}
function half(x) {
    return(x / 2);
    }
function Q6B(a ,b ,c){
    
    return((a+b)/c);}
function Q8B(c){
    return((c%2)==0);}
