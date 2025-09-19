import sys
input = sys.stdin.readline

A = list(map(int, input().rstrip().split()))
B = list(map(int, input().rstrip().split()))
flag = 0

for i in range(10):
    if A[i] > B[i]:
        flag += 1
    elif A[i] < B[i]:
        flag -= 1

if flag > 0:
    print("A")
elif flag < 0:
    print("B")
else:
    print("D")
