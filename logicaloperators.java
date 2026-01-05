public class logicaloperators {
    public static void main(String[] args) {
        int p = 20, q = 15, r = 10;

//        &&operator
        System.out.println((p==q) && (q>r));
        System.out.println((p>q) && (q>r));

//        ||operator
        System.out.println((p==q) || (q>r));
        System.out.println((p==q) || (q<r));
//
//        !operator
        System.out.println(!(p==q));
        System.out.println(!(q>r));
    }
}
