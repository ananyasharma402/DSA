public class Armstrong {
    public static void main(String[] args) {
        int num,rem,limit=1000,sum=0;
        System.out.println("Armstrong no");

        for(int i=1; i<limit;i++){
            num=i;
            while(num>0){
                rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
            }

            if(sum==i){
                System.out.println("Armstrong no it is"+i+"");
            }
            sum=0;

        }
    }
}
