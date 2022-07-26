import java.util.Arrays;

public class pt01 {
        public int solution(int[] nums) {
            int answer = 0;
            int count = 0;
            Arrays.sort(nums);
            for(int i =1; i < nums.length; i++) {
                if (nums[i - 1] != nums[i]) {
                    count++;
                }
            }

                if(count > nums.length/2){
                    count = nums.length/2;
                }
                answer = count;


            return answer;
        }
}


