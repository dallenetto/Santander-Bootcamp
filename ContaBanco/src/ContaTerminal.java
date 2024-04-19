import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciar abertura de conta");

        new ContaTerminal().exibirDadosConta(new ContaTerminal().obterDadosCliente());
               
    }


    public Cliente obterDadosCliente(){

        Cliente cliente = new Cliente();
        Scanner dadosCliente = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        cliente.nomeCliente = dadosCliente.nextLine();

        System.out.print("Digite sua Agência: ");
        cliente.agencia = dadosCliente.nextLine();

        System.out.print("Digite seu Numero da Conta: ");
        cliente.numero = Integer.valueOf(dadosCliente.nextLine());

        System.out.print("Digite seu Saldo: ");
        cliente.saldo = Double.parseDouble(dadosCliente.nextLine());

        dadosCliente.close();;
        
        return cliente;

    }

    public void exibirDadosConta(Cliente cliente){

        System.out.println(
        "Olá "
        .concat(cliente.nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(cliente.agencia)
        .concat(", conta ").concat(cliente.numero.toString())
        .concat(" e seu saldo de R$ ").concat(cliente.saldo.toString()).concat(" já está disponível para saque."));
    }

    class Cliente{
        private Integer numero;
        private String agencia;
        private String nomeCliente;
        private Double saldo;

        public Cliente(){}

        public Cliente (Integer numero, String agencia, String nomeCliente, Double saldo){
            this.numero = numero;
            this.agencia = agencia;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
        }
                
    }
    
}
