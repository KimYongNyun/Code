public class HIndex {

    public static void main(String[] args) {
        //[3, 0, 6, 1, 5] 답 3
        int[] citations = {3, 0, 6, 1, 5};

        Integer[] chk = new Integer[citations.length];

        for(int i = 0; i < citations.length ; i++)
        {
            chk[i] = citations[i];
        }

        int answer = 0;

        int cnt = 0;
        int value = 0;
        for(int i = 0 ;  i< chk.length-1 ; i++ )
        {
            if( i == 0)
            {
                value = chk[i];
            }

            if(value > chk[i+1])
            {
                cnt++;
            }else
            {
                value = chk[i+1];
            }
        }

        System.out.println(cnt);

    }
}
