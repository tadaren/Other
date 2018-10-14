p = 11

points = []

k = 3

for _ in range(3):
    # points.append([int(x) for x in input("x y:").split()])
    points.append(tuple([int(x) for x in input().split()]))

ans = 0

for e1 in points:
    r = 1
    for e2 in points:
        if e1[0] == e2[0]:
            continue
        r *= (-e2[0] % p)*pow((e1[0]-e2[0]), p-2, p)%p
        # print((-j % p)*pow((e[0]-j), p-2, p))

    ans += r*e1[1]%p

# print(f"ans={ans%p}")
print(ans%p)
