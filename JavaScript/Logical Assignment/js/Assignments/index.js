//function that retunrs the celsius value of the fahrenheit
const celsius=(fahrenheit) => {
    return (fahrenheit - 32) * 5 / 9;
}

function Q1(form) {
    const fahrenheit = form.f.value;
    const c = celsius(fahrenheit);
    console.log(`The temperature in celsius is ${c}`);
    document.getElementById("hello").innerHTML = `The temperature in celsius is ${c}&degC`  ;
}
function Q2(){
    var result = "";
    var i = 0;
    while(i < 3){
    var value = parseInt(prompt("Enter a number between 1 and 30"));
    if(value >= 1 && value <= 30){
        result += "<br>" + "*".repeat(value);
        i++;
    }
    else{
        alert("Invalid input");
    }}
    document.getElementById("hello").innerHTML = result;
}

function Q3(){
    var result = "<table>";
    var i = 1;
    var j = 0;
    var rows = parseInt(prompt("Enter the number of rows"));
    var cols = parseInt(prompt("Enter the number of columns"));
    var tr = "<tr>";
    var td = "<td>lorem</td>";
    var tr2 = "</tr>";
    result += tr;
    while(i<=cols){
        result +=  "<th> col"+i+"</th>" ;
        i++;
    }
    result += tr2;
    while(j <= rows){
        result += tr+td.repeat(cols)+tr2;
        j++;
    }
    result += "</table>";
    console.log(result);
    document.getElementById("hello").innerHTML = result;
}