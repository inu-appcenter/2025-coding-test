import sys
input = sys.stdin.readline

L = int(input().rstrip())
S = input().rstrip()
arr = [0,0,0,0]

for s in S:
    if s == "A":
        arr[0] += 1
    elif s == "C":
        arr[1] += 1
    elif s == "G":
        arr[2] += 1
    else:
        arr[3] += 1

ans = 1
for i in range(4):
    ans = ans * arr[i] % 1_000_000_007

print(ans)