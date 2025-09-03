// 정수 A -> B로 변경
// 변경하는 법 : 곱하기 2 or 숫자 가장 오른쪽에 1 추가
// 첫째 줄에 A, B (1 ≤ A < B ≤ 109)가 주어진다.
// 못만들면 -1 출력 / 만들 수 있다면 변화한 횟수 출력

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" ")
  .map(Number);

let [A, B] = input;

function solution(A, B) {
  let count = 1; // B를 A로 바꾸는 과정의 횟수 (처음 포함)

  while (B > A) {
    if (B % 10 === 1) {
      // 끝자리가 1이면 1 제거
      B = Math.floor(B / 10);
    } else if (B % 2 === 0) {
      // 짝수면 2로 나누기
      B = B / 2;
    } else {
      return -1;
    }
    count++;
  }

  return B === A ? count : -1;
}

console.log(solution(A, B));
