public class extraElement {
    public static void main(String[] args) {
        int[] arr1={-1,0,3,2};
        int[] arr2={3,4,4,0,-1,2};
        int num=1;
        if(arr1.length<arr2.length){
            int[] temp=new int[arr1.length];
            temp=arr1;
            arr1=arr2;
            arr2=temp;
            num=2;
        }
        String output="";
        for(int i=0; i<arr1.length; i++){
            int count=0;
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    count++;
                }
            }
            if(count==0){
                output+=arr1[i]+" is the extra element in array "+num+" at index"+i;
            }
        }
        System.out.println(output);
   }
}
