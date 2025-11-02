// 문제링크 : https://www.acmicpc.net/problem/1037

const fs = require("fs");

const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

const n = Number(input[0]);
const divisors = input[1].split(" ").map(Number);

const min = Math.min(...divisors);
const max = Math.max(...divisors);

console.log(min * max);
