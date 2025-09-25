import sys
input = sys.stdin.readline


N = int(input().rstrip())
A = sorted(list(map(int, input().rstrip().split())), reverse=False)
B = sorted(list(map(int, input().rstrip().split())), reverse=True)

S = 0

for i in range(N):
    S += A[i]*B[i]

print(S)