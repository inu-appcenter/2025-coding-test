const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" ")
  .map(Number);

const [a, b, c] = input;
const [d, e, f] = input.map(String);

console.log(a + b - c);
console.log(d + e - f);
