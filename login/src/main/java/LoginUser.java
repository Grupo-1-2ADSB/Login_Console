import java.util.Scanner;

public class LoginUser {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // Inicializa um objeto Scanner para leitura de entrada do usuário
        LoginMetodo loginMetodo = new LoginMetodo(); // Cria uma instância da classe LoginMetodo

        // Chama o método login da instância de LoginMetodo, passando o objeto Scanner como argumento
        Boolean loginSucesso = loginMetodo.login(leitor);

        // Verifica se o login foi bem-sucedido e exibe a mensagem apropriada
        if (loginSucesso) {
            System.out.println("Bem-vindo! Login efetuado com sucesso.");
        } else {
            System.out.println("O login falhou. Por favor, tente novamente mais tarde.");
        }

        leitor.close(); // Fecha o Scanner após seu uso para evitar vazamentos de recursos
    }
}
