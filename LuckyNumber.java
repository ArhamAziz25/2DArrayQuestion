import java.util.ArrayList;

class LuckyNumber
{
    public static void main(String[] args) {
        int arr[][]={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        ArrayList<Integer> Mininrow=new ArrayList<>();
        ArrayList<Integer> maxincolumn=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                min=Math.min(min, arr[i][j]);
            }
            Mininrow.add(min);
            min=Integer.MAX_VALUE;
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length-1;j++)
            {
                max=Math.max(max, arr[j][i]);

            }
            maxincolumn.add(max);
            max=Integer.MIN_VALUE;

        }

        for (Integer i : Mininrow) {
            if(maxincolumn.contains(i))
            {
                System.out.println(i);
            }
            
        }
    }
}