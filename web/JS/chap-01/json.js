//JSON : Javascript object notation
//double Quotes


obj = {name:"Ravi", length:1};
console.log(typeof obj)
js = JSON.stringify(obj)
console.log(typeof js)
console.log(js);

parsed = JSON.parse(js)
console.log(typeof parsed)
console.log(parsed)

//backticks
a =100;
console.log(`I have ${a} ruppes`);