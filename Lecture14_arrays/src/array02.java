
public class array02 {
    public static void main(String[] args) {
        int arr[] = {1,4,2,47,-2};

        // Q: search an element in array

//        for(int x: arr)
//            if(x == 47)
//                System.out.println("present");


        // Q: Find maximum element
        int ans = Integer.MIN_VALUE;  // Negative Infinity
        for(int x: arr){
            if(ans < x){
                ans = x;
            }
        }
        System.out.println(ans);
    }
}
