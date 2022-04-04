function calc(operation,num1,num2){

    return eval(num1+operation+num2);

}
function getnum1(){
    var num1 = prompt("Enter The First Number");
    return num1;
}
function getnum2(){
    var num2 = prompt("Enter The Second Number");
    return num2;
}
function Q3(){
    var opt = prompt("Enter The Number For Operation \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n4. Division \n 5. Exponent \n 6. Mean \n 7.Quit");
    while(opt!=7){
        switch(opt){
            case "1":
                var num1 = getnum1();
                var num2 = getnum2();
                alert("The Addition Of "+num1+" and "+num2+" is "+calc("+",num1,num2));
                break;

            case "2":
                var num1 = getnum1();
                var num2 = getnum2();
                alert("The Subtraction Of "+num1+" and "+num2+" is "+calc("-",num1,num2));
                break;

            case "3":
                var num1 = getnum1();
                var num2 = getnum2();
                alert("The Multiplication Of "+num1+" and "+num2+" is "+calc("*",num1,num2)); 
                break;

            case "4":
                var num1 = getnum1();
                var num2 = getnum2();
                alert("The Division Of "+num1+" and "+num2+" is "+calc("/",num1,num2));  
                break;

            case "5":
                var num1 = getnum1();
                var num2 = getnum2();
                alert("The Exponent Of "+num1+" and "+num2+" is "+calc("**",num1,num2));
                break;

            case "6":
                var num1 = getnum1();
                var num = num1;
                var sum = 0 ;
                while (num) {
                    sum += num % 10;
                    num = Math.floor(num / 10);
                }
                alert("The Mean Of "+num1+"  is "+calc("/",num1.length,sum));
                break;
            default:
                alert("Invalid Option");
                break;
        }
        opt = prompt("Enter The Number For Operation \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n4. Division \n 5. Exponent \n 6. Mean \n 7.Quit");
    }
}
