import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        sort(arr);
    }
    public static void sort(ArrayList<Integer> list){
        if(list.size()==1){
            return;
        }
        int last=list.get(list.size()-1);
        list.remove(list.size()-1);
        sort(list);
        insert(list,last);
    }
    public static void insert(ArrayList<Integer> arr,int element){
        if(arr.size()==0 || arr.get(arr.size()-1)<=element){
            arr.add(element);
            return;
        }
        int temp=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        insert(arr,element);
        arr.add(temp);
    }
}
