import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> findAllSelfDividingNumbers(int lower, int upper) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=lower;i<=upper;i++){
            if(isSD(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean isSD(int number){
        int temp=number;
        while(temp>0){
            int lastD=temp%10;
            if(lastD==0 || number%lastD!=0){
                return false;
            }
            temp=temp/10;
        }
        return true;
    }
}
