package array;

 class maxnumber {
     public static void main(String[] args) {
         int[] arr = {55, 66, 44, 885, 88, 2, 3, 4, 7, 99, 125};
         int max = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > max) max = arr[i];
         }
         int smax = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > smax && arr[i] < max) smax = arr[i];

         }
         System.out.println(max);
         System.out.println(smax);
     }
 }
