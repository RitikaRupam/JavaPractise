interface I1{
    void show();
default void print(){
    System.out.println("I1 print..");
}
static void disp()
{
    System.out.println("I am the display");

}


public class InterfaceDemo2
 {

public static void main(String[] args) {
    I1.disp();
}
}
}
