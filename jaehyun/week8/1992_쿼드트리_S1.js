// 문제링크 : https://www.acmicpc.net/problem/1992

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

const N = Number(input[0]);
const array = input.slice(1).map((v) => v.split("").map(Number));
const result = [];

function recursive(startX, startY, N) {
  const first = array[startY][startX];
  let isSame = true;

  for (let i = startY; i < startY + N; i++) {
    for (let j = startX; j < startX + N; j++) {
      if (array[i][j] !== first) {
        isSame = false;
        break;
      }
    }
    if (!isSame) break;
  }

  if (isSame) {
    result.push(first);
    return;
  }

  const half = N / 2;
  result.push("(");
  recursive(startX, startY, half); // 왼쪽 위
  recursive(startX + half, startY, half); // 오른쪽 위
  recursive(startX, startY + half, half); // 왼쪽 아래
  recursive(startX + half, startY + half, half); // 오른쪽 아래
  result.push(")");
}

recursive(0, 0, N);
console.log(result.join(""));
