package FunctonalInterface;

public interface Interface3 {
    public abstract void print();
    public static void Scan(){
        System.out.println("scanner");
    }
    default void printter(){
        System.out.println("printter");
    }
}
