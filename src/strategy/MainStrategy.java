package strategy;

public class MainStrategy {
    public static void main(String[] args) {
        var s1 = new OperationAdd();
        var s2 = new OperationSubtract();
        Context context = new Context(s1);
        System.out.println("Add:" + context.executeStrategy(10, 5));
        context.setStrategy(s2);
        System.out.println("Subtract:" + context.executeStrategy(10, 5));
    }
}
