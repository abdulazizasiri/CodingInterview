public class removeDuplicates{
   
     public int removeDuplicates(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
        int j = 0;
     
        for (int i=0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[++j] = arr[i];
     
        arr[j++] = arr[n-1];

        return j;
    }
    public int removeDuplicates(int[] nums) {
    int length = nums.length ; 
    int j = removeDuplicates(nums, length);
    return j ;
    }

} 