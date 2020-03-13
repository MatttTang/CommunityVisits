package com.company;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Main {
    public static String readFile(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void main(String args[]) throws Exception {
        // Read in the file of names
        String data = readFile("D:\\CommunityVisit\\src\\names.txt");

        // Split the names by new line characters
        String[] names = data.split("\n", 0);

        // Create a graph
        Graph graph = new SingleGraph("Tutorial");

        // Create a vector filled with each name
        Vector<People> list = new Vector<People>();

        int totWeight = 0;
        // Add in each person to the vector while adding them into the graph as nodes
        for (int i = 0; i < names.length; i++) {
            list.add(new People(names[i]));
            totWeight += list.elementAt(i).weight;
            graph.addNode(names[i]);
            graph.display();
        }

        // Create an adjacency matrix for the name list
        boolean[][] adj = new boolean[names.length][names.length];

        for (int i = 0; i < names.length; i++){
            adj[i][i] = true;
        }

        int groupSize = 4;
        int groups = 2;
        // Remainder

        int connection = names.length * (names.length - 1);
        int counter = 0;

        int i = 0;

        Vector<Group> gList = new Vector<Group>();
        while (i < names.length){
            // Iterate through the column of visits to person i
            for (int j = 0; j < names.length; j++){
                // If a person has not visited i, and they are free, add them into a group with i
                if (adj[j][i] == false && list.get(j).free == true){
                    // If i is free, create a group with them in it
                    if (list.get(i).free){
                        gList.add(new Group(groupSize));
                        gList.lastElement().Add(list.get(i));
                        list.get(i).free = false;
                    }
                    if (gList.lastElement().Check(list.get(j))){
                        gList.lastElement().Add(list.get(j));
                        list.get(j).free = false;
                        graph.addEdge("a" + i + j, list.get(i).name, list.get(j).name);
                        graph.display();
                    }
                }
            }
            i++;
        }



        // While our connections are less than what we need, keep in the loop
        /*
        while (actual < connections){
            // Create an iterator through the list of people
            gActual = 0;
            ListIterator<People> iterator = (ListIterator<People>) list.iterator();
            ListIterator<People> holder = iterator;
            Vector<Group> gList = new Vector<Group>();
            gList.add(new Group(perG));
            // Iterate through the list, and if the weight fits within the group and the person is free, include them in the group
            while (iterator.hasNext()){
                People temp = iterator.next();
                // If the group does not hold remainders, add it into list of groups
                if (gList.lastElement().isFull()) {
                    if (gActual + 1 < groups) {
                        gList.add(new Group(perG));
                    }
                }
                // If the person being checked is free and fits into the group, add them to the group
                    if (temp.free && gList.lastElement().Check(temp)){
                        gList.lastElement().Add(temp);
                        // If the current group is full, then print it out
                        if (gList.lastElement().isFull()){
                            System.out.print("\n");
                        }
                    }
                actual = 42;
            }
        }
    }
    */
    }
}
