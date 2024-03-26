
public class presentFibonacci {
    public static void main(String[] args) {
        int[] arr={2,10,4,8,13,14,21};
        String output="";
        for(int i=0; i<arr.length; i++){
            int f=0, l=1, temp=0;
            while(f<=arr[i]){
                if(f==arr[i]){
                    output+=""+arr[i]+" ";
                    f++;
                }       
                else{
                    temp=f+l;
                    f=l;
                    l=temp;
                }
            }
        }
        System.out.println(output);
        }      
}
