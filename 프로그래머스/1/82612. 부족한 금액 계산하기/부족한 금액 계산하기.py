def solution(price, money, count):
    answer = price * count * (count + 1) // 2
    return answer - money if answer > money else 0