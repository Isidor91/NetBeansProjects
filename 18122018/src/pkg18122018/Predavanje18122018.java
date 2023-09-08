package pkg18122018;
public class Predavanje18122018 
{
    public static void main(String[] args)
    {
        int n = 8;
       int[][]mat = new int [n][];
       for(int i = 0;i<mat.length;i++)
       {
            mat[i] = new int [(int)(Math.random()*n+1)];
           for(int j  = 0 ;j<mat[i].length;j++)
           {
                if((i+j)%2==0)mat[i][j]=1;
                 System.out.print(mat[i][j]+" ");
           }
        System.out.println("");
       }
}
}