import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++){
       arr[i]=in.nextInt();
    }

    int cnt=0;
    int lIdx=0;
    int rIdx=1;
    int tot=0;
    
    if(n==1) {
       if(arr[0]==m){
            System.out.println(1);
       }else{
            System.out.println(0);
       }
    }else{
        tot=arr[lIdx]+arr[rIdx];
          
        while(lIdx<rIdx&&rIdx<n-1){
            if(tot==m){
                cnt++;
                tot-=arr[lIdx++];
                tot+=arr[++rIdx];
            }else if(tot<m){
                tot+=arr[++rIdx];
            }else if(tot>m){
                tot-=arr[lIdx++];
            }
        }
      
        if(tot==m) cnt++;
    }
    
    System.out.println(cnt);
    
  }
}