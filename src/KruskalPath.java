import jdk.nashorn.api.tree.ArrayLiteralTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//최소 신장 트리 알고리즘
public class KruskalPath {
    HashMap<String, String> parent = new HashMap<String, String>();
    HashMap<String, Integer> rank = new HashMap<String, Integer>();

    public String find(String node){
        if(this.parent.get(node) != node){
            this.parent.put(node, find(this.parent.get(node)));
        }

        return this.parent.get(node);
    }

    public void union(String nodeV, String nodeU){
        String root1 = find(nodeV);
        String root2 = find(nodeU);

        if(this.rank.get(root1) > this.rank.get(root2)) {
            this.parent.put(root2, root1);
        }else
        {
            this.parent.put(root1, root2);
            if(this.rank.get(root1) == this.rank.get(root2)){
                this.rank.put(root2, this.rank.get(root2) +1);
            }
        }
    }

    public void makeSet(String node){
        this.parent.put(node, node);
        this.rank.put(node, 0);
    }

    public ArrayList<Edge1> kruskalFunc(ArrayList<String> vertices, ArrayList<Edge1> edges){
        ArrayList<Edge1> mst = new ArrayList<Edge1>();
        Edge1 currentMode;

        //1. 초기화
        for(int index= 0; index < vertices.size() ; index++){
            makeSet(vertices.get(index));
        }

        Collections.sort(edges);

        for(int index = 0; index < edges.size() ; index++)
        {
            currentMode = edges.get(index);
            if(find(currentMode.nodeV) != find(currentMode.nodeU)){
                union(currentMode.nodeV, currentMode.nodeU);
                mst.add(currentMode);
            }
        }

        return mst;

    }

    public static void main(String[] args) {

    }
}
