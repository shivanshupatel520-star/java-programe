package array;

 class linearsearch {
     public static void main(String[] args) {
         int [] arr = {10,12,15,46,78,44};
         int x= 111;
         boolean flag= false;
         for(int i=0; i< arr.length; i++){
             if(arr[i]==x){
                 flag =true;
                 break;
             }
         }
         if(flag==false)
             System.out.println(" nahi mila");
         else System.out.println("mil gaya");

     }
}
