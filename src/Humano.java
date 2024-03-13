public class Humano extends Ser {

    String lastName;
    String cpf;
    public Humano(String name, int age, int bornYear, String lastName, String cpf){
        super(name, age, bornYear); // Passsando para o constructor da SUPER CLASS (SER)
        this.lastName = lastName;
        this.cpf = cpf;
    }

    @Override
    public String informacao(){
        return "Nome: " + this.name + " Sobrenome: " + this.lastName + " Idade: " + this.age + " Nasceu: " + this.bornYear + " CPF: " + this.cpf;
    }
}
