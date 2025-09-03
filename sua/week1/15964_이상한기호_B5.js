const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" ")
  .map(Number);

let [a, b] = input;

function solution(a, b) {
  return (a + b) * (a - b);
}

console.log(solution(a, b));
