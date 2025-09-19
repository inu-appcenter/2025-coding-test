import sys
from collections import deque
input = sys.stdin.readline


def bfs(start, end):
    if start == end:
        return 0
    
    queue = deque([(start, 0)])
    visited = [False] * (N+1)
    visited[start] = True

    while queue:
        cur, dis = queue.popleft()
        
        for next, edge_dist in graph[cur]:
            if not visited[next]:
                nx_dist = dis + edge_dist

                if next == end:
                    return nx_dist
                
                visited[next] = True
                queue.append((next, nx_dist))
    return -1


N, M = map(int, input().rstrip().split())
graph = [[] for _ in range(N+1)]

for _ in range(N-1):
    n1, n2, distance = map(int, input().rstrip().split())
    graph[n1].append([n2, distance])
    graph[n2].append([n1, distance])

for _ in range(M):
    s1, s2 = map(int, input().rstrip().split())
    print(bfs(s1, s2))