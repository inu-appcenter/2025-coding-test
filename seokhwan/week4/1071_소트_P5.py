import sys
from collections import Counter
input = sys.stdin.readline


def solved():
    if len(ans) == N:
        return True

    for i in nums.keys():
        if nums[i] > 0:
            if not ans or ans[-1] + 1 != i:
                ans.append(i)
                nums[i] -= 1
                
                if solved():
                    return True
                
                nums[i] += 1
                ans.pop()
                
    return False

N = int(input().rstrip())
nums = Counter(sorted(list(map(int, input().rstrip().split()))))
ans = []

solved()
print(*ans)
