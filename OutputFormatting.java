import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line

            int a = 15 - s1.length();
            System.out.print(s1);
            for(int j = 0; j < a; j++){
                System.out.print(" ");
            }
            //repeat(" ", a);
            if(x<10){
                System.out.println("00"+x);
            }
            else if(x >= 10 && x < 100){
                System.out.println("0"+x);
            }
            else{
                System.out.println(x);
            }
        }
        System.out.println("================================");

    }
}



