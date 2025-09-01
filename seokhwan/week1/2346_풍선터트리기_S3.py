import sys
from collections import deque
input = sys.stdin.readline


N = int(input().rstrip())
nums = deque(enumerate((map(int, input().rstrip().split()))))

for _ in range(N):
    idx, num = nums.popleft()
    print(idx+1, end=" ")

    if num > 0:
        nums.rotate(-(num-1))
    else:
        nums.rotate(-num)