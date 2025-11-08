// 문제링크 : https://www.acmicpc.net/problem/22864

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" ")
  .map(Number);

function Solution([A, B, C, M]) {
  let tired = 0; // 현재 피로도
  let work = 0; // 총 일한 양

  for (let i = 0; i < 24; i++) {
    if (tired + A <= M) {
      tired += A;
      work += B;
    } else {
      // 휴식
      tired = Math.max(0, tired - C);
    }
  }

  return work;
}

console.log(Solution(input));
