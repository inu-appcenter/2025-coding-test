const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim();

// 문제
// 괄호를 활용하여 최소로 만드는 문제

// 풀이
// 양수, +, -를 모두 나눠 배열에 담는다.
// -를 기점으로 뒤쪽에 숫자를 최대한 더한다.
// 최종합을 만든다.

function Solution(formula) {
  const minusSplit = formula.split("-");
  const parts = [];

  for (let i = 0; i < minusSplit.length; i++) {
    const part = minusSplit[i];
    const plusSplit = part.split("+");
    let sum = 0;
    for (let j = 0; j < plusSplit.length; j++) {
      sum += Number(plusSplit[j]);
    }
    parts.push(sum);
  }
  let result = parts[0];
  for (let i = 1; i < parts.length; i++) {
    result -= parts[i];
  }

  return result;
}

// 결과 출력
console.log(Solution(input));
