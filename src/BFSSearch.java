import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BFSSearch {
    public ArrayList<String> bfsFunc(HashMap<String, ArrayList<String>> graph, String startNode)
    {
        ArrayList<String> visited = new ArrayList<String>();
        ArrayList<String> needVisit = new ArrayList<String>();

        needVisit.add(startNode);
        System.out.println("+++++ needVisit :"+needVisit);
        System.out.println("+++++ needVisit.size() :"+needVisit.size());
        while (needVisit.size() > 0) {
            String node = needVisit.remove(0);
            System.out.println("++++++++++++++++node1 : "+node);
            if (!visited.contains(node)) {
                System.out.println("++++++++++++++++node2 : "+node);
                visited.add(node);
                System.out.println("++++++++++++++++visited : "+visited);

                needVisit.addAll(graph.get(node));

                System.out.println("++++++++++++++++needVisit : "+needVisit);
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();
        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));

        System.out.println("+++++++graph: "+graph);
        BFSSearch bObject = new BFSSearch();
        System.out.println(bObject.bfsFunc(graph, "A"));
    }
}
