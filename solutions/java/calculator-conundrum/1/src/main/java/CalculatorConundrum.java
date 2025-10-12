class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        if (operand2 == 0 && operation.equals("/")){
            throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException("/ by zero"));
        }

        return operand1 + " " + operation + " " + operand2 +  " = " + resolveOperation(operand1, operand2, operation);
    }

    private int resolveOperation(int num1, int num2, String operation) {
        int result = 0;
        switch(operation){
            case "+":
                result = num1 + num2;
                    break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        return result;
    }
}
