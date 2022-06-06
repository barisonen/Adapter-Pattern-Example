public class ExtractionCalculator implements AdvancedCalculator {

    @Override
    public int calculateAddition(int a, int b) {
        return -1;
    }

    @Override
    public int calculateExtraction(int a, int b) {
        return a - b;
    }
}
