package contador;

import java.util.Scanner; 

/**
 *
 * @author Nícolas
 */
public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int parametro1 = terminal.nextInt();
        
        System.out.println("Digite outro número inteiro:");
        int parametro2 = terminal.nextInt();
        
        terminal.close();
        
        try{
            contar(parametro1, parametro2);
        }catch(ParametrosInvalidosException e){
            System.out.println("O primeiro parâmetro não pode ser maior que o segundo.");
        }
        

    }
    
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2)
            throw new ParametrosInvalidosException();
        
        int contagem = parametro2 - parametro1;
        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    }    
}
