package geeksforGeeks;

public class ElementsInTheRange {
   static boolean check_elements(int arr[], int n, int A, int B)
    {
        int count =0;
        for (int i=0 ; i<n ;i++){
            if (arr[i] >=A && arr[i]<=B){
                count++;
            }
        }
        int find = B-(A-1);
        return count==find;
    }
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 2, 7, 8, 3};
        System.out.println(check_elements(array,array.length,2,6));
    }
}
