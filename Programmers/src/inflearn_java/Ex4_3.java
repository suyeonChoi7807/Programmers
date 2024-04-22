import java.util.*;
import java.io.*;
 
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
   
    StringTokenizer st= new StringTokenizer(str);
    int n=Integer.parseInt(st.nextToken());
    int k=Integer.parseInt(st.nextToken());
   
    str=br.readLine();
    st= new StringTokenizer(str);
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=Integer.parseInt(st.nextToken());
    }
   
    HashMap<Integer, Integer> cnt=new HashMap<Integer, Integer>();
    int lidx=0;
    int ridx=k-1;
   
    for(int i=0;i<=ridx;i++){
      cnt.put(arr[i], cnt.getOrDefault(arr[i], 0)+1);
     }
    System.out.print(cnt.size()+" ");
     
    while(ridx<n-1){
        if(cnt.get(arr[lidx])==1){
            cnt.remove(arr[lidx]);
        }else{
            cnt.put(arr[lidx], cnt.get(arr[lidx])-1);
        }
       lidx++;
       ridx++;
       cnt.put(arr[ridx], cnt.getOrDefault(arr[ridx],0)+1);
     
       System.out.print(cnt.size()+" ");
    }
   
   
  }
}