package mDijkstraAlgorithm;

import controller.Controller;
import java.io.IOException;
import maisd.ReadFile;

public class main {

    public static void main(String[] args) throws IOException, Exception {
        /*  DirectedGraph graph = new DirectedGraph(7);
         graph.addEdge(new DirectedEdge(0, 1, 4));
         graph.addEdge(new DirectedEdge(0, 2, 3));
         graph.addEdge(new DirectedEdge(0, 3, 7));

         graph.addEdge(new DirectedEdge(1, 3, 1));
         graph.addEdge(new DirectedEdge(1, 5, 4));

         graph.addEdge(new DirectedEdge(2, 3, 3));
         graph.addEdge(new DirectedEdge(2, 4, 5));

         graph.addEdge(new DirectedEdge(3, 4, 2));
         graph.addEdge(new DirectedEdge(3, 5, 2));
         graph.addEdge(new DirectedEdge(3, 6, 7));

         graph.addEdge(new DirectedEdge(4, 6, 2));

         graph.addEdge(new DirectedEdge(5, 6, 4));

         int source = 1;
         DijkstraShortestPath shortestPath = new DijkstraShortestPath(graph,
         source);

         // Wyswietla najkrotsze sciezki
         for (int target = 0; target < graph.getNumberOfVertices(); target++) {
         if (shortestPath.hasPathTo(target)) {
         System.out.printf("%d do %d (%d)  ", source, target,
         shortestPath.getDistanceTo(target));
         if (shortestPath.hasPathTo(target)) {
         for (DirectedEdge edge : shortestPath.getPathTo(target)) {
         System.out.print(edge);
         }
         }
         } else {
         System.out.printf("%d do %d - brak sciezki  ", source, target);
         }
         System.out.println();
         }
       
         // for (DirectedEdge edge : shortestPath.getPathTo(3)) 
         System.out.print(6);
         ReadFile rf=ReadFile.Instance("ala.txt");
         rf.read();
         rf.processData();*/
        Controller controller = new Controller("ala.txt", "errands.txt");
        for (int i = 0; i < controller.getSizeOfProcessDataFromErrandFile(); i++) {
            controller.print(i);
        }
    }
}
