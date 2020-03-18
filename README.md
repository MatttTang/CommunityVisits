# Creating Community Small Groups

_**You should erase this the text below as you fill it up with your own text**_

Here you will describe your term project. Remember to write your names.
[More detailed instructions here](SmallGroups-Graph.pdf)

You will need to include in this repository:
- `group1.txt` a file with 16 names
- `group2.txt` a file with 29 names
- `group3.txt` a file with 34 names
- The source code of your program

This document should be organized as follows:

# Creating Community Small Groups
A work by: McDonald Berger and Igor Tzankoven

Along with the rest of CSC 3430 class, our group (Matthew Tang and Junwon Song) was assigned to design and develop a program that can help out with a church community activity, which is having every member going to everyone’s home. However, the program has to be set up under these conditions:
- The user has to enter in how many people will be assigned per group
- If there's a married couple, married couple always go together
- If there's a leftover person after assigning everyone to a full group, then the leftover person will be added to the last full group

## Description
In terms of coding language, we decided to use Java due to its flexibility with libraries and our familiarity with C++’s syntax. For example, thanks to the utilization of libraries, forming a graph in Java was relatively easier due to the fact that we were able to use a library called ‘JGraphT’ and it was a matter of calling functions to create, and connect nodes with edges. Additionally, animating the graph was quite easy as well as we used the library called ‘GraphStream’ and we were able to visually represent nodes and edges on a separate tab.

## Requirements
As mentioned above, we used java and the specific version is jdk-13.0.2. We installed and used GraphStream through Maven for this program. For a reference, the artifact is org.graphstream:*. For manual installation of the GraphStream library, we have also included a file called gs-core1.3.jar as well. 

## User Manual
Before attempting to start the program, it is crucial for the user to create a .txt file that has an endline at the end of the file for the program to work as intended. 

Here are the recommended prerequisites for the user before attempting to run our program:
1. Install Intellij IDE
2. After downloading the .jar file, include it in to the project to add it in to the external library of the project

In order to start and run the program as intended, please follow these steps to effectively utilize the program:
1. Build and run the program
2. Enter the appropriate file name
3. Enter the desired group size

If the user didn’t encounter an error for step 2 and 3, the program should successfully run and display two results:
1. Visualization of every single iteration on the console
2. Animated visualization of the graph that the program has created

## Reflection
When our group first tackled this project, primarily, we were focused on trying to make this program as efficient as possible. We tried many different ways when we were approaching the problem, but we always found ourselves creating an ineffecient algorithm. For example, when we attempted a dynamic solution, we realized that we had to identify and make a correct decision in the beginning of the iteration for the rest of the connection to work out as effeciently as possible. In the end, we have decided that all of the algorithms that we came up with is ineffective compared to the algorithm which was inspired by the Greedy Method. As a result, we have realized that O(N^3) would be the most efficient time complexity for this problem and decided to stick with it. After the program was constructed initially, our group took a step further and tried our best to make the program as optimized as possible (reference) in order to further boost the efficiency of our program.

## Results

<img src= "names16.JPG?raw=true"/>
Program running with 16 name file, and group size of 3

<img src="names29.JPG?raw=true"/>
Program running with 29 name file, and group size of 4
