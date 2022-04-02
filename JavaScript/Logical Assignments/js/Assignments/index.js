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