import sys
input = sys.stdin.readline


nums = list(int(input().rstrip()) for _ in range(20))
w_list = sorted(nums[:10])
k_list = sorted(nums[10:])

print(sum(w_list[-3:]), sum(k_list[-3:]))