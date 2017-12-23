from datetime import date

arr = ['Monday', 'Tuesday', 'Wednesday', 'Thursday',
       'Friday', 'Saturday', 'Sunday']

a,b = map(int, input().split())
date = date(2009,b,a)
print(arr[date.weekday()])

