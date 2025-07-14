startHour, startMin=map(int, input().split())
time=int(input())

totalMin = startHour*60 + startMin + time

endHour = (totalMin // 60) %24
endMin = totalMin % 60

print(endHour, endMin)