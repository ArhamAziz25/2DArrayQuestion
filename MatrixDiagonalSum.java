public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int arr[][]={{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{2,2,2,2,2}};

        int i=0;
        int j=0;
        int sum2=0;
        int k=arr[0].length-1;
        int sum=0;
        while(i<=arr.length-1)
        {
            sum=sum+arr[i][j];
            sum2=sum2+arr[i][k];
            i++;
            j++;
            k--;

        }
        if(arr.length%2==0)
        {

            System.out.println(sum+sum2);
        }
        else{
            System.out.println(sum+sum2-arr[arr.length/2][arr[0].length/2]);
        }

        
       
    }
    
}
