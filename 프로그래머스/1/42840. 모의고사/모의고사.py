def solution(answers):
    scores = [0, 0, 0, 0]
    student1=[1, 2, 3, 4, 5]
    student2=[2, 1, 2, 3, 2, 4, 2, 5]
    student3=[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    for i in range(len(answers)):
        if(answers[i] == student1[i % len(student1)]):
            scores[1] += 1
        if(answers[i] == student2[i % len(student2)]):
            scores[2] += 1
        if(answers[i] == student3[i % len(student3)]):
            scores[3] += 1
    
    maxScore = max(scores)
    result = []
    for i in range(len(scores)):
        if scores[i] == maxScore:
            result.append(i)
    
    return result