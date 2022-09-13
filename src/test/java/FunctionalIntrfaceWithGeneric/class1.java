package FunctionalIntrfaceWithGeneric;

public class class1 {
    public static void main(String args[]){
        Inter<String> obj1=(i)-> System.out.println(i);
        Inter<Integer> obj2=(i)-> System.out.println(i);
        Inter<Integer> obj3=(i)-> System.out.println(i);
        obj3.print(4);
        obj2.print(6);
        obj1.print("madhu");
    }
}
