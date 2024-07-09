import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        ArrayList<Empresa> listaEmpresa = new ArrayList<>();

        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                case 1: {
                    cadastrarFuncionario(scan, listaFuncionario);
                    break;
                }
                case 2: {
                    cadastrarEmpresa(scan, listaEmpresa);
                    break;
                }
                case 3: {
                    listarFuncionario(listaFuncionario);
                    break;
                }
                case 4: {
                    listarEmpresa(listaEmpresa);
                    break;
                }
            }
        }
    }

    public static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 0;

        while (!entradaValida) {

            System.out.println("Digite a opção desejada:");
            System.out.println("01 : Adicionar Funcionário");
            System.out.println("02 : Adicionar Empresa");
            System.out.println("03 : Listar Funcionários");
            System.out.println("04 : Listar Empresas");
            System.out.println("00 : Sair");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 4) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\nInformação inválida, tente novamente.\n");
            }
        }
        return opcao;
    }

    public static void cadastrarFuncionario(Scanner scan, ArrayList<Funcionario> lista) {
        System.out.println("\nInserir as informações do Funcionário:");

        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.setNome(scan.nextLine());
        System.out.println("CPF: ");
        funcionario.setCpf(scan.nextLine());
        System.out.println("Telefone: ");
        funcionario.setTelefone(scan.nextLine());
        System.out.println("RG: ");
        funcionario.setRg(scan.nextLine());

        lista.add(funcionario);

        System.out.println("\nFuncionário adicionado com sucesso!\n");
    }

    public static void cadastrarEmpresa(Scanner scan, ArrayList<Empresa> lista) {
        System.out.println("\nInserir as informações da Empresa:");

        Empresa empresa = new Empresa();

        System.out.println("Nome: ");
        empresa.setNome(scan.nextLine());
        System.out.println("CNPJ: ");
        empresa.setCnpj(scan.nextLine());
        System.out.println("Telefone: ");
        empresa.setTelefone(scan.nextLine());

        lista.add(empresa);

        System.out.println("\nEmpresa adicionada com sucesso!\n");
    }

    public static void listarEmpresa(ArrayList<Empresa> lista) {
        System.out.println(lista);
    }

    public static void listarFuncionario(ArrayList<Funcionario> lista) {
        System.out.println(lista);
    }

}
