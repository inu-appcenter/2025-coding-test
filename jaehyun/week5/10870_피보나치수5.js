// 문제링크 : https://www.acmicpc.net/problem/10870

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(n) {
  if (n == 0) return 0;
  else if (n == 1) return 1;
  else return Solution(n - 1) + Solution(n - 2);
}

console.log(Solution(input));
