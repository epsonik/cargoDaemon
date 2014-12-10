package controller;

import java.util.ArrayList;
import mDijkstraAlgorithm.*;
import maisd.ProcessDataFromConnectionsFile;
import maisd.ProcessDataFromErrandFile;
import maisd.ReadFile;
import view.Print;

public class Controller {

    private DirectedGraph graph;
    private Print print;
    private DirectedEdge directedEdge;
    private ProcessDataFromConnectionsFile pdfcf;
    private ProcessDataFromErrandFile pdfef;
    private ReadFile rfConnections;
    private ReadFile rfErrands;
    private int numberOfVertices = 4;
    private int source = 3;
    private DijkstraShortestPath shortestPath;

    private void setNumberOfVertices() {
    }

    public int getSizeOfProcessDataFromErrandFile() {
        return pdfef.getSize();
    }

    public Controller(String connections, String errands) throws Exception {
        rfConnections = new ReadFile(connections);
        rfErrands = new ReadFile(errands);
        rfConnections.read();
        rfErrands.read();
        pdfcf = new ProcessDataFromConnectionsFile(rfConnections);
        pdfef = new ProcessDataFromErrandFile(rfErrands);
        graph = new DirectedGraph(numberOfVertices);
        useDataFromConnectionsFile();
        this.shortestPath = new DijkstraShortestPath(this.graph,
                this.source);
    }

    private void useDataFromConnectionsFile() {
        for (ArrayList<Integer> ch : pdfcf.getConnections()) {
            this.graph.addEdge(new DirectedEdge(ch.get(0), ch.get(1), ch.get(2)));
        }
    }

    private void useDataFromErrandFile() {
        for (ArrayList<Integer> ch : pdfcf.getConnections()) {
            this.graph.addEdge(new DirectedEdge(ch.get(0), ch.get(1), ch.get(2)));
        }
    }

    public void print(int i) {
        print = new Print(this.numberOfVertices, this.source, this.shortestPath);

        System.out.println(pdfef.getNumber(i) + " " + pdfef.getStart(i) + " " + pdfef.getEnd(i) + " " + pdfef.getName(i) + "" + pdfef.getPriority(i));
    }

}
