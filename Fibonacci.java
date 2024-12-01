public class Fibonacci {
    public static void main(String[] args){
        int arrSize = 8;

        int[] fibArr = fibonacci(arrSize);

        for(int i = 0; i < fibArr.length; i++){
            System.out.print(fibArr[i] + " ");
            
        }
        System.out.println("\nThese numbesr are two's powers: ");
        twosPower(fibArr);
    }

    //This method create an array of fibonacci numbers, with a given size
    public static int[] fibonacci(int size){

        int[] arr = new int[size];

        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < size; i++){

            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }

    //This method decide which numbers in the fibonacci array are two's powers.
    public static void twosPower(int[] arr){

        for(int i = 0; i < arr.length; i++){

            int n = 0;

            while(Math.pow(2, n) <= arr[i]){

                if(Math.pow(2, n) == arr[i]){
                    System.out.print(arr[i] + " ");
                 
                }
                n++;
            }
        }
       
    }
}
