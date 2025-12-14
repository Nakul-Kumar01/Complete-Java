public class array01 {

    public static void main(String[] args) {
        // ### arrays ###
        // collection of similar kind of elements
        // int arr[]; // also allowed
        int[] arr = new int[5]; // array of 5 integers in heap memory // starting value is 0, since, default value of int is 0
        // here 'arr' stores the reference(starting address of array) // stored in stack

        arr[2] = 8; arr[3] = 9;

        // we does not use length() , bcoz length is not any method in the array class, it is property in array class
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        int[] arr1 = {1,2,3,4};
        System.out.println(arr1); // [I@6acbcfc0 // here, [ means arrray hai, I -> integer array hai, @6acbcfc0 -> hashCode: unique identifier of an array


        // forEach Loop
        for(int x: arr1) System.out.println(x);
    }
}
