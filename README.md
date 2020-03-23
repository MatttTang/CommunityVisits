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
In terms of coding language, we decided to use Java due to its flexibility with libraries and our familiarity with C++’s syntax. For example, thanks to the utilization of libraries, forming a graph in Java was relatively easier due to the fact that we were able to use a library called ‘GraphStream’. Creating a graph and displaying it was just a matter of calling functions to create, and connect nodes with edges. Additionally, the visual representation of the graph was just displaying the nodes and edges previously created.

## Requirements
As mentioned above, we used java and the specific version is jdk-13.0.2. We installed and used GraphStream for this program. For a reference, the artifact is org.graphstream:*. For manual installation of the GraphStream library, we have also included a file called gs-core1.3.jar as well. 

## User Manual
Before attempting to start the program, it is crucial for the user to create a .txt file that has an endline at the end of the file for the program to work as intended. 

Here are the recommended prerequisites for the user before attempting to run our program:
1. Install Intellij IDE
2. After downloading the .jar file, include it in to the project to add it in to the external libraries for the project

In order to start and run the program as intended, please follow these steps to effectively utilize the program:
1. Build and run the program
2. Enter the appropriate file name
3. Enter the desired group size

*Please ensure that the file hierarchy has the file of names within the project directory in IntelliJ, but outside any other directories*

<img src="direct.JPG?raw=true"/>

*In this example, the project directory is CommunityVisit, and the name.txt files exist within it, but not within any other directories*

*When you click on the icon displayed in the picture, the file hierarchy will pop up, and check to see it looks like this*



If the user didn’t encounter an error for step 2 and 3, the program should successfully run and display two results:
1. Visualization of every single iteration on the console
2. Animated visualization of the graph that the program has created

## Reflection
When our group first tackled this project, primarily, we were focused on trying to make this program as efficient as possible. We have attempted to approach this project in many different ways, but we always found ourselves creating an ineffecient algorithm that would be too complex for us to run. We tried to lower the time complexity, runtime, and memory of the program, but it was very challenging for us with our current knowledge of algorithmic design to do so. For example, when we first attempted to create this program through a dynamic programming solution, we quickly realized that we had to identify and make a correct decision in the beginning of the iteration for the rest of the connections to work out as effeciently as possible. Without carfully checking the validity of future groups, many of the groupings further into the program's iterations would be redundant. After many attempts and failures, in the end, we have decided that all of the algorithms that we came up with were ineffective compared to the algorithm which was inspired by the Greedy Method. As a result, we have realized that O(n<sup>3</sup>) would be the most efficient time complexity for this problem and decided to stick with it. Another difficulty we faced in the beginning of our project was deciding which library to use. We found many different libraries like JGraphT and JFree, but we soon realized that if we use GraphStream, copmpared to other graph libraries, it would be easier and simpler for us to visually animate the connections after the program is done. Lastly, error checking the user input was quite complicated as well. We were able to prevail through this problem by testing out many different cases on paper and tried our best to find a pattern that we can use for error checking. For example, we realized that if the max group size is odd, there had to be at least one single in the entire list of people for the group to be formed correctly since if there were only couples, they will only be able to create even-numbered groups. After the program was constructed initially, our group took a step further and tried our best to make the program as optimized as possible in order to further boost the efficiency of our program by following the guidelines of resources that we have learned during Computer Architecture and Organization (CSC 3750) and Computer Organization and Assembly Langauge (CSC 3760) classes. Overall, this project has allowed us to learn how to work on a single project as a team, communicate clearly in terms of the algorithm designing process, and adapt to a new coding language and IDE according to its effeciency and familiarity.

## Results

<a href="https://www.youtube.com/watch?v=gbDyaXYKQBo">A video demonstrating the program running</a>

<img src= "names16.JPG?raw=true"/>
Program running with 16 name file, and group size of 3
<a href="https://docs.google.com/document/d/11Dsi9Nn5zLMs93LFpFuHxSL4qjcy85WYAXLwhUTpX40/edit?usp=sharing">Full Output</a>

<img src="names29.JPG?raw=true"/>
Program running with 29 name file, and group size of 4

<img src="names34.JPG?raw=true"/>
Program running with 34 name file, and group size of 5
