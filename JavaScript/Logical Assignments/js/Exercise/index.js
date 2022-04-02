//checks if the number is even or odd
const checkEvenOdd = number => (number % 2  == 0) ? "even" : "odd";

//get the max number 
const Getmax = (a,b,c) => (a>b && a>c) ? a : (b>c) ? b : c;
//flips the coin and returns the number of heads and tails in array format
function flipCoin(n){
    var heads = 0;
    var tails = 0;
    for(var i=0;i<n;i++){
        var v= Math.random();
        if(v<0.5){
            heads++;
        }else{
            tails++;
        }
    }
    return [heads,tails];
}

//repates a String n times
function repeatStringNumTimes(string, times) {
    var repeatedString = "";
    while (times > 0) {
      repeatedString += string;
      times--;
    }
    return repeatedString;
  }
  
  const rollDice = () => Math.floor(Math.random() * 6) + 1;
// Q1
function Q1 (){
    var v= parseInt(prompt('Enter The Number to check even or odd'));
    alert(checkEvenOdd(v));
}
// Q2
function Q2 (){
    alert("get max of 3 numbers");
    var v= parseInt(prompt('Enter The 1stNumber'));
    var v1= parseInt(prompt('Enter The 2ndNumber'));
    var v2= parseInt(prompt('Enter The 3rdNumber'));
    alert(Getmax(v1,v2,v));
}
// code to filp a coin 
function Q3 (){
    var v= parseInt(prompt('Enter The Number Of Times You Want To Flip The Coin'));
    alert("numberof heads is :"+flipCoin(v)[0]+"\n"+"numberof tails is :"+flipCoin(v)[1]);
}

//Q4  function that  returns the fraction that were heads.
function Q4 (){
    var v= parseInt(prompt('Enter The Number times to flip the coin'));
    alert(flipCoin(v)[0]/v);
}
//Q5
function Q5(){
    var v = parseInt(prompt('Enter The Number of times to repeat the string'));
    var s = prompt ('Enter The String');
    alert(repeatStringNumTimes(s,v));
}
//q6 
function Q6(){
    var d =rollDice();
    var c = Math.round(d*(5/6));
    alert("number of times you have to roll a die to get a 6 : "+c+"\n"+"The Dice Number is : "+d);
}
// q7
// function Q7(){
//      let A = ["Have a GOOD day!"," Have a BAD day!"]; 
//     alert(A[Math.floor(Math.random() * A.length)]);
// }