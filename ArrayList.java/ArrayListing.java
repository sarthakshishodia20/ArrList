import java.util.*;
public class ArrayListing{
    public static boolean PairSumI(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            if((list.get(lp)+list.get(rp))==target){
                return true;
            }
            else if((list.get(lp)+list.get(rp))<target){
                lp++;
            }
            else{
                rp--;
            }

        }
        return false;
    }
    public static int MaxWater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp!=rp){
            int heights=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=heights*width;

            maxWater=Math.max(maxWater, currWater);


            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(5);
        height.add(4);
        height.add(7);
        height.add(7);
        height.add(5);
       System.out.println(MaxWater(height));
    }
}