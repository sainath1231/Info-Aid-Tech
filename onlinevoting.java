import java.util.Scanner;

public class onlinevoting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of voters:");
        int n=sc.nextInt();
        String name[] = new String[n];
        int vote[] = new int [n];
        for (int i=0 ;i<name.length;i++) {
            System.out.print("\nEnter Name : ");
            name[i]=sc.next();
            do{
                System.out.println("\nEnter Vote Number 1/2/3: ");
                int num=sc.nextInt();
                if(num==1||num==2||num==3){
                    vote[i]=num;
                    break;
                }else {
                    System.out.println("Wrong Entry! Try Again.");
                }
            }while(true);
        }
        System.out.println("\nName\tVotes");
        for (int j=0;j<name.length;j++){
            System.out.println(name[j]+"\t"+vote[j]);
            }
        // now to calculate the percentage
        int cnt1=0,cnt2=0,cnt3=0;
        for (int k=0;k<name.length;k++) {
            if(vote[k] ==  1 )
                cnt1++;
            else if(vote[k] == 2 )
                cnt2++;
            else
                cnt3++;
        }
        System.out.println("\nCandidate \t Percentage");
        System.out.println( "Aravind           " +((cnt1*100)/n));
        System.out.println("Ramu           "  +((cnt2*100)/n));
        System.out.println( "Sarath             " +((cnt3 * 100) / n));
    }
}







    
