print("Create a List")
thislist = ["apple", "banana", "cherry"]
print(thislist)
print('-----')

print("Lists allow duplicate values")
thislist = ["apple", "banana", "cherry", "apple", "cherry"]
print(thislist)
print('-----')

print("Print the number of items in the list")
thislist = ["apple", "banana", "cherry"]
print(len(thislist))
print('-----')

print("String, int and boolean data types")
list1 = ["apple", "banana", "cherry"]
list2 = [1, 5, 7, 9, 3]
list3 = [True, False, False]
print('-----')

print("A list with strings, integers and boolean values")
list1 = ["abc", 34, True, 40, "male"]
print('-----')

print("data type of a list")
mylist = ["apple", "banana", "cherry"]
print(type(mylist))
print('-----')

print("Using the list() constructor to make a List")
thislist = list(("apple", "banana", "cherry"))
print(thislist)
print('-----')

print("Print the second item of the list")
thislist = ["apple", "banana", "cherry"]
print(thislist[1])
print('-----')

print("Print the last item of the list")
thislist = ["apple", "banana", "cherry"]
print(thislist[-1])
print('-----')

print("Return the third, fourth, and fifth item")
thislist = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(thislist[2:5])
print('-----')

print("returns the items from cherry to the end")
thislist = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(thislist[2:])
print('-----')

print("Check if apple is present in the list")
thislist = ["apple", "banana", "cherry"]
if "apple" in thislist:
  print("Yes, 'apple' is in the fruits list")
  print('-----')

print("Change the second item")
thislist = ["apple", "banana", "cherry"]
thislist[1] = "blackcurrant"
print(thislist)
print('-----')

print("Change the second value by replacing it with two new values")
thislist = ["apple", "banana", "cherry"]
thislist[1:2] = ["blackcurrant", "watermelon"]
print(thislist)
print('-----')

print("Change the second and third value by replacing it with one value")
thislist = ["apple", "banana", "cherry"]
thislist[1:3] = ["watermelon"]
print(thislist)
print('-----')

print("Insert watermelon as the third item")
thislist = ["apple", "banana", "cherry"]
thislist.insert(2, "watermelon")
print(thislist)
print('-----')

print("Using the append() method to append an item")
thislist = ["apple", "banana", "cherry"]
thislist.append("orange")
print(thislist)
print('-----')

print("Insert an item as the second position")
thislist = ["apple", "banana", "cherry"]
thislist.insert(1, "orange")
print(thislist)
print('-----')

print("Add the elements of tropical to thislist ")
thislist = ["apple", "banana", "cherry"]
tropical = ["mango", "pineapple", "papaya"]
thislist.extend(tropical)
print(thislist)
print('-----')

print("Add elements of a tuple to a list")
thislist = ["apple", "banana", "cherry"]
thistuple = ("kiwi", "orange")
thislist.extend(thistuple)
print(thislist)
print('-----')

print("Remove banana")
thislist = ["apple", "banana", "cherry"]
thislist.remove("banana")
print(thislist)
print('-----')

print("Remove the second item")
thislist = ["apple", "banana", "cherry"]
thislist.pop(1)
print(thislist)
print('-----')

print("Remove the last item")
thislist = ["apple", "banana", "cherry"]
thislist.pop()
print(thislist)
print('-----')

print("Remove the first Item")
thislist = ["apple", "banana", "cherry"]
del thislist[0]
print(thislist)
print('-----')

print("deleting entire list")
thislist = ["apple", "banana", "cherry"]
del thislist
print('-----')

print("Clear the list content")
thislist = ["apple", "banana", "cherry"]
thislist.clear()
print(thislist)
print('-----')

print("Print all items in the list, one by one")
thislist = ["apple", "banana", "cherry"]
for x in thislist:
  print(x)
  print('-----')

print("Print all items by referring to their index number")
thislist = ["apple", "banana", "cherry"]
for i in range(len(thislist)):
  print(thislist[i])
  print('-----')

print("Print all items, using a while loop to go through all the index numbers")
thislist = ["apple", "banana", "cherry"]
i = 0
while i < len(thislist):
  print(thislist[i])
  i = i + 1
  print('-----')

print("for loop that will print all items in a list")
thislist = ["apple", "banana", "cherry"]
[print(x) for x in thislist]
print('-----')

print("print item which have letter a")
fruits = ["apple", "banana", "cherry", "kiwi", "mango"]
newlist = []
for x in fruits:
  if "a" in x:
    newlist.append(x)
print(newlist)
print('-----')

print("Only accept items that are not apple")
newlist = [x for x in fruits if x != "apple"]
print('-----')

print("with no if statement")
newlist = [x for x in fruits]
print('-----')

print("use the range() function to create an iterable")
newlist = [x for x in range(10)]
print('-----')

print("Accept only numbers lower than 5")
newlist = [x for x in range(10) if x < 5]
print('-----')

print("Set the values in the new list to upper case")
newlist = [x.upper() for x in fruits]
print('-----')

print("Set all values in the new list to 'hello'")
newlist = ['hello' for x in fruits]
print('-----')

print("Return orange instead of banana")
newlist = [x if x != "banana" else "orange" for x in fruits]
print('-----')

print("Sort the list alphabetically")
thislist = ["orange", "mango", "kiwi", "pineapple", "banana"]
thislist.sort()
print(thislist)
print('-----')

print("Sort the list numerically")
thislist = [100, 50, 65, 82, 23]
thislist.sort()
print(thislist)
print('-----')

print("Sort the list descending")
thislist = ["orange", "mango", "kiwi", "pineapple", "banana"]
thislist.sort(reverse = True)
print(thislist)
print('-----')

print("Sort the list descending")
thislist = [100, 50, 65, 82, 23]
thislist.sort(reverse = True)
print(thislist)
print('-----')

print("Sort the list based on how close the number is to 50")
def myfunc(n):
  return abs(n - 50)
thislist = [100, 50, 65, 82, 23]
thislist.sort(key = myfunc)
print(thislist)
print('-----')

print("Case sensitive sorting can give an unexpected result")
thislist = ["banana", "Orange", "Kiwi", "cherry"]
thislist.sort()
print(thislist)
print('-----')

print("Perform a case-insensitive sort of the list")
thislist = ["banana", "Orange", "Kiwi", "cherry"]
thislist.sort(key = str.lower)
print(thislist)
print('-----')

print("Reverse the order of the list items")
thislist = ["banana", "Orange", "Kiwi", "cherry"]
thislist.reverse()
print(thislist)
print('-----')

print("Make a copy of a list with the copy() method")
thislist = ["apple", "banana", "cherry"]
mylist = thislist.copy()
print(mylist)
print('-----')

print("Make a copy of a list with the list() method")
thislist = ["apple", "banana", "cherry"]
mylist = list(thislist)
print(mylist)
print('-----')

print("Join two list")
list1 = ["a", "b", "c"]
list2 = [1, 2, 3]
list3 = list1 + list2
print(list3)
print('-----')

print("Append list2 into list1")
list1 = ["a", "b" , "c"]
list2 = [1, 2, 3]
for x in list2:
  list1.append(x)
print(list1)
print('-----')

print("Use the extend() method to add list2 at the end of list1")
list1 = ["a", "b" , "c"]
list2 = [1, 2, 3]
list1.extend(list2)
print(list1)






