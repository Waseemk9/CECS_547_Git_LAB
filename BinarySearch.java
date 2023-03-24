import java.util.Arrays; 

class BinarySearch{  
    public static void main(String args[]){  
        int arr[] = {1,9,2,6,56,87,54,23,56,778,987};  
        int key = 54;  
        int result = Arrays.binarySearch(arr,key);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}  