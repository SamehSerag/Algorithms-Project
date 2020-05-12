package task1;

import java.util.Vector;

public class Matrices {
    private graph graph;

    Matrices(graph graph){
        this.graph = graph;
    }

    public int[][] adjacentMatrix(){
        int mat[][];
        mat = new int[graph.vertices.size()][graph.vertices.size()];
        for(int i = 0 ; i < graph.edges.size() ; i++){
            int row = graph.vertices.indexOf(graph.edges.get(i).initial);
            int col = graph.vertices.indexOf(graph.edges.get(i).terminate);
            mat[row][col] = 1;
        }
        return mat;
    }

    public int [][] representationMatrix(){
        int mat[][];
        mat = new int[graph.vertices.size()][graph.vertices.size()];
        for(int i = 0 ; i < graph.edges.size() ; i++){
            int row = graph.vertices.indexOf(graph.edges.get(i).initial);
            int col = graph.vertices.indexOf(graph.edges.get(i).terminate);
           if(row != col) mat[row][col] += 1;
           else mat[row][col] = 1;
        }
        return mat;
    }

    public int [][]  IncidenceMatrixDirected(){
        int mat[][];
        mat = new int[graph.vertices.size()][graph.edges.size()];

        for(int i = 0 ; i < graph.edges.size() ; i++){
            int row = graph.vertices.indexOf(graph.edges.get(i).initial);
            mat[row][i] = 1;
            row = graph.vertices.indexOf(graph.edges.get(i).terminate);
            mat[row][i] = -1;
        }
        return  mat;
    }

    public int [][] IncidenceMatrixUndirected(){
        int mat[][];
        mat = new int[graph.vertices.size()][graph.edges.size()/2];
        for(int i = 0 ; i < graph.edges.size() ; i++){
            int row = graph.vertices.indexOf(graph.edges.get(i).initial);
            mat[row][i/2] = 1;
        }
        return mat;
    }

   /** void print(){
        int row = mat.length;
        int col = mat[0].length;
        for(int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }**/

}
