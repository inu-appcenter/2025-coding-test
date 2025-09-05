import sys
input = sys.stdin.readline
INF = int(1e9)

def solved(N, S, arr):
    if (max(arr) >= S):
        return 1
    if (sum(arr) < S):
        return 0
    
    left = 0
    cur = 0
    min_len = INF

    for right in range(N):
        cur += arr[right]
        while cur >= S and left <= right:
            min_len = min(min_len, right-left+1)
            cur -= arr[left]
            left += 1

    return min_len


N, S = map(int, input().rstrip().split())
arr = list(map(int, input().rstrip().split()))

print(solved(N, S, arr))