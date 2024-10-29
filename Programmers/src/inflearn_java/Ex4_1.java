import java.util.*;
import java.io.*;
  
public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    String s = br.readLine();
    
    Map<String, Integer> map = new HashMap<String, Integer>();
    for(int i=0;i<n;i++){
        String str=s.substring(i,i+1);
      
        if(map.containsKey(str)){
            map.put(str,map.get(str)+1);
        }else {
            map.put(str,1);
        }
    }
    
    String maxKey="";
    int maxVal=Integer.MIN_VALUE;
    
    for(String key:map.keySet()){
        int val=map.get(key);
        if(maxVal<val){
            maxKey=key;
            maxVal=val;
        }
    }

    System.out.println(maxKey);
  }
}