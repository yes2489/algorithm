startHour, startMin, startSec=map(int, input().split())
cookingTime = int(input())

totalTime = startHour*60*60 + startMin*60 + startSec + cookingTime

endHour=totalTime//(60*60)%24
endMin=totalTime%(60*60)//60
endSec=totalTime%60
print(endHour, endMin, endSec)