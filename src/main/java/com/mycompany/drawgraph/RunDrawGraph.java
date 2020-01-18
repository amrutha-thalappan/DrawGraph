/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drawgraph;

/**
 *
 * @author Rahul T V
 */
public class RunDrawGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Graph();
        System.out.println("Start");
        graph.addVertex(10);
        graph.addVertex(20);
        graph.addVertex(30);
        graph.addVertex(40);
        graph.addVertex(50);
        graph.addVertex(60);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(4,5);
        //graph.removeEdge(4,5);
       // graph.removeEdge(0,4);
        //graph.removeVertex(50);
        System.out.println(graph.toString());
    }
    
}
