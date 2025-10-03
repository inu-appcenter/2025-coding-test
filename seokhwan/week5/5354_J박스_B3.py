import sys
input = sys.stdin.readline

def JBox(num):
    if num == 1:
        print("#")
        return
    for _ in range(num):
        print("#",end="")
    print()

    for _ in range(num-2):
        print("#",end="")
        for _ in range(num-2):
            print("J",end="")
        print("#",end="")
        print()

    for _ in range(num):
        print("#",end="")
    print()

N = int(int(input().rstrip()))

for i in range(N):
    JBox(int(input().rstrip()))
    if not i == N-1:
        print()