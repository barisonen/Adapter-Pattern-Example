public class Processor implements Calculator {

    CalculatorAdapter calculatorAdapter;

    @Override
    public int calculate(int a, int b, String calculationType) {

        calculatorAdapter = new CalculatorAdapter(calculationType);
        return calculatorAdapter.calculate(a, b, calculationType);
    }
}
