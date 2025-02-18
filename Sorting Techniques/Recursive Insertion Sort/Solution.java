class Solution{
    public static void insertion_sort(int[] arr, int i, int n)
    {
        if (i == n) return;
        int j = i;
        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        insertion_sort(arr, i+1, n);

    }
    public static void main(String[] args){
        int[] arr = {1,6,0,5,2};
        int n = arr.length;
        
        insertion_sort(arr, 0, n);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]);
              
        }
    }
    
}
