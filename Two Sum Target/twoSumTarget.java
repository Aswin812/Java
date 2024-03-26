
public class twoSumTarget {
    public static void main(String[] args) {
        int n=9;
        int[] arr={4,3,1,6,3,5,8,2,5};
        String output="";
        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i]+arr[j]==n){
                    output+=i+" "+j;
                    i=arr.length-1;
                }
            }
        }
        System.out.println(output);
    }
}
