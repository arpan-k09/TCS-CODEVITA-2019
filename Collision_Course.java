import java.util.ArrayList;
import java.util.Scanner;
public class Collision_Course 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList col=new ArrayList();
        int i;
        int cou1=0,cn=0;
        int c=sc.nextInt();
        int pos[][]=new int[c][3];
        double time[]=new double[c];
        for(i=0;i<c;i++)
        {
            for(int j=0;j<3;j++)
            {
                pos[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<c;i++)
        {
            int x=pos[i][0];
            int y=pos[i][1];
            double dis=Math.sqrt(x*x+y*y);
            time[i]=dis/(double)pos[i][2];
        }
        for(i=0;i<c;i++)
        {
            
            if(!col.contains(time[i]))
            {
                col.add(time[i]);
            }
        }
        int size=col.size();
        for(i=0;i<size;i++)
        {
            double temp=(double)col.get(i);
            for(int j=0;j<c;j++)
            {
                if(temp==time[j])
                    cn++;
            }
            cou1=cou1+((cn*(cn-1))/2);
            cn=0;
        }
        System.out.println(cou1);
    }
}
