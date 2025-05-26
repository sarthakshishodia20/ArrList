class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            int left=0;
            int right=n-2;
            while(left<right){
                if(arr[left]+arr[right]==arr[i]){
                    return true;
                }
                if(arr[left]+arr[right]<arr[i]){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return false;
    }
}
