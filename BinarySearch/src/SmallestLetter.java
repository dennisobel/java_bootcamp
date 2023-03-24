public class SmallestLetter {
    public static void main(String[] args) {
        int[] arr = {'a','b','c','i','j'};
        int target = 'j';
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find middle element
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                //lies on the left
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];
    }
}
