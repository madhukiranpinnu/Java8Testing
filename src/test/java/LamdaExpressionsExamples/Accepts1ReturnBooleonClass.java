package LamdaExpressionsExamples;

public class Accepts1ReturnBooleonClass {
    public static void main(String args[]){
        Accepts1ReturnBooleon obj=i->i%2==0;
        System.out.println(obj.even(10));
        System.out.println(obj.even(23));
    }
}
