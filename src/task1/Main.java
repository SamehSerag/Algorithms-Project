package task1;


import java.util.Scanner;
import java.util.Vector;

import java.awt.Dimension;

import javax.swing.JFrame;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
//import jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import org.apache.commons.collections15.Transformer;

public class Main {
    public  static Scanner input = new Scanner(System.in);
    public static void main (String arg[]) {
        DirectedSparseGraph<String, String> directedGraph = new DirectedSparseGraph<String, String>();
        SparseGraph<String, String> unDirectedGraph = new SparseGraph<String, String>();

        int verticesNumber;
        String vertixName;
        graph graph = new graph();
        boolean directed = false;
        int edgesKind = 0;

        while (edgesKind != 1 && edgesKind != 2) {
            System.out.print("if graph directed enter 1 , else enter 2 :");
            edgesKind = input.nextInt();
            if (edgesKind == 1) directed = true;


        }

        System.out.print("Enter num of vertices : ");
        verticesNumber = input.nextInt();
        for (int i = 0; i < verticesNumber; i++) {
            System.out.print("Enter name of vertex " + (i + 1) + " : ");
            vertixName = input.next();
            graph.addVertex(vertixName);
        }
        //For GUI
        Vector<String> vertices = new Vector<>();
        vertices = graph.getVertices();

        if (directed == true) {
            for (int i = 0; i < vertices.size(); i++) {
                directedGraph.addVertex(vertices.get(i));
            }
        } else {
            for (int i = 0; i < vertices.size(); i++) {
                unDirectedGraph.addVertex(vertices.get(i));
            }
        }

        while (true) {
            System.out.println("If you want enter new edge, enter 1 \n If you don't, enter 0 :");
            int choice = input.nextInt();
            if (choice != 1 && choice != 0) {
                System.out.print("Wrong enter");
                continue;
            } else if (choice == 0)
                break;
            else {
                System.out.print("Enter name of edge :");
                String name = input.next();
                System.out.print("Enter Initial Vertex : ");
                String initial = input.next();
                System.out.print("Enter Terminal  Vertex :");
                String terminal = input.next();
                graph.addAdjacentVertex(name, initial, terminal);
                if (directed == false) {
                    graph.addAdjacentVertex(name, terminal, initial);
                    unDirectedGraph.addEdge(name, initial, terminal);
                } else
                    directedGraph.addEdge(name, initial, terminal);
            }
        }

        int IncidenceMatrix[][];

        System.out.println("adjacency list : ");
        Vector<vertex> adjacencyList = graph.adjacencyList();///after it print

        for(int i = 0 ; i < adjacencyList.size() ; i++ ){
            System.out.print(adjacencyList.get(i).vertexName + " : " );
            for(int j = 0 ; j < adjacencyList.get(i).adjacentVertices.size() ; j++ ){
                System.out.print(adjacencyList.get(i).adjacentVertices.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("\nadjacency matrix : ");
        int adjacentMatrix[][] = graph.adjacentMatrix();
        int row = adjacentMatrix.length;
        int col = adjacentMatrix[0].length;
        for(int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                System.out.print(adjacentMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nIncidence matrix : ");
        if (directed == true) IncidenceMatrix = graph.IncidenceMatrixDirected();
        else IncidenceMatrix = graph.IncidenceMatrixUndirected();

        int row1 = IncidenceMatrix.length;
        int col1 = IncidenceMatrix[0].length;
        for(int i = 0 ; i < row1 ; i++){
            for (int j = 0 ; j < col1 ; j++){
                System.out.print(IncidenceMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nRepresentation matrix : ");
        int representationMatrix[][] = graph.representationMatrix();


        int row2 = representationMatrix.length;
        int col2 = representationMatrix[0].length;
        for(int i = 0 ; i < row2 ; i++){
            for (int j = 0 ; j < col2 ; j++){
                System.out.print(representationMatrix[i][j] + " ");
            }
            System.out.println();
        }

        VisualizationImageServer<String, String> vs;

        if (directed == true){
            vs =
                    new VisualizationImageServer<String, String>(new CircleLayout<String, String>(directedGraph), new Dimension(200, 200));
        }
        else{
            vs =
                    new VisualizationImageServer<String, String>(new CircleLayout<String, String>(unDirectedGraph), new Dimension(200, 200));

        }

        Transformer<String, String> transformer1 = new Transformer<String, String>() {

            @Override
            public String transform(String arg0){
                return arg0;
            }
        };

        vs.getRenderContext().setEdgeLabelTransformer(transformer1);

        Transformer<String, String> transformer2 = new Transformer<String, String>() {

            @Override
            public String transform(String arg0) {
                return arg0.toString();
            }

        };

        vs.getRenderContext().setVertexLabelTransformer(transformer2);
        JFrame frame = new JFrame();
        frame.getContentPane().add(vs);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,400);

    }
}
