package strategy;


/*
  The goal with the Strategy pattern is to define a family of algorithms,
  and use them interchangeably.
 */
public interface Strategy {
    int doOperation(int num1, int num2);
}
