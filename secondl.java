//second largest element
public class secondl {
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 99, 59, 6, 75, 8, 90, 10};
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        int secondmax=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>secondmax && arr[i]<max){
                secondmax=arr[i];   

    }
}
        System.out.println("Second Max element is: "+secondmax);
    }
}
