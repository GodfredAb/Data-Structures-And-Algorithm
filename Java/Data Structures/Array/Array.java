public class  Array {
    public static void main(String[] args) {
        int[] evenNumbers = new int[100];
        int numberlength = evenNumbers.length;

        for (int i = 0; i < numberlength; i++) {
            evenNumbers[i] = i + 1;
        }

        for(int a : evenNumbers)
            System.out.println(a + " ");
        System.err.println("");
        
    }
}