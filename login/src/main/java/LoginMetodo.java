import java.util.Scanner;

public class LoginMetodo {
    Boolean login(Scanner leitor) {
        // Definição das credenciais de usuário e senha
        String usuarioMock = "fernanda.caramico";
        String senhaMock = "urubu100";

        // Declaração de variáveis locais
        String usuario;
        String senha;
        Integer tentativas = 0;

        // Loop do-while para permitir até 3 tentativas de login
        do {
            // Solicita ao usuário que digite seu nome de usuário
            System.out.println("Digite seu nome de usuário:");
            usuario = leitor.nextLine();

            // Solicita ao usuário que digite sua senha
            System.out.println("Digite sua senha:");
            senha = leitor.nextLine();

            // Verifica se as credenciais fornecidas correspondem às credenciais mock
            if (usuario.equals(usuarioMock) && senha.equals(senhaMock)) {
                return true; // Retorna verdadeiro se as credenciais forem corretas
            }

            tentativas++; // Incrementa o número de tentativas

            // Verifica se o número de tentativas é menor que 3
            if (tentativas < 3) {
                // Informa ao usuário que as credenciais estão incorretas e mostra o número de tentativas restantes
                System.out.println("Usuário ou senha incorretos! Tentativas restantes: " + (3 - tentativas));
                System.out.println();
            }

        } while (tentativas < 3);

        return false; // Retorna falso se o número máximo de tentativas for atingido
    }
}
