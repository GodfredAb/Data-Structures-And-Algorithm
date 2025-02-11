import java.util.Arrays;

class ArrayApp {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int nElems = 10;

        // inserting 10 values from 10 to 
        for(int i = 0; i < 10; i++){
            arr[i] = i + 10;
        }

        // linear search
        int searchkey=12;
        int j;

        for(j=0; j<10; j++)
            if(arr[j] == searchkey)
                break;
               
        if(j == nElems)
            System.out.println("Item not found");
        else
            System.out.println("Item found");
        
    }
}