
  function checkTime(i) {
    if (i < 10) {i = "0" + i};  // add zero in front of numbers < 10
    return i;
  }
function displaymsg(){
    const t = new Date();
    var n = t.getHours();
    var v = "welcome";
    if(n<4){
       v = "Night <span> Owl</span>";   
    }
    if( n > 4 && n <= 11){
        v = "Good <span>Morning</span>"; 
    }
    if( n > 11 && n <= 15){
        v = "Good <span>AfterNoon</span>"; 
    }
    if( n >15 && n <= 21){
        v =  "Good <span>Evening</span>";
    }
    if( n >21 && n <= 24){
        v =  "Good <span>Evening</span>";
    }
    return v;
}

function start(){
    const today = new Date();
    let h = today.getHours();
    let m = today.getMinutes();
    let s = today.getSeconds();
    let day = today.getDay();
    let date = today.getDate();
    var weekday = ['Sunday', 'Monday', 'Tuesday','Wednesday', 'Thursday', 'Friday', 'Saturday'];
    m = checkTime(m);
    s = checkTime(s);
    var k = displaymsg();
    var n = h+"."+m;
    var month = today.getMonth() + 1;
    setTimeout(start, 1000);
    document.getElementById('welcome-message').innerHTML = k;    // display the date and time
}
