class Solution {
    public boolean isBalanced(String num) {
        int oddSum=0;
        int evenSum=0;
        for(int i=0;i<num.length();i++){
            int number=num.charAt(i)-'0';
            if(i%2==0){
                evenSum+=number;
            }
            else{
                oddSum+=number;
            }
        }
        return evenSum==oddSum;
    }
}
