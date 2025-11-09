import sys
input = sys.stdin.readline

n, m = map(int, input().rstrip().split())

if m <= 2:
    print("NEWBIE!")
elif m <= n:
    print("OLDBIE!")
else:
    print("TLE!")