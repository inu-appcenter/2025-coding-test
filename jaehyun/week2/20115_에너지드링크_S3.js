const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  // 내림차순으로 정렬한다.
  const canList = input[1]
    .split(" ")
    .map(Number)
    .sort((a, b) => {
      return b - a;
    });

  let total = 0;
  // 첫번째를 제외하고 나머지를 다 더하고 반으로 나눈다.
  for (let i = 1; i < canList.length; i++) {
    total += canList[i];
  }

  // 첫번째값 + 나눈값 = 최종
  return total / 2 + canList[0];
}

console.log(Solution(input));
