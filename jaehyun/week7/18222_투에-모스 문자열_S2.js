const fs = require("fs");
const input = BigInt(
  fs
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
);

let k = input - 1n;
let count = 0n;

while (k > 0n) {
  count += k & 1n;
  k >>= 1n;
}

console.log(Number(count % 2n));
