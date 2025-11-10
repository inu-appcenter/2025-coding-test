const fs = require("fs");
const path = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(path).toString().trim().split("\n");

//console.log(input);

//참고 : SPLIT은 새로운 배열을 생성함
function balance(arr) {
  let check = true;
  let sign = [];
  let idx = 0;
  while (arr[idx] !== ".") {
    //문장의 끝
    if (arr[idx] === "(") sign.push(arr[idx]);
    else if (arr[idx] === "[") sign.push(arr[idx]);

    if (arr[idx] === ")") {
      if (sign[sign.length - 1] === "(") sign.pop();
      else {
        check = false;
        break;
      }
    } else if (arr[idx] === "]") {
      if (sign[sign.length - 1] === "[") sign.pop();
      else {
        check = false;
        break;
      }
    }
    idx++;
  }
  if (sign.length !== 0) check = false;

  if (check) console.log("yes");
  else console.log("no");
}

for (let i = 0; i < input.length; i++) {
  if (input[i] === ".") break;
  balance(input[i]);
}
