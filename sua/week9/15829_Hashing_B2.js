const fs = require("fs");
const path = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(path).toString().trim().split("\n");

let T = Number(input[0]); // length of string
// console.log("a".charCodeAt());

let idx = 0;
let sum = 0;
let r = 1;
while (T--) {
  sum += ((input[1][idx].charCodeAt() - "a".charCodeAt() + 1) * r) % 1234567891;
  //   console.log(double);
  r = (r * 31) % 1234567891;
  idx++;
}

console.log(sum % 1234567891);
