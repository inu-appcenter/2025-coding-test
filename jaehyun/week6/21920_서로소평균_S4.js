// 문제링크 : https://www.acmicpc.net/problem/21920

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  const N = input[0];
  const array = input[1].split(" ").map(Number);
  const X = Number(input[2]);
  const resultArray = [];

  for (let i = 0; i < N; i++) {
    if (array[i] < X && gcd(X, array[i]) === 1) {
      resultArray.push(array[i]);
    } else if (array[i] >= X && gcd(array[i], X) === 1) {
      resultArray.push(array[i]);
    }
  }
  return resultArray.reduce((sum, val) => sum + val, 0) / resultArray.length;
}

function gcd(a, b) {
  while (b !== 0) {
    let temp = b;
    b = a % b;
    a = temp;
  }
  return a;
}

console.log(Solution(input));
