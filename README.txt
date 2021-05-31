We have been learning Java for the past two weeks and this project demonstrates on what I have learnt so far.
Topics that we have learnt:
    - OOP
    - SOLID Principles
    - Design Patterns
    - Inheritance
    - Interface
    - Recursion
    - Static and Final
    - Nested Class
    - Exception
    - Logging
    - JUnit and TDD

This project is about understanding what I learned and applying them through creating a program about different
sort algorithms. Intellij was used to create the code for Bubble Sort, Merge Sort and Binary Tree Sort.
These algorithms will sort any arrays in order and will show the time taken to sort the arrays.

It follows OOP and SOLID principles. It can handle basic exceptions such as InputMismatchException and also a
custom Exception, ChildNotFoundException. This Exceptions are then logged in a .log file. A nested class was also
used for one of the algorithms, Binary Tree Sort, to create nodes for the tree. Recursion was used to achieve a sorted
arrays.And have applied a design pattern so that it can easily be used by the user. I also done some Junit testing
and performance testing that forces the algorithms to sort up to 1,000,000 arrays.

User Guide:
- When running the Main method, it will list out all the sorters and ask to select one by entering a number
    corresponding to a sorter.
- Whichever sorter was picked, it will ask how many numbers to be sorted. This will initialised the size of the array.
- Once it has been specified how many numbers to put in, it will ask to enter the numbers one-by-one
    until it reaches the size of the array.
- It will then sort the array with the specific sorter and print out the sorted array with the time taken to sort it.
- If Binary tree sort is selected, then it will ask in what order the array should be. Should it be ascending order or
    descending order.
- Then depending in which order, it should print out he array in the specified order.

*If an invalid input was entered at anytime, then an exception will be thrown and prompt the user
to add a valid number, it will be logged in the .log file and ends the program.

