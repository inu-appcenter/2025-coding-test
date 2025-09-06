const fs = require("fs");
const path = process.platform === "linux" ? "/dev/stdin" : "Wiki\\input.txt";
const [a, b, c] = fs.readFileSync(path).toString().trim().split("\n");

console.log(Number(a) + Number(b) - Number(c));
console.log(a + b - c);

/*내가 썼던 코드. 계속 틀렸다고 함
근데 위의 코드는 바로 정답.
왜?
아... split를 \n으로 해야 했다. 
입력이 줄바꿈으로 되어 있었기에...*/

// const fs = require("fs");
// const input = fs
//   .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
//   .toString()
//   .trim()
//   .split(" ")
//   .map(Number);

// const [a, b, c] = input;
// const [d, e, f] = [a,b,c].map(String);

// console.log(a + b - c);
// console.log(d + e - f);
