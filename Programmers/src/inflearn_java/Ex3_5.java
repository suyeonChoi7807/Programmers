import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    
    int lnum=1;
    int rnum=2;
    int cnt=0;
    int tot=lnum+rnum;
    
    while(rnum<=n/2+1&&lnum<rnum){
        if(tot==n){
            cnt++;
            tot-=(lnum++);
            tot+=(++rnum);
        } else if(tot>n){
            tot-=(lnum++);
        } else if(tot<n){
            tot+=(++rnum);
        }
    }
    
    System.out.println(cnt);
  }
}