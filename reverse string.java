package basicsjava;

 class gog {
    public static void main(String[] args) {
        String real= "hello";
        String reverse = new StringBuilder(real).reverse().toString();
        System.out.println("reverse String is : "+ reverse);
    }
}
