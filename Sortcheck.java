public class Sortcheck {
    static boolean isSorted(int[] ar){
        for(int i=1; i<ar.length ; i++){
            if(ar[i]< ar[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] ar ={2,4,66,8,10,12,14};
        System.out.println(isSorted(ar));
    }
}
