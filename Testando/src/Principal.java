public class Principal {
    public static void main(String[] args) {
        Aluno iAluno = new Aluno();


    iAluno.nome = "Carlos\0";
    iAluno.endereco = "Rua das Palmeiras\0";
    iAluno.telefone = 81763346;
    iAluno.email = "exemplo@gmail.com\0";
    iAluno.matricula = 12345;


    iAluno.alunoInformacoes();
    System.out.println("\n");

    Aluno oAluno = new Aluno();
    oAluno.nome = "JP\0";
    oAluno.endereco = "Rua das Acácias\0";
    oAluno.telefone = 8723295;
    oAluno.email = "exemplo1@gmail.com\0";
    oAluno.matricula = 54321;

    oAluno.alunoInformacoes();
    
    }
}
