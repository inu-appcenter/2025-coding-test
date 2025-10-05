// 문제링크 : https://www.acmicpc.net/problem/22857

const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n");

function Solution(input) {
  const testCaseNumber = +input[0]; // 테스트 케이스 개수
  const inputArr = input.slice(1).map((line) => line.split(" "));
  const answer = [];

  inputArr.forEach((el) => {
    const n = +el[0];
    const m = +el[1];
    const memo = Array.from(Array(30), () => Array(30).fill(0));

    for (let i = 1; i <= n; i++) {
      for (let j = i; j <= m; j++) {
        if (j === i) {
          memo[i][j] = 1;
        } else if (i === 1) {
          memo[i][j] = j;
        } else {
          let temp = 0;
          for (let k = 1; k < j; k++) {
            temp += memo[i - 1][k];
          }
          memo[i][j] = temp;
        }
      }
    }

    answer.push(memo[n][m]);
  });

  return answer.join("\n");
}

console.log(Solution(input));
