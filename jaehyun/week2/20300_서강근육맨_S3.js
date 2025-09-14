const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  const machines = Number(input[0]);
  const losses = input[1]
    .split(" ")
    .map(BigInt)
    .sort((a, b) => (a < b ? -1 : a > b ? 1 : 0));

  let answer = machines % 2 === 0 ? 0n : losses.pop();
  let head = 0;
  let tail = losses.length - 1;

  while (head < tail) {
    const sum = losses[head] + losses[tail];
    if (sum > answer) answer = sum;
    head++;
    tail--;
  }

  return answer.toString();
}

console.log(Solution(input));
