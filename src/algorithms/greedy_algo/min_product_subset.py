# Finding the minimum product subset in an array
# Reference: https://www.geeksforgeeks.org/maximum-product-subset-array/
# Time Complexity: O(n)
# Space Complexity: O(1)


def minimum_product_subarry(input_list, size):
    if size == 1:
        return input_list[0]
    max_neg = -999999999999
    count_neg = 0
    count_zero = 0
    product = 1
    for each_item in input_list:
        if each_item == 0:
            count_zero = count_zero + 1
            continue
        if each_item < 0:
            count_neg = count_neg + 1
            max_neg = max(max_neg, each_item)
        product = product * each_item
    if count_zero == size:
        return 0
    if count_neg & 1:
        if (count_neg == 1 and count_zero > 0 and count_zero + count_neg == size):
            return 0
        product = int(product/max_neg)
    return product


if __name__ == "__main__":
    a = [ -1, -1, -2, 4, 3 ] 
    n = len(a) 
    print(minimum_product_subarry(a, n))