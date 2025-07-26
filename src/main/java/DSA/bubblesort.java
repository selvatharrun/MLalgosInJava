public class bubblesort {
    public void swap (int[] lst , int a, int b){
        int temp = lst[b];
        lst[b] = lst[a];
        lst[a]= temp;
    }

    public static void main(String[] args) {
        int[] lst = {2,3,4,1,6,5,7,8,9};

        bubblesort obj = new bubblesort();

        for(int i=1;i<lst.length;i++){
            for(int j=0; j < lst.length-1 ; j++){
                if(lst[j] > lst[j+1]){
                    obj.swap(lst,j,j+1);
                }
            }
        }

        for(int i: lst){
            System.out.println(i);
        }

    }

}