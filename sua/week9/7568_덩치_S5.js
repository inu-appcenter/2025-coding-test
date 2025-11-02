const fs = require("fs");
const path = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(path).toString().trim().split("\n");

//console.log(input); // split 기준으로 나누어진 리스트
let N = Number(input.shift()); // count of people

//배열 쪼개기
let arr = input.map((item) => {
  return item.split(" ").map(Number);
});

//
for (let i = 0; i < N; i++) {
  let rank = 1;
  for (let j = 0; j < N; j++) {
    if (i === j) continue;
    if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank += 1;
  }
  arr[i][2] = rank;
}

for (let i = 0; i < N; i++) {
  console.log(arr[i][2]);
}
