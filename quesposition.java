// rearraneg the array so that even numbers at even place or vice versa
import java.util.Arrays;
// public class quesposition{
//     public static void main(String[] args){
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int [] rearranged = new int[(arr.length)*2];
//        int evenIndex = 0;
//        int oddIndex = 1;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] % 2 == 0){
//                rearranged[evenIndex] = arr[i];
//                evenIndex += 2;
//            } else {
//                rearranged[oddIndex] = arr[i];
//                oddIndex += 2;  
//            }
            
//     }
//     System.out.println(Arrays.toString(rearranged));
//     }
// }

public class quesposition{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,17,19,23};
        for (int i=0;i<arr.length;i++){
            if (i%2==0 && arr[i]%2!=0){
                for (int j=i+1;j<arr.length;j++){
                    if (arr[j]%2==0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
