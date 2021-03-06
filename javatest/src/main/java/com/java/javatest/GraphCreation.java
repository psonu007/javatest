package com.java.javatest;

import java.util.ArrayList;
import java.util.List;

public class GraphCreation {
	
	public static void createGraph(ArrayList<ArrayList<Integer>> list,int u,int  v) {
		
		list.get(u).add(v);
		list.get(v).add(u);
		
		
	}
	

	
	
	
	
	public static void main(String[] args) {
		// Creating a graph with 5 vertices
        int V = 5;
        ArrayList<ArrayList<Integer> > adj
                    = new ArrayList<ArrayList<Integer> >(V);
         
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
 
        // Adding edges one by one
        createGraph(adj, 0, 1);
        createGraph(adj, 0, 4);
        createGraph(adj, 1, 2);
        createGraph(adj, 1, 3);
        createGraph(adj, 1, 4);
        createGraph(adj, 2, 3);
        createGraph(adj, 3, 4);
		
        print(adj);
		
	}

}
