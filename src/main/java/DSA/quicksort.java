public class quicksort {
    public void swap (int[] lst , int a, int b){
        int temp = lst[b];
        lst[b] = lst[a];
        lst[a]= temp;
    }

    public int pivotIndex(int[] lst, int low, int high){
        int pivot = lst[low];
        int left = low+1;
        int right = high;

        while(left <= right){

            while(left<=right && lst[left]< pivot){
                left++;
            }
            while(left<=right && lst[right]>pivot){
                right--;
            }

            if(left<right){
                swap(lst,left,right);
                left++;
                right--;
            } 

        }
        swap(lst,low,right);//pivot to be swapped with the right. 
        return right; //returns pivotindex as the last swap must be with the 
    }

    public int[] qk(int[]lst ,int low, int high){
        if(low<high){
            int pi = pivotIndex(lst,low,high);
            qk(lst,pi+1,high); //sorting right half.
            qk(lst,low,pi-1); //sorting left half.
        }
        return lst;
    }
    public static void main(String[] args) {
        int[] lst = {1,2,43,98,35,534,6,352,3,5};
        quicksort obj = new quicksort();
        lst = obj.qk(lst,0,lst.length-1);
        for(int i:lst){
            System.out.println(i);
        }
    }

}