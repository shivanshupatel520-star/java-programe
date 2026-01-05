package array;

 class newquestion {
     public static void main(String[] args) {
         int[] arr = {98, 55, 33, 22, 44, 47, 56, 7};
         int x = 55;
         boolean flag = false;

         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == x)
             {
                 flag = true;
                 break;
             }
         }
         if (flag == false)
             System.out.println("nhi mila");
         else System.out.println(" nhi nhi mil  gaya");

     }
     }
