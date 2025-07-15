def solution(n):
    # 정수를 문자열로 변환 후, 리스트로 변환하여 각 자릿수를 분리
    arr = list(str(n))
    arr.sort(reverse=True)
    # 정렬된 리스트를 다시 문자열로 합친 후 정수로 변환하여 반환
    return int("".join(arr))