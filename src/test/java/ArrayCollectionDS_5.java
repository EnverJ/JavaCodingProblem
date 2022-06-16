import java.util.Arrays;

public class ArrayCollectionDS_5 {
    public static void main(String[] args) {

        enver();
        for(int a:enver()){
            System.out.println(a);

        }
        System.out.println("=========================");
        int[] c=new int[]{4,2,1,6,7};
        bubblesort(c);
        for(int b:c){
            System.out.println(b);
        }
    }

    public static int[] enver() {
        int[] num = new int[]{1, 4, 3, 2, 1};
        Arrays.sort(num);
        return Arrays.stream(num).toArray();
    }
    // other sorting algorithms
     public static void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
     }

}

