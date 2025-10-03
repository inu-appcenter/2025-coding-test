import sys
input = sys.stdin.readline

ans = 0
for _ in range(5):
    n = int(input())
    if n < 40:
        ans += 40
        continue
    ans += n

print(ans//5)