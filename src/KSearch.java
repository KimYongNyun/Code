import java.util.ArrayList;
import java.util.Arrays;

public class KSearch {

    public int[] solution(int[] array, int[][] commands) {
        int[] newInt = new int[array.length];
        String newStr;
        String originStr;

        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i< array.length; i++){
            sb.append(Integer.toString(array[i])); //문자열로
        }

        int selected = 0;                           //선택된 수
        ArrayList<Integer> list = new ArrayList<>(); //리턴값 담을 곳

        //2차원 배열 행의 갯수는 ?? int.length  //열의 갯수 : int[0].length


        for(int row=0; row<commands.length;row++){
            int i = commands[row][0]; //i
            int j = commands[row][1]; //j
            int k = commands[row][2]; //k

            //함수이용
            originStr = sb.toString();
            newStr = originStr.substring(i-1,j); //문자열 자르기  5432


            char[] newChr = newStr.toCharArray();  //배열로 바꾸고 5 4 3 2
            Arrays.sort(newChr);//정렬   2 3 4 5

            int num = newChr[k-1]-'0';
            list.add(num);             //리스트에 넣기 3
        }


        int[] answer = new int[commands.length];

        for(int i=0 ;i<commands.length;i++){
            answer[i] = list.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {

    }
}
