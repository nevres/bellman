/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bellman;
 
public class BellmanFord {
    
    int infinity = 1000;
    int[] distance;
    
     public void print_result(Edge [] edges, int src){
        
        int weight;
        
        for (Edge e: edges) {
            
            weight = distance[e.getSrc()] + e.getWeight();
        
            if (infinity != distance[e.getSrc()] && distance[e.getDist()] > weight)
            {
                System.out.println("There is negative weighted cycle");
                return;
            }
        }
        
        for (int i = 0; i < distance.length; ++i){
                System.out.println("Shortest path " + src + " - " + i + " is " + distance[i]);
        }
    }
    
    public void findShortestPath(Edge [] edges, int numberOfNodes, int src)
    {
        distance = new int[numberOfNodes];
       
        for (int i = 0; i < distance.length; i++) {
            distance[i] = infinity;
        }
        
        distance[src] = 0;
        
        //running relaxation for times = numberOfNodes
        for (int i = 0; i < numberOfNodes; ++i)
            //running relaxation for every edge in edges array
            for (int j = 0; j < edges.length; ++j) {
                //if distance of the source edge is equal to infinity
                //we are not doing anything
                if (distance[edges[j].getSrc()] == infinity){
                    continue;
                }
                
                //if source distance and weight of the edge is less than distance of the destination node we are relaxing
                int newDistance = distance[edges[j].getSrc()] + edges[j].getWeight();
                
                if (newDistance < distance[edges[j].getDist()]){
                    distance[edges[j].getDist()] = newDistance;
                }
            }
    }
}
