// 문제링크 : https://www.acmicpc.net/problem/1912

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  const N = input[0];
  const array = input[1].split(" ").map(Number);
  const dp = [array[0]];
  for (let i = 1; i < N; i++) {
    if (dp[i - 1] >= 0) {
      dp.push(dp[i - 1] + array[i]);
    } else if (dp[i - 1] < 0) {
      dp.push(array[i]);
    }
  }
  return Math.max(...dp);
}

console.log(Solution(input));
