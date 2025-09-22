// 문제링크 : https://www.acmicpc.net/problem/9095

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n")
  .map(Number);

function factorial(n) {
  if (n < 2) return 1;
  let result = 1;
  for (let i = 2; i <= n; i++) {
    result *= i;
  }
  return result;
}

function Solution(input) {
  const array = [];
  const count3 = parseInt(input / 3);
  let result = 0;

  // 1이 number1개 / 2가 j개 / 3이 i개
  for (let i = 0; i <= count3; i++) {
    let number = input - 3 * i;
    const count2 = parseInt(number / 2);
    for (let j = 0; j <= count2; j++) {
      let number1 = number - 2 * j;
      array.push({ 1: number1, 2: j, 3: i });
    }
  }

  for (let i = 0; i < array.length; i++) {
    const total = array[i][1] + array[i][2] + array[i][3];
    result += factorial(total) / (factorial(array[i][1]) * factorial(array[i][2]) * factorial(array[i][3]));
  }
  return result;
}

for (let i = 1; i < input.length; i++) {
  console.log(Solution(input[i]));
}
