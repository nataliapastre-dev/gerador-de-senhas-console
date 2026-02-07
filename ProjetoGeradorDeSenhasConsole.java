import java.util.Random;
import java.util.Scanner;

/*
 * Projeto: Gerador de Senhas Seguras (Console)
 * Enunciado:
 * O objetivo do projeto é criar um Gerador de Senhas Seguras em Java (console),
 * que permita ao usuário escolher os critérios da senha:
 * - Letras maiúsculas
 * - Letras minúsculas
 * - Números
 * - Símbolos
 *
 * A aplicação deve gerar senhas aleatórias com o tamanho desejado, mostrar no console
 * e indicar o nível de segurança da senha.
 *
 * Requisitos Técnicos:
 * - Manipulação de strings e aleatoriedade para gerar senhas
 * - Interação via console (Scanner)
 * - Indicação de nível de segurança da senha
 */

public class ProjetoGeradorDeSenhasConsole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Gerador de Senhas Seguras ===");

        // Perguntar tamanho da senha
        System.out.print("Informe o tamanho da senha: ");
        int tamanho = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        // Perguntar critérios
        System.out.print("Incluir letras maiúsculas? (s/n): ");
        boolean maiusculas = sc.nextLine().equalsIgnoreCase("s");

        System.out.print("Incluir letras minúsculas? (s/n): ");
        boolean minusculas = sc.nextLine().equalsIgnoreCase("s");

        System.out.print("Incluir números? (s/n): ");
        boolean numeros = sc.nextLine().equalsIgnoreCase("s");

        System.out.print("Incluir símbolos? (s/n): ");
        boolean simbolos = sc.nextLine().equalsIgnoreCase("s");

        // Gerar senha
        String senha = gerarSenha(tamanho, maiusculas, minusculas, numeros, simbolos);

        // Mostrar resultado
        System.out.println("\nSenha gerada: " + senha);
        System.out.println("Nível de segurança: " + calcularSeguranca(senha));

        sc.close();
    }

    private static String gerarSenha(int tamanho, boolean maiusculas, boolean minusculas, boolean numeros, boolean simbolos) {
        String chars = "";
        if (maiusculas) chars += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (minusculas) chars += "abcdefghijklmnopqrstuvwxyz";
        if (numeros) chars += "0123456789";
        if (simbolos) chars += "!@#$%^&*()_+-={}[]|:;<>,.?/~`";

        if (chars.isEmpty()) return "Erro: nenhum tipo de caractere selecionado!";

        StringBuilder senha = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            senha.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return senha.toString();
    }

    private static String calcularSeguranca(String senha) {
        int pontos = 0;
        if (senha.matches(".*[A-Z].*")) pontos++;
        if (senha.matches(".*[a-z].*")) pontos++;
        if (senha.matches(".*[0-9].*")) pontos++;
        if (senha.matches(".*[!@#$%^&*()_+\\-={}\\[\\]|:;<>,.?/~`].*")) pontos++;
        if (senha.length() >= 12) pontos++;

        switch (pontos) {
            case 5: return "Muito Forte 💪";
            case 4: return "Forte 🔐";
            case 3: return "Média ⚠️";
            case 2: return "Fraca ❌";
            default: return "Muito Fraca ⚠️";
        }
    }
}
