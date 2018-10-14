import math

list_ = [int(x) for x in input().split()]
s = sum(list_)
list_ = [x/s for x in list_]

sum_ = 0

for e in list_:
    sum_ -= e*math.log2(e)

print(sum_)
