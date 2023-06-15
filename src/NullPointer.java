public class NullPointer {
    public static void show(){
        sayHello(null);
    }
    public static void sayHello(String name){
        System.out.println(name.toLowerCase());
    }
}
