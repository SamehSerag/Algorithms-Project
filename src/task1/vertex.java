package task1;

import java.util.Vector;

public class vertex {
    String vertexName ;
    Vector<String> adjacentVertices;
    public vertex(String vertexName){
        this.vertexName = vertexName;
        adjacentVertices = new Vector<>();
    }
    public void addAdjacentVertex(String terminalVertex){
        adjacentVertices.add(terminalVertex);
    }
}
