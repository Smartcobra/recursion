


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Subsequesnce {

    public static String [] getSubsequence(String str){
        if(str.length()==0){
            String ans[]={""};
            return ans;
        }
        String smallString =str.substring(1);
        String smallArr[]=getSubsequence(smallString);

        String ans[]= new String[smallArr.length*2];
        for(int i=0;i<smallArr.length;i++){
            ans[i]=smallArr[i];
        }
        for(int i=0;i<smallArr.length;i++){
            ans[i+smallArr.length]=str.charAt(0)+smallArr[i];
        }

        return ans;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        System.out.println(str);
        Arrays.stream(getSubsequence(str)).forEach(t->System.out.println(t));
    }


}
