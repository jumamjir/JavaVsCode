import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args)  {
        
       // System.out.println("Em que ano estamos?");
       // int ano = 365;
       // Scanner tec = new Scanner(System.in);
       // tec.nextInt();
        
       
       // System.out.println("Digite quantos dias tem esse ano: ");
       // ano = tec.nextInt();
    
        String mes[] = {"Janeiro", "Fevereiro","Marco","Abril","Maio","Junho",
        "julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        
            System.out.println("----------------------------------------");

            int tot[] ={31,28,31,30,31,30,31,31,30,31,30,31,};

        for(int c = 0; c<mes.length; c++ ){
          //  if (ano>365){tot[2] = 29;} if(ano>365){
            System.out.println("O mes de " + mes[c] + " tem " + tot[c] 
            + " dias ao todo");
        } 
        }
    }


