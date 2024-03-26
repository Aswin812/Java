
public class duplicateWords {
    public static void main(String[] args) {
        String input="Welcome to Java Java Java Session Session Session";
        String[] arr=input.split(" ");
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=""){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    arr[j]="";
                }
            }
            }
        }
        System.out.println(count);
    }    
}
