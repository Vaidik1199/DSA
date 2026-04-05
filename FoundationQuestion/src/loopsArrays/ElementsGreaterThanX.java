package loopsArrays;

public class ElementsGreaterThanX {
    public static void main(String[] args) {
        int[] arr = {1,43,24,78,56,90};
        int ele = 43;
        for (int i = 0; i < arr.length; i++) {
            if(ele<arr[i]){
                System.out.println(i+" : "+arr[i]);
            }
        }
    }
}
