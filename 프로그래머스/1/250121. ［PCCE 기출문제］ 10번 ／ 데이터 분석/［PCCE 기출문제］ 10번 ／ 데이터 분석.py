def solution(data, ext, val_ext, sort_by):
    type_dict = {'code': 0, 'date': 1, 'maximum': 2, 'remain': 3}
    data = sorted(data, key = lambda x : x[type_dict[sort_by]])
    ans = []
    for val in data:
        if val[type_dict[ext]] < val_ext:
            ans.append(val)
    return ans