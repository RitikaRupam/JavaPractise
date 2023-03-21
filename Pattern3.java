import javafx.scene.effect.Light.Spot;

public class Pattern3 {
    public static void main(String[] args) {
        int line=5;
        // for(int i=1;i<=line;i++)
        // {
        //     for (int star=1;star<=i;star++)
        //     {
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }
        for(int i=line;i>=1;i--)
        {
            for (int star=1;star<=i;star++)
            {
                System.out.print("*");
            }
            System.out.println();     
    }
    
    
}
}
