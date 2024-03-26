
public class reverse {
    public static void main(String[] args) {
        String input="this is the power";
        String[] arr=input.split(" ");
        int i=0;
        while(i<arr.length){
            String temp="";
            if(arr[i].length()>=5){
                for(int j=arr[i].length()-1; j>=0; j--){  
                    temp+=arr[i].charAt(j);
                }
                arr[i]=temp;
            }
            i++;
        }
        for(String x:arr){
            System.out.print(x+" ");
        }
    }    
}
