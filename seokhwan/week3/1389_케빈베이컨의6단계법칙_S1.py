import sys
from collections import deque
input = sys.stdin.readline
INF = 1e8


N, M = map(int, input().rstrip().split())
array = [[INF]*(N+1) for _ in range(N+1)]
for _ in range(M):
    user1, user2 = map(int, input().rstrip().split())
    array[user1][user2] = 1
    array[user2][user1] = 1


for k in range(1, N+1):
    for i in range(1, N+1):
        for j in range(1, N+1):
            array[i][j] = min(array[i][j], array[i][k]+array[k][j])

num = INF
answer = 0

for i in range(1, N+1):
    if num > sum(array[i][1:N+1]):
        num = sum(array[i][1:N+1])
        answer = i

print(answer)