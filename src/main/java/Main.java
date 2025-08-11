import java.util.*;
//for subequence.

public class Main {
    public int[] merge(int[] left_lst, int[] right_lst){
        
        int[] res = new int[left_lst.length + right_lst.length];
        int i =0;
        int j =0;
        int index = 0;
        
        while(i<left_lst.length && j<right_lst.length){
            if(left_lst[i] <= right_lst[j]){
                res[index] = left_lst[i];
                i++;
            }
            else if(right_lst[j] <= left_lst[i]){
                res[index] = right_lst[j];
                j++;
            }
            index++;
        }
        while(i != left_lst.length-1){
            res[index++] = left_lst[i++];
        }
        while(j != right_lst.length-1){
            res[index++] = right_lst[j++];
        }

        return res;
    }
    
    public static void main(String[] args) {
        Main obj = new Main();

        int[] lst = {1,23,124325,1231,12,12,4214,345,23,2};
        int pivot = lst.length/2;

        int[] left_lst = Arrays.copyOfRange(lst,0, pivot);
        int[] right_lst = Arrays.copyOfRange(lst, pivot+1,lst.length -1);

        int[] res = obj.merge(left_lst,right_lst);

        for(int i:res){
            System.out.println(i);
        }
    }
}
