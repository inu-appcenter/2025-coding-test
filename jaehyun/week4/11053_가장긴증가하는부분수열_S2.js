// 문제링크 : https://www.acmicpc.net/problem/11053

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

// function Solution(input) {
//   const N = input[0];
//   const array = input[1].split(" ").map(Number);
//   const dp = [array[0]];
//   for (let i = 1; i < N; i++) {
//     if (dp[i - 1] <= array[i]) {
//       dp.push(array[i]);
//     } else {
//       dp.push(dp[i - 1]);
//     }
//   }
//   const set = new Set(dp);

//   return [...set].length;
// }

function Solution(input) {
  const N = Number(input[0]);
  const arr = input[1].split(" ").map(Number);
  const dp = Array(N).fill(1); // 초기값: 자기 자신만 있을 때 길이 = 1

  for (let i = 0; i < N; i++) {
    for (let j = 0; j < i; j++) {
      if (arr[j] < arr[i]) {
        dp[i] = Math.max(dp[i], dp[j] + 1);
      }
    }
  }

  return Math.max(...dp);
}

console.log(Solution(input));
