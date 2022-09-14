package PassingLamdaAsParameter;

public class Runner {
    public static void Run(Vechicle vechicle){
        vechicle.speed();
    }
    public static void main(String args[]){
        Vechicle vechicle1=new Train();
        vechicle1.speed();
        Run(vechicle1);
        Run(new AUTO());
    }
}
