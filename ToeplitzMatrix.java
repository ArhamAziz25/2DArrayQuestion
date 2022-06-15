public class ToeplitzMatrix {
    public static void main(String[] args) {
        int arr[][]= {{18},{66}};
        int i=0;
        int j=0;
        int count=0;
        if(arr.length==1)
        {
            System.out.println("false");
            System.exit(1);
        }
        while(i<arr.length-1)
        {
            if(arr[i][j]==arr[i+1][j+1])
            {
                count++;
                i++;
                j++;
            }else{
                break;
            }

        }
        if(count==arr.length-1)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}
