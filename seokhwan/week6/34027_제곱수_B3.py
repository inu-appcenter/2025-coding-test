import sys
import math
input = sys.stdin.readline

T = int(input().rstrip())\

for _ in range(T):
    if math.sqrt(int(input().rstrip())) % 1 == 0.0:
        print(1)
    else:
        print(0)