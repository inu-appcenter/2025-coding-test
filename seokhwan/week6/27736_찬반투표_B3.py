import sys
input = sys.stdin.readline

n = int(input().rstrip())
ans = list(map(int, input().rstrip().split()))

if (ans.count(0) *2 >= n):
    print("INVALID")
elif sum(ans) <= 0:
    print("REJECTED")
else:
    print("APPROVED")