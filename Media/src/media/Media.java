package media;

public class Media {
    private double nota1;
    private double nota2;
    private double nota3;

    public void calculaMedia(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;

        Media = (nota1 + nota2)/2;
    }
    public void retornaMedia(){
        return media;
    }
}