public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 15, 120, 95, 50);
        Fighter f2 = new Fighter("B", 20, 85, 85, 50);

        Match match1 = new Match(f1,f2,85,95);
        match1.run();
    }
}
