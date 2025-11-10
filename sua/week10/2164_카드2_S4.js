const fs = require("fs");
const path = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(path).toString().trim().split("\n");

const N = Number(input);
let arr = [];
for (let i = 1; i < N + 1; i++) {
  arr.push(i);
}

let s = 0;
let e = N - 1;
while (e - s > 1) {
  s++; //카드 버리기
  arr.push(arr[s]);
  e++;
  s++; //카드 뒤로 옮기기
}
console.log(arr[e]);
