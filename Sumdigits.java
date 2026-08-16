public class Sumdigits {
    public static void main(String[] args) {
        int num= 12345, rem=0, sum=0 , temp;
        temp = num;

        while (num>0) {
              rem=num %10;
              sum=sum+rem;
              num=num/10;
        }
      System.err.println("sum of digit of"+ temp +"is"+ sum);



    }
}
