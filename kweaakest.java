import java.util.Arrays;

public class kweaakest {
    public static void main(String[] args) {
        int arr[][]={{1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}};
            int res[]=new int[arr.length];
            int cloneArray[]=new int[arr.length];

            int count=0;
            for(int i=0;i<arr.length;i++)
            {
                count=0;
                for(int j=0;j<arr[0].length;j++)
                {
                    if(arr[i][j]==1)
                    {
                        count++;
                    }

                    res[i]=count;
                }
            }

      
           for(int i=0;i<res.length;i++)
           {
            System.out.println(res[i]);
           }

           cloneArray = res.clone();  
           Arrays.sort(cloneArray);

           for(int i=0;i<cloneArray.length;i++)
           {
            

            
           }



    }
    
}
