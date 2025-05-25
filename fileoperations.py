file = open('sample.txt.txt', 'r')

print(file.readline(12))
print(file.readline)
print(file.readlines)
print(file.readlines)

for x in file:
    print(x)
file.close()