package basicsjava;

public class removingspacefromstring {
    public static void main(String[] args) {
        String real = "how are you doing ";
        String removespace = real.replaceAll(" ","");
        System.out.println("after removing space : " + removespace);
    }
}
