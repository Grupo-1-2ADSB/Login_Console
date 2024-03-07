import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginUser {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String usuarioMock = "lucas.silva";
        String senhaMock = "urubu100";

        String usuario;
        String senha;
        Integer tentativas = 0;

        do {
            System.out.println("Digite seu nome de usuário:");
            usuario = leitor.nextLine();

            System.out.println("Digite sua senha:");
            senha = leitor.nextLine();

            if (usuario.equals(usuarioMock) && senha.equals(senhaMock) || tentativas.equals(3)) {
                break;
            }

            tentativas++;

            if (!tentativas.equals(3)) {
                System.out.println("""
                    Usuário ou senha incorretos! Tentativas restantes: %d""".formatted((3 - tentativas)));
                System.out.println();
            } else {
                break;
            }

        } while (true);

        if (tentativas.equals(3)) {
            System.out.println("Número máximo de tentativas atingido! Tente novamente mais tarde...");
        } else {
            System.out.println("Login efetuado com sucesso!");
        }

    }
}
