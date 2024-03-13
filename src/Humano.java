public class Humano extends Ser {

    private String lastName; // Atributo privado ( 'boa pratica' )
    private String cpf; // Atributo privado ( 'boa pratica' )
    public Humano(String name, int age, int bornYear, String lastName, String cpf){ //  Passando para o constructor da class Humanao
        super(name, age, bornYear); // Passando para o constructor da SUPER CLASS (SER)
        this.lastName = lastName;
        this.cpf = cpf;
    }

    @Override
    public String informacao(){
        int valueBornYear = getBornYear(); // Pegando pelo getter o bornYear
        int valueAge = getAge(); // Pegando pelo getter a age
        String valueName = getName(); // Pegando pelo getter o name

        return "Nome: " + valueName + " Sobrenome: " + this.lastName + " Idade: " + valueAge + " Nasceu: " + valueBornYear + " CPF: " + this.cpf;
    }
}
