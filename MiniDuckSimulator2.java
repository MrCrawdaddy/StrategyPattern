//package headfirst.designpatterns.strategy;

public class MiniDuckSimulator2 {
    public static void main(String[] args){
        RedHeadDuck redhead = new RedHeadDuck();
        RedNeckDuck redneck = new RedNeckDuck();
        redhead.performQuack();
        redneck.performQuack();
        redhead.performFly();
        redneck.performFly();
    }
}
