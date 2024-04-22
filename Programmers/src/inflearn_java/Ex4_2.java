import java.util.HashMap;
import java.io.*;
 
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
   
    HashMap<Character, Integer> strMap= new HashMap<Character, Integer>();
   
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      strMap.put(c, strMap.getOrDefault(c,0)+1);
    }
   
    str=br.readLine();
    HashMap<Character, Integer> strMap2= new HashMap<Character, Integer>();
   
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      strMap2.put(c, strMap2.getOrDefault(c,0)+1);
    }
   
    String answer=(strMap.equals(strMap2))?"YES":"NO";
    System.out.println(answer);
   
  }
}