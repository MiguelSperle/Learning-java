public class Animal extends Ser {
    String classificacao;
    public Animal(String name, int age, int bornYear, String classificacao){
        super(name, age, bornYear); // Passsando para o constructor da SUPER CLASS (SER)
        this.classificacao = classificacao;
    }

    @Override
    public String informacao(){
        return "Nome: " + this.name + " Idade: " + this.age + " Nasceu: " + this.bornYear + " Classificado como: " + this.classificacao;
    }

}
