const fs = require("fs");
const path = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(path).toString().trim().split("\n").map(Number);

const T = input[0];
const cases = input.slice(1);

let rooms = [
  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14],
  [],
  [],
  [],
  [],
  [],
  [],
  [],
  [],
  [],
  [],
  [],
  [],
  [],
  [],
];

function solution() {
  for (let i = 1; i < 15; i++) {
    rooms[i][0] = rooms[i - 1][0];
    for (let j = 1; j < 14; j++) {
      rooms[i][j] = rooms[i][j - 1] + rooms[i - 1][j];
    }
  }

  for (let i = 0; i < T; i++) {
    const k = cases[i * 2];
    const n = cases[i * 2 + 1];
    console.log(rooms[k][n - 1]);
  }
}

solution();
