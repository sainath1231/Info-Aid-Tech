import java.util.*;
public class passgene{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Random r=new Random();
System.out.println("Enter the number of characters need to be generated");
int n=sc.nextInt();
int ascii=0;
int min=27;
int max=127;
for(int i=1;i<=n;i++){
ascii=r.nextInt(max-min+1)+min;
System.out.print((char)ascii);
}
//System.exit(0);
}
}


