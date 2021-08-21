
import java.io.*;


public class CheckAB {

    public static boolean isAB(String str){
              if(str.length()==0){
                  return true;
              }

              if(str.charAt(0)=='a'){
                  if(str.substring(1).length()>1 && str.substring(1,3).equals("bb")){
                      return isAB(str.substring(3));
                  }else{
                      return isAB(str.substring(1));
                  }
              }
              return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine().trim();
        System.out.println(isAB(str));
    }
}
