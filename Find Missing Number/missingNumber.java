public class missingNumber {
    public static void main(String[] args) {
        int[] input={3,1,2,2,0};
        int n=input.length,i=0;
        while(i<n){
            int temp=0;
                if(input[i]<n && input[i]!=i){
                    temp=input[i];
                    input[i]=input[temp];
                    input[temp]=temp;
                    if(input[i]==input[temp]){
                        i++;
                    }
                }
                else{
                    i++;
                }
        }
        for(int j=0; j<input.length; j++){
            if(input[j]!=j)
            System.out.println(j);
        }
    }    
}
