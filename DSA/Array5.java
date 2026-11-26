public class Array5 {
    public static void main(String[] args) {
        int number[] ={1, 2, 3, 4, 5, 6};
        int  even=0;
        int odd= 0 ;
        for(int i = 0 ; i <number.length;i++){
            if(i % 2==0){
                even++;

            }
            else{
                odd++;
            }


        }
        System.out.println("Even numbers are: " + even);
        System.out.println("Odd numbers are: " + odd);
    }
    
}
