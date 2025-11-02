const fs = require("fs");
const path = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(path).toString().trim().split("\n");

const N = Number(input.splice(0, 1));
const M = Number(input.splice(1, 1));

//배열 쪼개기
let arr = input.map((item) => {
  return item.split(" ").map(Number);
});

let standerd = [0];
arr[0].map((item) => {
  standerd[item] = 1;
});

for (let i = 0; i < M; i++) {
  console.log(standerd[arr[1][i]] ? 1 : 0);
}
