package com.company;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
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
        Graph graph = new MultiGraph("Tutorial");

        // Create a vector filled with each name
        Vector<People> list = new Vector<People>();
        graph.display();

        // Makes sure names are without the end line character
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].substring(0, names[i].length() - 1);
        }

        int totWeight = 0;
        // Add in each person to the vector while adding them into the graph as nodes
        for (int i = 0; i < names.length; i++) {
            list.add(new People(names[i]));
            totWeight += list.elementAt(i).weight;
            graph.addNode(names[i]);
        }

        // Create an adjacency matrix for the name list
        boolean[][] adj = new boolean[names.length][names.length];

        // Initialize nodes so that they cannot visit themselves, do it by initialize their spot in the matrix to true
        for (int i = 0; i < names.length; i++) {
            adj[i][i] = true;
        }

        int groupSize = 4;
        int groups = 2;
        // Remainder

        int connection = names.length * (names.length - 1);
        int counter = 0;
        int iterationNum = 1;

        // Create a vector of groups to hold all groups for this iteration
        Vector<Group> gList = new Vector<Group>();

        // While we do not have n * (n - 1) connections
        while (counter < connection) {
            // Iterate through the hosts, if any of the hosts are missing a visitor, then they host a group
            for (int i = 0; i < names.length; i++) {
                // Iterate through the column to see visitors of person i
                for (int j = 0; j < names.length; j++) {
                    // If a person has not visited i, and they are free, add them into a group with i
                    if (adj[j][i] == false && list.get(j).free == true) {
                        // If i is free, create a group with them in it
                        if (list.get(i).free) {
                            gList.add(new Group(groupSize));
                            gList.lastElement().Add(list.get(i));
                            list.get(i).free = false;
                        }
                        // Check if the person to be added can fit into the group, if they can add them, and create connection
                        if (gList.lastElement().Check(list.get(j))) {
                            gList.lastElement().Add(list.get(j));
                            adj[j][i] = true;
                            counter++;
                            list.get(j).free = false;
                            graph.addEdge("a" + counter , list.get(i).name, list.get(j).name);
                        }
                    }
                }
                // If this host needs no more visitors, the move on
                if (!gList.isEmpty()) {
                    // If the current group is not full, the host needs to have guests they have already had before
                    if (gList.lastElement().isFull() == false) {
                        for (int t = 0; t < names.length; t++) {
                            if (list.get(t).free == true && t != i) {
                                gList.lastElement().Add(list.get(t));
                                list.get(t).free = false;
                            }
                            if (gList.lastElement().isFull()) {
                                break;
                            }
                        }
                    }
                }
            }
            // Change everyone's availability to true
            for (int z = 0; z < names.length; z++){
                list.get(z).free = true;
            }
            for (int q = 0; q < gList.size(); q++){
                System.out.print(iterationNum);
                System.out.println(gList.get(q).occupants);
            }
            // Clear the groups for the iteration
            gList.clear();
            iterationNum++;
        }
    }
}
