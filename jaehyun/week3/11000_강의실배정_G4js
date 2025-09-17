const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  const N = Number(input[0]);
  const data = input.slice(1).map((v) => v.split(" ").map(Number));

  const objArray = [];
  for (let i = 0; i < data.length; i++) {
    objArray.push({ time: data[i][0], start: 1 });
    objArray.push({ time: data[i][1], start: -1 });
  }

  objArray.sort((a, b) => (a.time === b.time ? a.start - b.start : a.time - b.time));

  let max = 0;
  let cur = 0;

  for (let obj of objArray) {
    obj.start === 1 ? cur++ : cur--;
    max = Math.max(max, cur);
  }
  return max;
}

console.log(Solution(input));
