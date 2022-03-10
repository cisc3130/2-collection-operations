# 2-collection-operations

1. Design a task. This task can operate on a collection of numbers, strings, collections, or something you design yourself. The task should include
    1) at least one filter
    2) at least one other intermediate operation (e.g. sorting, mapToInt)
    3) a terminal operation
   
2. Create a file CollectionOperations.java. Begin the file with a comment describing the task you have designed. Specify the type of object you are operating over, the filter, the other intermediate operation, and the terminal operation.

3. Write a method `forEachLoopTask` that completes your task by looping over the collection using the for-each construct. Do not modify the underlying collection - create a new collection if necessary (it might not be).

4. Write a method `iteratorLoopTask` that completes your task using an iterator. Do not modify the underlying collection - create a new collection if necessary (it might not be).

5. Write a method `streamTask` that completes your task using a stream.

6. Write a main method that calls each method on a collection that you create.

6. At the end of the file, write a comment that includes
    1. How many lines of code are in each method 
    2. Which method/paradigm seemed best suited to your task (this is somewhat subjective but not completely).
