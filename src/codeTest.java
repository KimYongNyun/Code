public class codeTest {

    public static void main(String[] args) {

        int[] nums = {1,2,7};

        int answers = solution(nums);
        System.out.println("시작");
        System.out.println(answers);
    }

    public static int solution(int[] nums){
        int answer = 0;

        int n = nums.length;

        for(int i= 0; i < n-2 ; i++)
        {
            for(int j = i+1 ; j < n-1; j++)
            {
                for(int k = j+1 ; k < n ; k++)
                {
                    int sum = nums[i]+nums[j]+nums[k];
                    int l = (int)Math.sqrt(sum);
                    for(; l > 1 ; l++)
                    {
                        if(sum%l == 0)
                        {
                            break;
                        }
                    }
                }
            }
        }

        return answer;
    }

}
