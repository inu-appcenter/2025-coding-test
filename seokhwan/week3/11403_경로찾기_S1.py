import sys
input = sys.stdin.readline

N = int(input().rstrip())
G = []
for _ in range(N):
    G.append(list(map(int, input().rstrip().split())))

for m in range(N):
    for i in range(N):
        for j in range(N):
            if G[i][m] and G[m][j]:
                G[i][j] = 1

for i in range(N):
    for j in range(N):
        print(G[i][j], end=" ")
    print()