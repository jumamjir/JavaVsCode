public class cachorro extends Ser {

    String nomeDono;


    public cachorro(String nome, int idade, String nomeDono) {
        super(nome, idade);
        this.nomeDono = nomeDono;
    }
    
    @Override
    public String saudacao(){
        return "au au";
    }
    
}