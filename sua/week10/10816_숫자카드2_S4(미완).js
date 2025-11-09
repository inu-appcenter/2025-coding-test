const fs = require("fs");
const path = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(path).toString().trim().split("\n");

//참고 : SPLIT은 새로운 배열을 생성함
const N = Number(input[0]); // 숫자 카드 개수
let user = input[1]
  .split(" ")
  .map(Number)
  .sort((a, b) => {
    if (a > b) return 1;
    if (a === b) return 0;
    if (a < b) return -1;
  });
const M = Number(input[2]); // 정수 개수
let cards = input[3].split(" ").map(Number);

// console.log(user);
// console.log(cards);

let uidx = 0;
let cidx = 0;
let count = 0; //중복된 숫자 카운트
while (cards[cidx] !== undefined) {
  if (user[uidx] > cards[cidx]) {
    console.log(count);
    cidx++;
    count = 0;
  } else if (user[uidx] === cards[cidx]) {
    count++;
    uidx++;
  } else if (user[uidx] < cards[cidx]) {
    uidx++;
  }
}

function BinarySearch(low, high) {}
