package strategy.duck.behavior.quack;

public class Quack implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("Quack");
  }
}
