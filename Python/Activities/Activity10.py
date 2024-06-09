num_tuple=(10,12,14,15,17)
print("Given number is :"+ str(num_tuple))

for i in num_tuple:
   if i%5==0:

     print("NO are divisible by 5 :"+ str(i))


     example_set = {"apple", "banana", "cherry"}
	
 
	
example_set.add("orange") # One Item
	
 
	
example_set.update(["mango", "grape"]) # Multiple Items
	
 
	
print(example_set)

example_set.remove("apple")
#example_set.remove("water")
example_set.discard("water")

print(example_set)