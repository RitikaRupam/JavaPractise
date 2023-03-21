import java.net.SocketPermission;

class PrimeNumber {
    public static void main(String[] args) {
        int num=12;
        int factor=0;
        for(int i=1;i<=num;i++)
        if(num%i==0)
        {
            factor++;
        }
        System.out.println(factor==2?"Prime":"Not Prime");
    }
   
    
}
