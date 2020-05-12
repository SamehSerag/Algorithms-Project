package task1;

import java.util.Vector;

public class adjacencyList {
    Vector<vertex> vertices ;
    graph graph;
    adjacencyList(graph graph){
        vertices = new Vector<>();
        this.graph = graph;
    }
    /**adjacencyList(Vector <vertex> vertices){
     this.vertices = new Vector<>();
     for(int i = 0 ; i < vertices.size() ; i++)
     {
     vertex tem = new vertex(vertices.get(i).vertexName);
     this.vertices.add(tem);
     tem.addAdjacentVertex(vertices.get(i).adjacentVertices);
     }
     }
     **/
    public Vector<vertex> build(){
        for(int i = 0 ; i < graph.vertices.size() ; i++)
            addVertex(graph.vertices.get(i));
        for(int i = 0 ; i < graph.edges.size() ; i++)
            addAdjacentVertex(graph.edges.get(i).initial,graph.edges.get(i).terminate);
        return vertices;
    }
    private  void addVertex(String vertexName){
        vertices.add(new vertex(vertexName));
    }

    private void addAdjacentVertex(String initialVertex , String terminalVertex){
        int index = search(initialVertex);
        if (index == -1) return;
        vertices.get(index).addAdjacentVertex(terminalVertex);
    }
    private int search(String vertexName){
        for(int i = 0 ; i < vertices.size() ; i++ ){
            if (vertices.get(i).vertexName.equals(vertexName)){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for(int i = 0 ; i < vertices.size() ; i++ ){
            System.out.print(vertices.get(i).vertexName + " : " );
            for(int j = 0 ; j < vertices.get(i).adjacentVertices.size() ; j++ ){
                System.out.print(vertices.get(i).adjacentVertices.get(j) + " ");
            }
            System.out.println();
        }
    }
}
