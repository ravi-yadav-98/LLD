function clicked(){
    console.log("Button was clicked !!")
}

//onload
window.onload = function()
    {
        console.log("Window is loaded...")
    }


//add event to element using id

firstContainer.addEventListener('click', function(){
    console.log("Click hua")
})

firstContainer.addEventListener('mouseover', function(){
    console.log("mouse on container")
})

firstContainer.addEventListener('mouseout', function(){
    console.log("mouse out of  container")
})

let prevHTML = document.querySelectorAll('.container')[0].innerHTML;
//mouse up and down

firstContainer.addEventListener('mouseup', function(){
    document.querySelectorAll('.container')[0].innerHTML = prevHTML;
    console.log("mouse up")
})


firstContainer.addEventListener('mousedown', function(){
    document.querySelectorAll('.container')[0].innerHTML="<b> We have Clicked </b>"
    console.log("mouse down")
})

//sum function

// function sum(a, b){
//     return a + b;
// }

sum = (a, b)=>{
    return a+b;
}
console.log("sum of a & b: ", sum(2, 10));

//setTime Out -> schedule a function

function logKaro()
{
    console.log("I am your log");
}
setTimeout(logKaro, 2000);
// setInterval(logKaro, 2000);

// clearInterval() -> to stop