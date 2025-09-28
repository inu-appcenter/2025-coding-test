import random
import string

n = random.randint(1, 100)
m = int(input("출력할 문자열 갯수"))
j = 1
rand_str = ''

string_pool = string.ascii_lowercase

for j in range(m):

    for i in range(n):
        rand_str += str(random.choice(string_pool))
        print(rand_str)