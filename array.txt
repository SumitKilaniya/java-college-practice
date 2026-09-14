arrays---> this means that all the elements in the arrays are of samew data type .
1.

int [] x = {1,2,3,4,5};

2.
int [] x = new int [5];

-contiguous memory location 
array follows zero based indexing 
index = length -1 


--->why array's index start with 0 ? how address is calculated , where it is stored in the memory 


this is the arrray of six elements , all the elements are integers and homogeneous, the no. below the boxes is called the index , is always start form zero and goes up to n-1 elements .
for primitive arrays elements are stored in contigious  memory location , for non prmitive arrays the refrences are stored in non contigious storae but the actual objects may eb at differenct location

KEY FEATURE OF ARRAY------->


1.   java array elements are stored in contigious memory location , which means that the elements are placed next to each other .
2. ZERO BASED INDEXING-->the first element of the array is at index zero.
3. FIXED LENGHT--> once an array is created its size is fixed and can't be changed 
4. ca stored primitves and objects --java arrrays can hold both primitve types(int , char , bool) and objects like String , integer .


TYPES OF ARRAYS =----=
THERE ARE TWO TYPE OF ARAYS--
1. 1-D ARRAY 
2. 2-D ARRAY




CODE-->

class array{
    public static void main(String[] args){
        int [] arr1 =new int[5];
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;

        System.out.println(arr1[2]);
        for(int i=0;i<=3;i++){
            System.out.println(arr[i]);
        }
    }
}
