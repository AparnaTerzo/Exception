package Exception;
//Runtime Exceptions

public class Number {
    public static void main(String[] args) {
        try {
            int data = Integer.parseInt("pants");
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block");
        }
    }
}
