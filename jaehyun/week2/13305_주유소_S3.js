// https://www.acmicpc.net/problem/13305

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  const [cityCount, distanceArray, priceArray] = [Number(input[0]), input[1].split(" ").map(Number), input[2].split(" ").map(Number)];

  let totalPrice = 0n;
  let minPrice = BigInt(priceArray[0]);

  for (let i = 0; i < cityCount - 1; i++) {
    if (minPrice > BigInt(priceArray[i])) {
      minPrice = BigInt(priceArray[i]);
    }
    totalPrice += minPrice * BigInt(distanceArray[i]);
  }

  return totalPrice.toString();
}

console.log(Solution(input));
