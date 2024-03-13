public class Calculator {
    private int quantity;

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){ // getter, pegando esse atributo
        return quantity;
    }

    public void setCalculatorQuantitySonByMother(){ // setter, atribuindo um valor ao atributo
        this.quantity = quantity / 10;
    }

    public String getCalculatorQuantitySonByMonther(){
        return "Sabendo que temos 10 mães, cada mãe tem " + quantity + " filhos";
    }
}
