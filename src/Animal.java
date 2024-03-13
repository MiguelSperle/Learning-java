public class Animal extends Ser {
    private String classificacao; // Atributo privado ( 'boa pratica' )

    public Animal(String name, int age, int bornYear, String classificacao){ // Passando para o constructor da class Animal
        super(name, age, bornYear); // Passsando para o constructor da SUPER CLASS (SER)
        this.classificacao = classificacao;
    }

    @Override
    public String informacao(){
        int valueBornYear = getBornYear(); // Pegando pelo getter o bornYear
        int valueAge = getAge(); // Pegando pelo getter a age
        String valueName = getName(); // Pegando pelo getter o name

        return "Nome: " + valueName + " Idade: " + valueAge + " Nasceu: " + valueBornYear + " Classificado como: " + this.classificacao;
    }

}
