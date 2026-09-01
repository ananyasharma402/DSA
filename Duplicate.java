    public class Duplicate {
    public static int[] removeDuplicates(int[] input){
        int j=0;
        int i=1;
        if(input.length < 2)
            {
            return input;
        }
        while(i< input.length){
            if(input[i]==input[j])
            {
                i++;
            }
            else{
                input[++j]= input[i++];
            }
        }
        int[] output = new int[j+1];
        for(int k=0; k < output.length; k++)
        {
            output[k] = input[k];
        }
        return output;
    }    
    public static void main(String[] args) {
        int[] input1={2,3,6,6,8,9,10,10,12,12};
        int[] output = removeDuplicates(input1);

        System.out.print("Input Elements:\n");
        for(int i : input1)
        {
            System.out.print(i+"");
        }

        System.out.println("\nOutput Elements: \n");
        for(int i: input1){
            System.out.println(i+"");
        }
    }
        
    }
