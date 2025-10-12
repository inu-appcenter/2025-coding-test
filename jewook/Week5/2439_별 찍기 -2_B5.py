N = int(input())
i = 1
while (i <= N):
    j = N-i
    while(j > 0):
        print(" ", end="")
        j = j -1
    print("*" * i)
    i = i + 1