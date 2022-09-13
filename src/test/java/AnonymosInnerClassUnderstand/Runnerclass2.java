package AnonymosInnerClassUnderstand;

public class Runnerclass2 {
    public static void main(String args[]){
        Interface1 interface1=new Interface1() {
            @Override
            public void print() {
                System.out.println("Ananymous interface runner impl");
            }
        };
        interface1.print();
    }
}
