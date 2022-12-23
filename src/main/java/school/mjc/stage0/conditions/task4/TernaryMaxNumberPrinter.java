package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int biggestFromTwo = first > second ? first : second;
        System.out.println(biggestFromTwo > third ? biggestFromTwo : third);
    }
}
