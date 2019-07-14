
n1 = int(input())
st = []
cou1 = 0
while cou1 != n:
    st1 = input()
    st = st + [st1]
    cou1 = cou1 + 1

war = input()

final_array = []


cou2 = 0
l = []
while cou2 != n1:
    li = st[cou2].split(" ")

    final = [li[0]+" "+li[1]]+[li[2]+" "+li[3]]+[li[0]+" "+li[3]]+[li[2]+" "+li[1]]
    #print(final)


    f = war.split(" ")

    cou = 0
    stor = []
    while count != 4:
        v = final[cou]
        str1 = v.split(" ")
        val = abs(int(f[0])-int(str1[0]))+abs(int(f[1])-int(str1[1]))
        stor = stor + [val]

        count = count + 1
    # print(min(stor))
    # final_array[count2][0] = min(stor)
    # final_array[count2][1] = count2
    final_arr = final_arr + [[min(stor),cou2+1]]
    cou2 = cou2 + 1

for i in range(n1):

    for j in range(0, n1 - i - 1):

        if final_arr[j][0] > final_arr[j + 1][0]:
            final_arr[j][0], final_arr[j + 1][0] = final_arr[j + 1][0], final_arr[j][0]
            final_arr[j][1], final_arr[j + 1][1] = final_array[j + 1][1], final_arr[j][1]

for i in range(n1):
    print(final_arr[i][1])


# 3
# 1 1 0 0
# 1 2 2 3
# 3 0 4 1
# 0 4