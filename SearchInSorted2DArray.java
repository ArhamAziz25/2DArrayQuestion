public class SearchInSorted2DArray {
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=39;
        int i=0;
        int j=arr.length-1;

        while(i<=arr.length-1 && j>=0)
        {
            if(arr[i][j]==target)
            {
                System.out.println("Found!!!!");
                System.exit(1);
            }
            else if(arr[i][j]<target)
            {
                i++;

            }
            else if(arr[i][j]>target)
            {
                j--;
            }
        }
        System.out.println("Not found!!!");
        
    }
    
}
