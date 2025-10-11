// 문제링크 : https://www.acmicpc.net/problem/13458

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  const [n, people, supervisor] = input;
  const [b, c] = supervisor.split(" ").map(Number);
  const a = people.split(" ").map(Number);

  let result = 0;
  for (let i = 0; i < n; i++) {
    const admin = Math.floor((a[i] - b) / c);
    if (a[i] <= b) {
      result += 1;
    } else {
      result += (a[i] - b) % c === 0 ? admin + 1 : admin + 2;
    }
  }

  return result;
}

console.log(Solution(input));
