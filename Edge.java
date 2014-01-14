/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bellman;

/**
 *
 * @author Phoenix
 */
public class Edge {
    private int src;
    private int dist;
    private int weight;
    
    public Edge(){
    };
    
    public Edge(int _src, int _dist, int _w) {
        src = _src;
        dist = _dist;
        weight = _w;
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public int getDist() {
        return dist;
    }

    public void setDest(int dist) {
        this.dist = dist;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    
}
