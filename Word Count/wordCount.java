import java.util.*;
public class wordCount {
    public static void main(String[] args) {
        String input="abcdABCDabcd";
        String[] arr=input.split("");
        for(int i=0; i<arr.length; i++){
            int count=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    arr[j]=",";
                }
            }
            if(arr[i]!=",")
                System.out.print(arr[i]+"="+count+" ");
        }
    }    
}
