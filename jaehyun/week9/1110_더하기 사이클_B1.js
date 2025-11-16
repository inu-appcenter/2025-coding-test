const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" ")
  .map(Number);

function Solution(input) {
  let n = input[0];
  let num = n;
  let count = 0;

  while (true) {
    count++;

    const tens = Math.floor(num / 10);
    const ones = num % 10;
    const sum = tens + ones;

    num = ones * 10 + (sum % 10);

    if (num === n) break;
  }

  return count;
}

console.log(Solution(input));
