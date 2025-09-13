const fs = require("fs");
const path = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(path).toString().trim().split("\n").map(Number);

/*245의 분해합 = 245+2+4+5=256*/
//분해합의 가장 작은 생성자 찾기
const N = input;

function solution() {
  let digit = 0; //자릿수
  for (let i = 6; i > -1; i--) {
    let d = 10 ** i;
    if (Math.floor(N / d) !== 0) {
      digit = i + 1;
      break;
    }
  }

  let maxDigit = digit * 9; //분해합 생성 시 각 자리수의 합의 최댓값
  while (maxDigit > 0) {
    let prod = N - maxDigit; //생성자 후보
    let sumOfprod = 0; //생성자 각 자리의 합

    //sumOfprod 구하기
    let p = prod;
    for (let i = 0; i < digit; i++) {
      sumOfprod += p % 10; //나머지
      p = parseInt(p / 10); //몫
      if (p === 0) {
        break;
      }
    }

    if (sumOfprod === maxDigit) {
      console.log(prod);
      return;
    }
    maxDigit--;
  }

  console.log(0);
}

solution();
