// 문제링크 : https://www.acmicpc.net/problem/17829

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  const N = input[0];
  const originalMatrix = input.slice(1).map((v) => v.split(" ").map(Number));
  return Pooling(originalMatrix);
}

function Pooling(matrix) {
  const smallMatrix = [];
  const resultMatrix = [];
  if (matrix.length === 2) {
    const arr = matrix.flat().sort((a, b) => b - a);
    return arr[1];
  }

  const nextMatrix = [];
  for (let i = 0; i < matrix.length; i += 2) {
    const row = [];
    for (let j = 0; j < matrix.length; j += 2) {
      const arr = [matrix[i][j], matrix[i][j + 1], matrix[i + 1][j], matrix[i + 1][j + 1]].sort((a, b) => b - a);
      row.push(arr[1]);
    }
    nextMatrix.push(row);
  }
  return Pooling(nextMatrix);
}

console.log(Solution(input));
