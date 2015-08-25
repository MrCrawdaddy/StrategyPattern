//package headfirst.designpatterns.strategy;

public class RedNeckDuck extends Duck {
    public RedNeckDuck() {
        flyBehavior = new FlyByKite();
        quackBehavior = new SouthernQuack();
    }

    public void display() {
        System.out.println("Hold Mah BEER!");
    }
}
