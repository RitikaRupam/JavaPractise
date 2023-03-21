public class Pattern4 {
    public static void main(String[] args) {
        int line=5;
        for(int i=1;i<=line;i++){
            for(int space=1;space<=line-i;space++)
            {
            System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}
