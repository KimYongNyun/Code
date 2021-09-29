public class Edge1 implements  Comparable<Edge1>{
    public int weight;
    public String nodeV;
    public String nodeU;

    public Edge1(int weight, String nodeV, String nodeU){
        this.weight = weight;
        this.nodeV = nodeV;
        this.nodeU = nodeU;
    }

    public String toString(){
        return "("+this.weight+", "+this.nodeV+", "+this.nodeU +")";
    }


    @Override
    public int compareTo(Edge1 o) {
        return this.weight - o.weight;
    }
}
