import java.util.Scanner;

//Problem link:codechef.com/problems/INSTAGRAM
class INSTAGRAM {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int []b= new int[a];
        int []c=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
          if(b[i]>=10){
            System.out.println("YES");
          }else{
            System.out.println("NO");
          }
        }

    }
    
}
