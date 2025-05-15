a=3
print(a,type(a))#int
a=3.3
print(a,type(a))#float
a=34
print(a,type(a))#string
a=5
b=float(a)#int-> float
c=str(a)
print(b,type(b))
print(c,type(c))
a="3"
b=float(a)
c=str(a)
print(b,type(b))
print(c,type(c))

a,b=50, 70
print("numbers before swapping : ",a,b)
a,b=b,a
print("numbers before swapping : ",a,b)

a,b=5,3
print(a+b)#8
print(a-b)#2
print(a*b)#15
print(a/b)#1.666
print(a//b)#1 floor division
print(a%b)#2

print(a<b)#f
print(a<=b)#f
print(a>b)#t
print(a>=b)#f  
print(a==b)#f  ,equality
print(a!=b)#t  , non equality

a,b,c=50, 70, 80
print("numbers before swapping : ",a,b,c)
a,b,c=b,a,c
print("numbers before swapping : ",a,b,c)

