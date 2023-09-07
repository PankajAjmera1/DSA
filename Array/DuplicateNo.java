//Time complexity O(n^2)

public class DuplicateNo {
    public static void main(String[] args) {
        int []nums ={1,2,3,4,4};
        int n = nums.length;
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j]){
                   int duplicate = nums[i];
                   System.out.println(duplicate);
                }
            }
        }
        
    }
    
}
