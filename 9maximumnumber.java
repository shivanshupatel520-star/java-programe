package array;

 class maximumnumber {
     public static void main(String[] args) {
         int [] arr ={10,15,1,61,31,7,14,1,5,15};
         int max= -1;
         for(int i=0; i<arr.length; i++){
             if(arr[i]>max) max=arr[i];
         }
         System.out.println(max);
     }
}
