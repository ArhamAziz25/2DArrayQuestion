class RotateImage
{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        //Trasposing the matrix
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        
        //Rotation of matrix
        for (int[] a : arr) {
            int i=0;
            int j=a.length-1;
           while(i<=j)
           {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
           }
        }
        

    }
}