import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
   
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++){
       arr[i]=in.nextInt();
    }

    int maxLen=Integer.MIN_VALUE;
    int lIdx=0;
    int rIdx=1;
    int cnt=0;
    
    if(arr[lIdx]==0) cnt++;
    if(arr[rIdx]==0) cnt++;
    
    while(lIdx<rIdx&&rIdx<n-1){
        if(cnt==k){
            maxLen=Math.max(maxLen, rIdx-lIdx+1);
            rIdx++;
            if(arr[rIdx]==0) cnt++;
        } else if(cnt<k){
            rIdx++;
            if(arr[rIdx]==0) cnt++;
        } else if(cnt>k){
            if(arr[lIdx]==0) cnt--;
            lIdx++;
        }

    }
    
   //if(arr[rIdx]==1&&cnt==k&&maxLen==rIdx-lIdx) maxLen++;
    
    System.out.println(maxLen);
  }
}