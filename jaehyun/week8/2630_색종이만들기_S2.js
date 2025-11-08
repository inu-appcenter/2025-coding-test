// 문제링크 :https://www.acmicpc.net/problem/2630

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

let blue = 0;
let white = 0;
const N = input[0];
const array = input.slice(1).map((v) => v.split(" ").map(Number));

function recursive(startX, startY, N) {
  if (N === 1) {
    if (array[startY][startX] === 1) {
      blue++;
    } else {
      white++;
    }
    return;
  }

  for (let i = startY; i < startY + N; i++) {
    for (let j = startX; j < startX + N; j++) {
      if (array[startY][startX] !== array[i][j]) {
        const halfN = N / 2;
        recursive(startX, startY, halfN);
        recursive(startX + halfN, startY, halfN);
        recursive(startX, startY + halfN, halfN);
        recursive(startX + halfN, startY + halfN, halfN);
        return;
      }
    }
  }

  if (array[startY][startX] === 1) {
    blue++;
  } else {
    white++;
  }
}

recursive(0, 0, N);

console.log(white);
console.log(blue);
