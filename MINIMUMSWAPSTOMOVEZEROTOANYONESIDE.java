
public class Solution {

	public static int minimumSwap(int[] arr, int n) {
		// Write your code here
		int leftswap=0;
		int ones=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				leftswap+=ones;
			}
			else{
				ones++;
			}
		}
		int rightswap=0;
		ones=0;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]==0){
				rightswap+=ones;
			}
			else{
				ones++;
			}
		}
		return Math.min(leftswap,rightswap);

	}

}
