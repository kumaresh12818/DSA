package Array;

public class large_element {
     public static void main(String[] args) {
        int [] arr = {2,5,87,8,9};
        int max = arr [0];
    
        for(int i=0;i<arr.length; i++) {
            if (arr[i]>max){
                 max= arr[i];
            }
        }
        System.out.println("the max element is : "+ max);
    
}
}