package basicsjava;

public class function {
    public static void main(String[] args) {
        greeting();
    }
    public static void greeting(){
       int rows=0;
       while(rows <5){
           System.out.print("*");

           int i =0;
           while(i <rows){
               System.out.print(" *");
               i++;
           }
           System.out.println();
           rows++;
       }
    }
}
