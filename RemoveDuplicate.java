package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    public int remove_duplicate(List<Integer> arr) {
        int uniqueCount = 1;
        for(int i=0;i+1<arr.size();){
            System.out.println(arr.get(i) + " "+arr.get(i+1));
                if(!arr.get(i).equals(arr.get(i+1))){
                System.out.println(1);
                uniqueCount++;
                i++;
            }

            else{
                System.out.println(2);
                arr.remove(i);
            }

        }
        return uniqueCount;
    }

    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        List<Integer> al = new ArrayList<>(Arrays.asList(795,815,815,828));
        removeDuplicate.remove_duplicate(al);
        System.out.println(al);
    }
}
