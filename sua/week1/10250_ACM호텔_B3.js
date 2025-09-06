const fs = require("fs");
const path = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(path).toString().trim().split(/\s+/).map(Number);

let T = input[0]; // test data number

function solution(H, W, N) {
  let floor = N % H === 0 ? H : N % H;
  let room = Math.ceil(N / H);
  console.log(`${floor}${room.toString().padStart(2, "0")}`);
}

let idx = 1;
while (T--) {
  const [H, W, N] = [input[idx], input[idx + 1], input[idx + 2]];
  solution(H, W, N);
  idx += 3;
}
