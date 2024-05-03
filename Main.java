import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroPessoa cp = new CadastroPessoa();

        while (true) {
            System.out.println("Escolha o tipo de pessoa a ser cadastrada:");
            System.out.println("1. Pessoa Física");
            System.out.println("2. Pessoa Jurídica");
            System.out.println("3. Sair");
            System.out.println("4. Listar tudo");

            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    cadastrarPessoaFisica(scanner, cp);
                    break;
                case 2:
                    cadastrarPessoaJuridica(scanner, cp);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void cadastrarPessoaFisica(Scanner scanner, CadastroPessoa cp) {
        PessoaFisica pessoaFisica = new PessoaFisica();

        System.out.println("Digite o nome da pessoa física:");
        pessoaFisica.setNome(scanner.next());

        System.out.println("Digite a idade da pessoa física:");
        pessoaFisica.setIdade(scanner.nextInt());

        System.out.println("Digite o CPF da pessoa física:");
        pessoaFisica.setCpf(scanner.next());

        cp.cadastrarPessoa(pessoaFisica);
        System.out.println("Pessoa física cadastrada com sucesso!");
    }

    public static void cadastrarPessoaJuridica(Scanner scanner, CadastroPessoa cp) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        System.out.println("Digite o nome da pessoa jurídica:");
        pessoaJuridica.setNome(scanner.next());

        System.out.println("Digite o CNPJ da pessoa jurídica:");
        pessoaJuridica.setCnpj(scanner.next());

        cp.cadastrarPessoa(pessoaJuridica);
        System.out.println("Pessoa jurídica cadastrada com sucesso!");
    }


}
