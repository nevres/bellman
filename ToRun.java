/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bellman;

/**
 *
 * @author Phoenix
 */
public class ToRun {
    public static void main(String[] args) {
            BellmanFord f = new BellmanFord();
            Edge [] edges = new Edge[9];
            
            edges[0] = (new Edge(0, 1, 5));
            edges[1] = (new Edge(1, 2, 1));
            edges[2] = (new Edge(2, 5, 3));
            edges[3] = (new Edge(0, 3, -2));
            edges[4] = (new Edge(4, 3, 3));
            edges[5] = (new Edge(4, 5, 10));
            edges[6] = (new Edge(3, 1, 2));
            edges[7] = (new Edge(2, 3, 2 ));
            edges[8] = (new Edge(2, 4, -7));
            f.findShortestPath(edges, 6, 0);
            f.print_result(edges, 0);
	}
}
