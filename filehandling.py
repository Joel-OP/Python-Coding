file_read = open('Polymorphism.py','r')
print("File in Read Mode -")
print(file_read.read())
file_read.close()

file_write = open('Polymorphism.py', 'w')
file_write.write("File in write mode....")
file_write.write("Hi! I am Penguin. i am 1 yr. old")

file_append = open('Polymorphism.py', 'a')
file_append.write("\n File in append mode ....")
file_append.write("Hi! I am Penguin. I am 1 yr. old")
file_append.close()