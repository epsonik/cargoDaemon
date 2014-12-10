package view;

import mDijkstraAlgorithm.DijkstraShortestPath;
import mDijkstraAlgorithm.DirectedEdge;

public class Print {

    public void print(int NumberOfVertices, int source, DijkstraShortestPath shortestPath) {
        for (int target = 0; target < NumberOfVertices; target++) {
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
    }

    public Print(int NumberOfVertices, int source, DijkstraShortestPath shortestPath) {
        print(NumberOfVertices,source,shortestPath);
    }
}
