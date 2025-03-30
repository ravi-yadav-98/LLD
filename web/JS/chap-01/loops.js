var arr = [12, 13, 15, 17, 19, 99];

console.log(arr);
console.log("Length of arr: ", arr.length)
for (var i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}

arr.forEach(function (ele) {
    console.log(ele)
});

let x = 0;
while (x < 10) {
    console.log(x);
    x++;
}

//constant
const c = 10;
c = c + 2; //error
console.log(c);