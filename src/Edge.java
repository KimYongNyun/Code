public class Edge implements  Comparable<Edge>{
    public Integer distance;
    public String vertex;

    public Edge(Integer distance, String vertex){
        this.distance = distance;
        this.vertex = vertex;
    }

    public String toString()
    {
        return "vertext : "+this.vertex +", distance : "+this.distance;
    }

    @Override
    public int compareTo(Edge o) {
        return this.distance - o.distance;
    }
}
