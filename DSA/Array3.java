package DSA;

public class Array3 {
    public static void main(String[] agrs){
        int numbers[] = {1,3,5,73,9,10};
        int max=numbers[0];
        for(int i = 0 ;i <numbers.length;i++){
            if(max<numbers[i]){
                max= numbers[i];
            }
            

        }
        System.out.println(max);

    }
    
}
