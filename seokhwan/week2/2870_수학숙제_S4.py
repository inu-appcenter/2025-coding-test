import sys
input = sys.stdin.readline

nums = "0123456789"

N = int(input().rstrip())
ans = []
tmp = ""

for _ in range(N):
    arr = list(input().rstrip())
    for s in arr:
        if s in nums:
            tmp += s
        elif tmp:
            ans.append(int(tmp))
            tmp = ""
    if tmp:
        ans.append(int(tmp))
        tmp = ""

srt_ans = sorted(ans)

for n in srt_ans:
    print(n)