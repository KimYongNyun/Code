import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithm1 {

    public void knapsackFunc(int[][] objectList, double capacity) {
        double totalValue = 0.0;
        double fraction = 0.0;

        // 정렬하기
        Arrays.sort(objectList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[1]/o2[0]) - (o1[1]/o1[0]);
            }
        });

        for(int i = 0 ; i < objectList.length ; i++){
            if((capacity - (double)objectList[i][0]) >= 0){
                capacity -= (double)objectList[i][0];
                totalValue += (double)objectList[i][1];
                System.out.println(objectList[i][0] + ", " + objectList[i][1] + ": " + 1);
            }else {
                fraction = capacity / (double)objectList[i][0];
                totalValue += (double)objectList[i][1] * fraction;
                System.out.println(objectList[i][0] + ", " + objectList[i][1] + ": " + fraction);
                break;
            }
        }

    }


    public static void main(String[] args) {

    }
}
