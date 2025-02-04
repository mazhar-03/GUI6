package task4;
public enum Calculator {
    ADD((x,y) -> x+y),
    SUBTRACT((x,y) -> x-y),
    MULTIPLY((x,y) -> x*y),
    DIVIDE((x,y) -> x/y),
    REST((x,y) -> x%y),
    POWER(Math::pow);

    private Operator operator;
    Calculator(Operator operator){
        this.operator = operator;
    }
    public double calculator(double val1, double val2){
        return this.operator.operation(val1, val2);
    }
}
