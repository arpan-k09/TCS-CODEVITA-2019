import java.util.Scanner;

public class Similar_Char 
{
    
    public static void main(String[] args) 
	{
        
        
        String tempu1=new String("");
        int co1[];
        
	Scanner in=new Scanner(System.in);

	int pu1[];
        int n,qu1,i;

	n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        qu1=in.nextInt();
        pu1=new int[qu1];
        co1=new int[qu1];
        for(i=0;i<qu1;i++)
        {
            pu1[i]=in.nextInt();
        }
        
        for(i=0;i<qu1;i++)
        {
            tempu1=s.substring(0,(pu1[i]-1));
            char ca=s.charAt(pu1[i]-1);
            
            for(int j=0;j<tempu1.length();j++)
            {
                char ch=tempu1.charAt(j);
                if(ch==ca)
                {
                    co1[i]++;
                }
            }
        }
        
       for(i=0;i<qu1-1;i++)
       {
           System.out.println(co1[i]+" ");
       }
      System.out.print(co1[i]);
        
    }
    
}