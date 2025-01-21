import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a ;
        int AVG ;
        int b = 0;
        int i =1 ;
        while(i<=5){
            System.out.println(i);
           a = scan.nextInt();
           b += a ;
            System.out.println(b);
            i++;

        }
        AVG = b /5;
        if (AVG <= 100 && AVG >=70){
          System.out.println("your Compent ");
        }else {
            System.out.println("your are note compent");
        }




    }
}