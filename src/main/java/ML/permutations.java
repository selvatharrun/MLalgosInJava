import java.util.*;

public class permutations {

    List<List<Integer>> mainlst = new ArrayList<>();

    public void recurse(int[] nums, boolean[] used, List<Integer> path){
        if(path.size() == nums.length){        
            mainlst.add(new ArrayList<>(path));
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i])continue;

            path.add(nums[i]);
            used[i] = true;

            recurse(nums,used,path);

            used[i]= false;
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Main obj = new Main();
        boolean[] array = new boolean[nums.length];

        obj.recurse(nums, array, new ArrayList<>());

        for(List<Integer> lst : obj.mainlst){
            System.out.println(lst);
        }
    }

    /*
    //for eh 
    int mult = 1;
    public void recurse(int n){
        if(n==0)return;
        else{
            mult*=n;
            recurse(n-1);

            try {
                Thread.sleep(1000); // Delay for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(n);
        }
    }
    public static void main(String[] args){
        int n = 4;
        Main obj = new Main();
        obj.recurse(n);
        System.out.println(obj.mult);
    }
    */
}
