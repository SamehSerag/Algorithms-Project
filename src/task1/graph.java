package task1;

import java.util.Set;
import java.util.Vector;


class edge{
    String initial;
    String terminate;
    String name;
    edge(String name, String initial,String terminate){
        this.initial = initial;
        this.terminate = terminate;
        this.name = name;
    }
}
public class graph {
    Vector <String> vertices ;
    Vector <edge> edges;

    public graph(){
        vertices = new Vector<>();
        edges = new Vector<>();
    }

    public void addVertex(String vertexName){
        vertices.add(vertexName);
    }

    public void addAdjacentVertex(String name, String initialVertex , String terminalVertex){
        edges.add(new edge(name,initialVertex,terminalVertex));
    }

    public Vector<edge> getEdges() {
        return edges;
    }

    public Vector<String> getVertices() {
        return vertices;
    }

    public Vector<vertex> adjacencyList(){
        adjacencyList adjacencyList = new adjacencyList(this);
        return adjacencyList.build();
    }

    public int[][] IncidenceMatrixDirected(){
        Matrices matrex = new Matrices(this);
        return matrex.IncidenceMatrixDirected();
    }

    public int[][]  IncidenceMatrixUndirected(){
        Matrices matrex = new Matrices(this);
        return matrex.IncidenceMatrixUndirected();
    }

    public int[][] adjacentMatrix(){
        Matrices matrex = new Matrices(this);
        return matrex.adjacentMatrix();
    }

    public int[][] representationMatrix(){
        Matrices matrex = new Matrices(this);
        return matrex.representationMatrix();
    }

}
