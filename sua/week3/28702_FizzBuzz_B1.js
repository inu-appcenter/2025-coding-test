const fs = require("fs");
const { type } = require("os");
const path = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(path).toString().trim().split("\n");

const puzzle = input;

function solution() {
  const rule = [
    "FizzBuzz",
    1,
    2,
    "Fizz",
    4,
    "Buzz",
    "Fizz",
    7,
    8,
    "Fizz",
    "Buzz",
    11,
    "Fizz",
    13,
    14,
  ];
  //15마다 규칙이 존재.

  //마지막으로 나타나는 숫자 저장
  let Num = 0;
  for (let i = 0; i < 3; i++) {
    if (Number(input[i])) {
      Num = Number(input[i]);
      puzzle[i] = Number(input[i]) % 15;
      Num += 3 - i;
      continue;
    }
    puzzle[i] = input[i].replace(/\r/g, "");
  }

  let nextidx = 0;
  for (let i = 0; i < rule.length; i++) {
    if (
      puzzle[0] === rule[i] &&
      puzzle[1] === rule[(i + 1) % 15] &&
      puzzle[2] === rule[(i + 2) % 15]
    ) {
      nextidx = (i + 3) % 15;
    }
  }

  if (typeof rule[nextidx] === "string") {
    console.log(rule[nextidx]);
  } else if (typeof rule[nextidx] === "number") {
    console.log(Num);
  }
}

solution();
