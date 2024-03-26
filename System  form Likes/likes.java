
public class likes {
    public static void main(String[] args) {
        String[] arr={"Aswin","Ram","James"};
        String text=" likes this";
        String output="";
        if(arr.length==0){
            output+="no one"+text;
        }
        else if(arr.length==1){
            output+=arr[0]+text;
        }
        else if(arr.length==2){
            output+=arr[0]+" and "+arr[1]+text;
        }
        else if(arr.length==3){
            output+=arr[0]+", "+arr[1]+" and "+arr[2]+text;
        }
        else{
            int num=arr.length-2;
            output+=arr[0]+", "+arr[1]+" and "+num+" others"+text;
        }
        System.out.println(output);
    }    
}
