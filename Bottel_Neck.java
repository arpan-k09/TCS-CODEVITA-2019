import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Arrays; 
import java.util.Scanner;

public class Bottel_Neck
{ 
    
	public static void main(String args[]) 
	{  
		 
                int num;
                Scanner s=new Scanner(System.in);
                num=s.nextInt();
                int ar[]=new int[num];
                
                
                
                for(int i=0;i<num;i++)
                {
                    ar[i]=s.nextInt();
                }
             
		int leng = ar.length; 
		Arrays.sort(ar); 
                Queue<Integer> que = new LinkedList<>();
		que.add(ar[0]); 
		for (int i = 1; i < leng; i++) 
		{ 
			int now = que.element(); 
			if (ar[i] >  now) 
			que.remove(); 
			que.add(ar[i]); 
		} 
            System.out.println(que.size());  
	} 
} 