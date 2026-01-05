package array;

 class java {
     public static void main(String[] args) {
         int [] marks= {25,36,69,89,78,5,4,14,79};
         int x= 10;
          int count = 0;
         for(int i=0; i<marks.length; i++){
             if(marks[i]>x)count++ ;
         }
         System.out.println(count);
     }
}
