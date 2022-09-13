package LambdaExpressions;

public class Runner {
    public static void main(String args[]){
        Interfac2 interfac2=()-> System.out.println("Lambda expression");
        interfac2.print();
    }
}
