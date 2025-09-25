import sys
input = sys.stdin.readline

def solved(N):
    A,B,C,D,E,F = map(int, input().rstrip().split())
    three_min = min(A+B+C, A+B+D, A+C+E, A+D+E, B+C+F, B+D+F, C+E+F, D+E+F)
    two_min = min(A+B, A+C, A+D, A+E, B+C, B+D, B+F, C+E, C+F, D+E, D+F, E+F)
    one_min = min(A, B, C, D, E, F)

    if N == 1:
        return A+B+C+D+E+F - max(A,B,C,D,E,F)

    return (three_min * 4) + (two_min * (4*(2*N-3))) + (one_min * ((4*(N-1)*(N-2))+((N-2)**2)))

N = int(input().rstrip())
print(solved(N))



"""
경우의 수 

3면의 합이 최소가 되는 경우
A,B,C
A,B,D
A,C,E 
A,D,E
B,C,F
B,D,F
C,E,F
D,E,F

2면의 합이 최소가 되는경우
A,B
A,C
A,D
A,E
B,C
B,D
B,F
C,E
C,F
D,E
D,F
E,F

3면의 개수
무조건 4

2면의 개수
4(2N-3)

1면의 개수
4(N-1)(N-2)+(N-2)^2
"""