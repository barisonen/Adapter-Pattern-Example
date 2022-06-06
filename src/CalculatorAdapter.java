public class CalculatorAdapter implements Calculator {

    AdvancedCalculator advancedCalculator;

    public CalculatorAdapter(String calculationType) {

        if(calculationType.equals("+")) {
            advancedCalculator = new AdditionCalculator();
        }

        else if(calculationType.equals("-")) {
            advancedCalculator = new ExtractionCalculator();
        }
    }

    @Override
    public int calculate(int a, int b, String calculationType) {

        if(calculationType.equals("+")) {
            return advancedCalculator.calculateAddition(a, b);
        }

        else if(calculationType.equals("-")) {
            return advancedCalculator.calculateExtraction(a, b);
        }

        else return -99;
    }
}
