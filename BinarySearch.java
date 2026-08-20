public class BinarySearch {
    public static void main(String[] args){
        // int[] arr = {92,87,72,65,59,41,37,21,10};
        // System.out.println(binarySearch(arr,92));
        // System.out.println(orderAgnosticBS(arr,10));
        // int[] nums = {1,2,3,4,5,6,7,8,10,11,12,13,14,15};
        // System.out.println(ans(nums, 15));

        // int[] arr = {5,6,1,2,3,4};
        // System.out.println(rotationCount(arr));

        int[][] arr = {{1,2,3}
                      ,{2,3,4}
                      ,{5,6,7}};
        System.out.println(java.util.Arrays.toString(binarySearchIn2Darray(arr,7)));
    }
    // Binary Search:
    // static int binarySearch(int[] arr,int key){
    // int start = 0;
    // int end = arr.length - 1;
    // while(start <= end){
    // int mid = start + (end - start) / 2; //or (start+end)/2
    // if(arr[mid] == key){
    // return mid;
    // }else if(arr[mid] < key){
    // start = mid + 1;
    // }else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // // order agnostic binary Search:
    // static int orderAgnosticBS(int[] arr, int key){
    // int start = 0, end = arr.length-1;
    // boolean isAgno = arr[start] <= arr[end];
    // while(start <= end){
    // int mid = start + (end - start) / 2;
    // if(arr[mid] == key) {
    // return mid;
    // }
    // if(isAgno){
    // if(arr[mid] < key){
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }else{
    // if(arr[mid] > key){
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // }
    // return -1;

    // }

    // static int ans(int[]arr,int key){
    // int start = 0, end = 1;
    // while(key > arr[end]){
    // int news = end+1;
    // end = end + (end - start + 1) * 2;
    // start = news;
    // }
    // return infiniteArray(arr,key,start,end);
    // }
    // static int infiniteArray(int[] nums, int key, int start, int end){
    // while(start <= end){
    // int mid = start + (end - start) / 2;
    // if(nums[mid] == key){
    // return mid;
    // }else if(nums[mid] < key){
    // start = mid + 1;
    // }else{
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // static int rotationCount(int[] arr) {
    //     int start = 0, end = arr.length-1, index = -1;
    //     while (start < end) {
    //         int mid = start + (end - start) / 2;
    //         if (arr[mid] > arr[end]) {
    //             start = mid + 1;
    //         } else {
    //             end = mid;
    //         }
    //     }
    //     index = start;
    //     return index;
    // }

    static int[] binarySearchIn2Darray(int[][] arr, int target){
        int row = 0, col = arr[0].length-1;
        int[] result = {-1,-1};
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
            return new int[]{row, col}; 
            }else if(arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return result;
    }

}