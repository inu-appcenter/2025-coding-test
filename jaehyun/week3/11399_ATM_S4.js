// https://www.acmicpc.net/problem/11399

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  let result = 0;
  const array = input[1]
    .split(" ")
    .map(Number)
    .sort((a, b) => {
      return b - a;
    });

  for (let i = 0; i < input[0]; i++) {
    result += array[i] * (i + 1);
  }
  return result;
}

console.log(Solution(input));
