// https://www.acmicpc.net/problem/21758

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  const N = Number(input[0]);
  const honey = input[1].split(" ").map(Number);

  // 누적합 배열 생성
  const prefixHoney = Array(N).fill(0);
  prefixHoney[0] = honey[0];
  for (let i = 1; i < N; i++) {
    prefixHoney[i] = prefixHoney[i - 1] + honey[i];
  }

  let maxHoney = 0;

  // 1. 벌통이 오른쪽 끝에 있을 때 (벌 두 마리 모두 왼쪽에 위치)
  for (let i = 1; i < N - 1; i++) {
    const firstBee = prefixHoney[N - 1] - honey[0] - honey[i]; // 벌1: 0번 시작
    const secondBee = prefixHoney[N - 1] - prefixHoney[i]; // 벌2: i번 시작
    maxHoney = Math.max(maxHoney, firstBee + secondBee);
  }

  // 2. 벌통이 왼쪽 끝에 있을 때 (벌 두 마리 모두 오른쪽에 위치)
  for (let i = N - 2; i > 0; i--) {
    const firstBee = prefixHoney[N - 2] - honey[i]; // 벌1: N-1번 시작
    const secondBee = prefixHoney[i] - honey[i]; // 벌2: i번 시작
    maxHoney = Math.max(maxHoney, firstBee + secondBee);
  }

  // 3. 벌통이 중간에 있을 때 (벌이 양 끝에 위치)
  for (let i = 1; i < N - 1; i++) {
    const firstBee = prefixHoney[i] - honey[0]; // 왼쪽 벌 (0번 시작)
    const secondBee = prefixHoney[N - 2] - prefixHoney[i - 1]; // 오른쪽 벌 (N-1번 시작)
    maxHoney = Math.max(maxHoney, firstBee + secondBee);
  }

  return maxHoney;
}

console.log(Solution(input));
