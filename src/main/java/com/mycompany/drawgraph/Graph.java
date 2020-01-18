/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drawgraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rahul T V
 */
public class Graph implements IGraph<Integer>{
    
    private List<Integer> vertices;
    private Map<Integer,List<Integer>> adjacencies;

    public Graph() {
        this.vertices = new ArrayList<>();
        this.adjacencies = new HashMap<>();
    }

    public Map<Integer, List<Integer>> getAdjacencies() {
        return adjacencies;
    }
    
    

    @Override
    public int addVertex(Integer v) {
        if(vertices.contains(v)){
            return 0;  
        }else{
            vertices.add(v);
            adjacencies.put(v, new ArrayList<>());
            return 1;
        }
    }

    @Override
    public void removeVertex(Integer v) {
        if(vertices.contains(v)){
            vertices.remove(v); 
            adjacencies.remove(v);
        }
    }

    @Override
    public void addEdge(Integer v1, Integer v2) {
        List<Integer> adjescentVerticesV1 = neighbors_of(v1);
        adjescentVerticesV1.add(v2);
        addVertex(v2);
        List<Integer> adjescentVerticesV2 = neighbors_of(v2);
        adjescentVerticesV2.add(v1);
    }

    @Override
    public void addEdge(int i, int j) {
        Integer vi = this.vertices.get(i);
        Integer vj = this.vertices.get(j);
        addEdge(vi, vj);
    }

    @Override
    public void removeEdge(Integer v1, Integer v2) {
        List<Integer> adjescentVertices = neighbors_of(v1);
        adjescentVertices.remove(v2);
        List<Integer> adjescentVerticesV2 = neighbors_of(v2);
        adjescentVerticesV2.add(v1);
        removeVertex(v2);
    }

    @Override
    public void removeEdge(int i, int j) {
        Integer vi = this.vertices.get(i);
        Integer vj = this.vertices.get(j);
        removeEdge(vi, vj);
    }

    @Override
    public boolean isAdjacent(Integer v1, Integer v2) {
        List<Integer> adjescentVertices = neighbors_of(v1);
        if(adjescentVertices.contains(v2)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isAdjacent(int i, int j) {
        Integer vi = this.vertices.get(i);
        Integer vj = this.vertices.get(j);
        return isAdjacent(vi, vj);
    }

    @Override
    public List<Integer> getVertices() {
        return vertices;
    }

    @Override
    public List<Integer> neighbors_of(Integer v) {
        return adjacencies.get(v);
    }

    @Override
    public String toString() {
        System.out.println("string");
        return "Graph{" + "vertices=" + vertices + ", adjacencies=" + adjacencies + '}';
    }
    
    
    
}
