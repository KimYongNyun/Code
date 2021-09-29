import java.util.Arrays;
import java.util.Comparator;

public class MaxSearch {



    public static void main(String[] args) {
        int[] numbers = {3, 30, 34,5,9};

        Integer[] array = new Integer[numbers.length];

        //System.out.println(numbers[0]);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< array.length ; i++)
        {
            array[i] = numbers[i];
            //System.out.println(array[i]);
        }

        //값 비교
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String tmp1 =o1.toString();
                String tmp2 =o2.toString();

                //System.out.println((tmp2+tmp1));
                //System.out.println((tmp1+tmp2));
                return ((tmp2+tmp1)).compareTo(tmp1+tmp2);
            }
        });


        String answer = "";

        for(int i=0; i<array.length; i++){

            answer += String.valueOf(array[i]);
            System.out.println(answer);
        }

        if("0".equals(answer.substring(0,1)))
        {
            answer =  "0";
        }

        System.out.println(answer);


    }
}
