public class AdditionCalculator implements AdvancedCalculator {

    @Override
    public int calculateAddition(int a, int b) {
        return a + b;
    }

    @Override
    public int calculateExtraction(int a, int b) {
        return -1;
    }
}
