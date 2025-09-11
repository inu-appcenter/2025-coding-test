const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  const array = input[1].split("");
  let current = array[0];
  const map = new Map();
  map.set("B", 0);
  map.set("R", 0);

  if (array[0] === "B") {
    map.set("B", +1);
  } else {
    map.set("R", +1);
  }

  for (let i = 1; i < array.length; i++) {
    if (current !== array[i] && array[i] === "B") {
      map.set("B", map.get("B") + 1);
      current = "B";
    }
    if (current !== array[i] && array[i] === "R") {
      map.set("R", map.get("R") + 1);
      current = "R";
    }
  }

  return Math.min(map.get("B"), map.get("R")) + 1;
}

// 예시 실행
console.log(Solution(input));
