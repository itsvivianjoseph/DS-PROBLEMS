public class distinctelesum {
    public static void main(String[] args) {
        //assume that 0<=nums[i]<=100
        int[] nums = {1,2,3,4,5,5};
        int[] arr = new int[nums.length];
        for(int x : nums){
            arr[x]+=1;
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1) 
            {sum+=i;}
        }
        System.out.println(sum);
    }
}
