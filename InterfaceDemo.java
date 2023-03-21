interface DBOperations{ //abstract interface ADBOperations


    int MAX_CONNECTIONS=10;
    boolean isOpen();
    int add(int id, String name, double salary);

}
class OracleDBOperation implements DBOperations{
    public boolean isOpen(){
        
return true;
    }
    public int add(int id, String name, double salary){
        System.out.println("DB added to Oracle"+id+" "+ name+" "+salary);
        return 1;
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {

    }
}
