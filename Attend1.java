import java.io.*;
import java.util.*;
class Choice 
{       
        
	void choice(String p,int t,String w)
               {     		int m;
				System.out.println("Choose the index of the month\n1.July\n2.August\n3.September\n4.October\n");
        			Scanner q=new Scanner(System.in);
        			m=Integer.parseInt(q.nextLine());
				switch(m)
				{
				case 1:
				case 2:
				case 3:
				case 4:Zwitch(p,t,w);break;
				}
		}

	void Zwitch(String p,int t,String w)
	{		Scanner q=new Scanner(System.in);
        		try{
        			int i,k;
                                int j[]=new int[11];
        			for(i=0;i<10;i++)
                                {
                                  j[i]=0;
                                }

        			int totlec=t;
        		        File x=new File(p);
        		        Scanner sc=new Scanner(x);
		        try{
        				File n=new File("C:\\Users\\DHANESH\\Desktop\\PROJECT\\system\\Defaulter"+w+".txt");
                                                        Scanner M=new Scanner(n);
        					       for(k=0;k<11;k++)
        					       {
        						  j[k]=M.nextInt();
          					       }
        						M.close();
        					       PrintWriter pw=new PrintWriter("C:\\Users\\DHANESH\\Desktop\\PROJECT\\system\\Defaulter"+w+".txt","UTF-8");
        					       System.out.println("Total lectures="+totlec+"\nAny cancelled lectures or holidays?(y/n):");
        					       String s1=q.nextLine();
        					       if(s1.compareToIgnoreCase("y")==0)
        					{	
        						System.out.println("Enter no. of lectures to be reduced");
        						int n1=Integer.parseInt(q.nextLine());
        						totlec=totlec-n1;
                                                        System.out.println("Conducted Lectures="+totlec);

        					}
                                                System.out.println("Enter number of lectures attended against the student's name");
        					int ax=0;
                                                while(sc.hasNextLine())
        					{	
        						if(ax<=9)
        						{String p1=sc.nextLine();
        						System.out.println(p1);
        						int lec=Integer.parseInt(q.nextLine());
                                                       j[ax]=lec=lec+j[ax++];
        						pw.println(lec);
        						}
        						}
        						
        							j[10]=j[10]+totlec;
        						pw.println(j[10]);
        						
        		
        					pw.close();
			                	sc.close();
System.out.println("To enter the number of lectures of another month ENTER 'y' \n To end the program and create a defaulter list ENTER 'n'");					
String po=q.nextLine();
					if(po.compareToIgnoreCase("y")==0)
					{choice(p,t,w);}
                                        if(po.compareToIgnoreCase("n")==0)
                                        { defaulter(p,w);}
                                        
			        
        			}catch(IOException e)
            		{
            			e.printStackTrace();
            		}
            		
            		}catch(Exception e1)
            			{System.out.println("No inputs in File");
            			}
                        list(p);
	}
                	

    void defaulter(String g, String u)
    { 
      String NM[]=new String[10];
      try{
                  File x=new File(g);
                  Scanner sc=new Scanner(x);
        	  int k=0;
      		  while(sc.hasNextLine())
      			{	
        			NM [k++]=sc.nextLine();
       			}
      		float T[]=new float[10];
                float j[]=new float[11];
            try{
      		File n=new File("C:\\Users\\DHANESH\\Desktop\\PROJECT\\system\\Defaulter"+u+".txt");
       		Scanner M=new Scanner(n);
       		for(k=0;k<11;k++)
       		{
  	  		j[k]=Integer.parseInt(M.nextLine());
       		}
		int c=0;
       		for(k=0;k<10;k++)
       		{
			float a=j[c];
			float b=j[10];			
  	  		T[k]=(a/b)*100;
			c++;
       		}
       		M.close();
       		PrintWriter pw=new PrintWriter("C:\\Users\\DHANESH\\Desktop\\PROJECT\\Defaulterlist"+u+".txt","UTF-8");
       		for(k=0;k<10;k++)
       		{
         		if(T[k]<75.00)
         		{
           			pw.println(NM[k]+"\t"+T[k]+"%");
         		}
       		}
                        pw.close();
					
					
			        
			        sc.close();
			        
        			}catch(IOException e)
            		{
            			e.printStackTrace();
            		}
            		
            		}catch(Exception e1)
            			{//System.out.println("No inputs in File");
					e1.printStackTrace();
            			}
   }
 void list(String g)
 {
    String NM[]=new String[10];   
    try{
                  File x=new File(g);
                  Scanner sc=new Scanner(x);
        	  int k=0;
      		  while(sc.hasNextLine())
      			{	
        			NM [k++]=sc.nextLine();
       			}
      		float T[]=new float[10];
		float a[]=new float[11];
                float j[]=new float[11];
                float o[]=new float[11];
            try{
      		File n=new File("C:\\Users\\DHANESH\\Desktop\\PROJECT\\system\\Defaulter_dis.txt");
       		Scanner M=new Scanner(n);
       		for(k=0;k<11;k++)
       		{
  	  		j[k]=Integer.parseInt(M.nextLine());
       		}
		M.close();
		File v=new File("C:\\Users\\DHANESH\\Desktop\\PROJECT\\system\\Defaulter_data.txt");
       		Scanner S=new Scanner(v);
       		for(k=0;k<11;k++)
       		{
  	  		a[k]=Integer.parseInt(S.nextLine());
       		}
      		S.close();
		File r=new File("C:\\Users\\DHANESH\\Desktop\\PROJECT\\system\\Defaulter_oopm.txt");
       		Scanner B=new Scanner(r);
       		for(k=0;k<11;k++)
       		{
  	  		o[k]=Integer.parseInt(B.nextLine());
       		}
		B.close();
                int c=0;
       		for(k=0;k<10;k++)
       		{
			float e=j[c]+a[c]+o[c];
			float y=j[10]+a[10]+o[10];			
  	  		T[k]=(e/y)*100;
			c++;
       		}
		PrintWriter pw=new PrintWriter("C:\\Users\\DHANESH\\Desktop\\PROJECT\\Defaulterlist.txt","UTF-8");
       		for(k=0;k<10;k++)
       		{
         		if(T[k]<75.00)
         		{
           			pw.println(NM[k]+"\t"+T[k]+"%");
         		}
       		}

			
                        pw.close();
			sc.close();
			}catch(IOException e)
            		{
            			e.printStackTrace();
            		}
            		
            		}catch(Exception e1)
            			{
					e1.printStackTrace();
            			}
}
}
         

class Login extends Choice
 {
  void login()
 {	
	Choice c=new Choice();
	Console console=System.console();
	Scanner a=new Scanner(System.in);
	 String s1="C:\\Users\\DHANESH\\Desktop\\PROJECT\\system\\New Text Document.txt";
	 System.out.println("Username:");
	 String u=a.next();
	 System.out.println("Password(will not be visible):");
	 char[] pas=console.readPassword();
	 String p=new String(pas);
	 if(p.compareTo("password")==0)
	 {
		if((u.compareTo("data1")==0)||(u.compareTo("data2")==0))
		{
			System.out.println("Logged in Successfully to Data Structures");
			System.out.println();
			c.choice(s1,10,"_data");
                        System.out.println("To view Defaulter List of Data Structures, open Defaulterlist_data.txt\nTo view overall Defaulter List ,open Defaulterlist.txt\nBoth the files are stored in the folder PROJECT on the DESKTOP.");
		}
	
		else if((u.compareTo("oopm1")==0)||(u.compareTo("oopm2")==0))
		{
			System.out.println("Logged in Successfully to Object Oriented Programming Methodologies");
			System.out.println();
			c.choice(s1,10,"_oopm");
           		System.out.println("To view Defaulter List of Object Oriented Programming Methodologies, open Defaulterlist_oopm.txt\nTo view overall Defaulter List ,open Defaulterlist.txt\nBoth the files are stored in the folder PROJECT on the DESKTOP.");
		}

		else if((u.compareTo("dis1")==0)||(u.compareTo("dis2")==0))
		{
			System.out.println("Logged in Successfully to Discrete Structures");
			System.out.println();
			c.choice(s1,10,"_dis");
			System.out.println("To view Defaulter List of Discrete Structures, open Defaulterlist_dis.txt\nTo view overall Defaulter List ,open Defaulterlist.txt\nBoth the files are stored in the folder PROJECT on the DESKTOP.");
		}
		else 
		{
			System.out.println("Wrong Username");
			login();
		}
	 }
	 else
	 {
		 System.out.println("Wrong Password");
		 login();
	 }
 }
}
public class Attend1 extends Login
{	
	public static void main(String a[])
	{
		Login l=new Login();
		l.login();
               }
}
