// 문제링크 : https://www.acmicpc.net/problem/5618

const fs = require("fs");
const raw = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(raw) {
  const n = Number(raw[0]);
  const data = raw[1]
    .split(" ")
    .map(Number)
    .sort((a, b) => a - b);

  let arrays = [];

  // 각 숫자의 약수 배열 만들기
  for (let i = 0; i < n; i++) {
    let arr = [];
    for (let j = 1; j <= data[i]; j++) {
      if (data[i] % j === 0) arr.push(j);
    }
    arrays.push(arr);
  }

  let result = arrays[0];

  for (let i = 0; i < arrays.length - 1; i++) {
    const temp = arrays[i].filter((x) => arrays[i + 1].includes(x));
    result = result.filter((x) => temp.includes(x));
  }

  return result.join("\n");
}

console.log(Solution(raw));
