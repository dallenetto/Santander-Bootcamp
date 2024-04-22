import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner parametros = new Scanner(System.in);
        System.out.println("Digite o 1º parâmetro");
        Integer parametroUm = parametros.nextInt();
        System.out.println("Digite o 2º parâmetro");
        Integer parametroDois = parametros.nextInt();
        
        try {
            validarParametros(parametroUm, parametroDois);
            impirmirContagem(parametroUm, parametroDois);
            
            parametros.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
    }

    private static void validarParametros(Integer parametroUm, Integer parametroDois) throws ParametrosInvalidosException{
                if (parametroUm >=  parametroDois) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
    }

    private static void impirmirContagem(Integer parametroUm, Integer parametroDois) {

        int contador = 1;
        while(contador<=(parametroDois-parametroUm)){
            System.out.println("Imprimino o número "+ (contador++ ));
        } 
        
    }
        
}
