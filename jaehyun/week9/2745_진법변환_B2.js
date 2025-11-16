// 문제링크 : https://www.acmicpc.net/problem/2745

const fs = require("fs");
const raw = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" ");

function Solution(input) {
  const str = input[0];
  const base = Number(input[1]);

  const chars = str.split("").reverse();
  let result = 0;

  for (let i = 0; i < chars.length; i++) {
    let ch = chars[i];

    if (ch >= "A" && ch <= "Z") {
      ch = ch.charCodeAt(0) - 55;
      result += ch * Math.pow(base, i);
    } else {
      ch = Number(ch);
      result += ch * Math.pow(base, i);
    }
  }

  return result;
}

console.log(Solution(raw));
