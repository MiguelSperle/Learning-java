public class Calculator {
    private int quantity;

    public Calculator(int quantity){ // Constructor da class Calculator
        this.quantity = quantity;
    }

    public int getQuantity(){ // getter, pegando esse atributo
        return this.quantity;
    }

    public void calculatorQuantitySonByMother(){
        this.quantity = quantity / 10;
    }

    public String getCalculatorQuantitySonByMonther(){
        return "Sabendo que temos 10 mães, cada mãe tem " + this.quantity + " filhos";
    }
}
