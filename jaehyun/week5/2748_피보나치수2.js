// 문제링크 : https://www.acmicpc.net/problem/24417

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  const X = +input[0];
  let dp = new Array(91).fill(null);
  dp[0] = 0n;
  dp[1] = 1n;

  for (let i = 2; i <= X; i++) {
    dp[i] = dp[i - 1] + dp[i - 2];
  }

  return String(dp[X]);
}

console.log(Solution(input));
