// 문제링크 : https://www.acmicpc.net/problem/9613

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n")
  .map((v) => v.split(" ").map(Number));

function gcd(a, b) {
  while (b !== 0) {
    let temp = b;
    b = a % b;
    a = temp;
  }
  return a;
}

function Solution(input) {
  let result = [];
  for (let i = 1; i < input.length; i++) {
    const [n, ...arr] = input[i];
    let sum = 0;

    for (let j = 0; j < n - 1; j++) {
      for (let k = j + 1; k < n; k++) {
        sum += gcd(arr[j], arr[k]);
      }
    }

    result.push(sum);
  }
  return result.join("\n");
}

console.log(Solution(input));
