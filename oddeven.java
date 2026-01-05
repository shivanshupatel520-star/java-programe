import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        if(num % 2 == 0){
//            System.out.println("even num");
//        }else{
//            System.out.println("odd num");
//        }

//        ternary operator.....
        String ans ;
       ans =  (num % 2 == 0)? "even" : "odd";
        System.out.println(ans);

    }
}
