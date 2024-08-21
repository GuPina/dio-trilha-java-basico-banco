import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua Agência: ");
        String agenciaDigitada = scanner.nextLine();

        if(agenciaDigitada.equals(UsuarioConta.agencia)) {
            System.out.println("Agência correta!");
            System.out.println(UsuarioConta.conta +  " (Digite enter para continuar...)");
            scanner.nextLine();

            System.out.println("Olá " + UsuarioConta.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaDigitada + ", conta número " + UsuarioConta.conta + ". Seu saldo de " + UsuarioConta.saldo + " já está disponível para saque.");
        } else {
            System.out.println("Agência incorreta! A agência digitada não corresponde a conta nessa agência, favor verificar a agência correta.");
        }
    }
}
