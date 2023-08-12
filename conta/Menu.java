package conta;

import java.util.Scanner;
import conta_util.Cores;
import conta.model.Conta;

public class Menu {
    public static void main(String[] args){

        Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
        c1.visualizar();
        c1.sacar(12000.0f);
        c1.visualizar();
        c1.depositar(5000.0f);
        c1.visualizar();







        //responsável por pegar a entrada do usuário via teclado.
        Scanner leia = new Scanner(System.in);

        //vai receber a opcao do menu a ser executado
        int opcao;


        //com true, o loop fica infinito, mas ao digitar a opcao 9, sairá do loop
        while (true){

            System.out.println(Cores.TEXT_BLUE+ Cores.ANSI_BLACK_BACKGROUND
                    + " *****************************************************");
            System.out.println("                                                     ");
            System.out.println("                BANCO DO BRAZIL COM Z                ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Criar Conta                          ");
            System.out.println("            2 - Listar todas as Contas               ");
            System.out.println("            3 - Buscar Conta por Numero              ");
            System.out.println("            4 - Atualizar Dados da Conta             ");
            System.out.println("            5 - Apagar Conta                         ");
            System.out.println("            6 - Sacar                                ");
            System.out.println("            7 - Depositar                            ");
            System.out.println("            8 - Transferir valores entre Contas      ");
            System.out.println("            9 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");

            //ler um numero inteiro e armazenar na variavel
            opcao = leia.nextInt();

            //checando o valor
            switch(opcao){
                case 1:
                    System.out.println(Cores.TEXT_GREEN_BOLD + "Criar Conta \n\n");
                    break;
                case 2:
                    System.out.println(Cores.TEXT_GREEN_BOLD + "Listar todas as Contas \n\n");
                    break;
                case 3:
                    System.out.println(Cores.TEXT_GREEN_BOLD + "Consultar dados da Conta - por número \n\n");
                    break;
                case 4:
                    System.out.println(Cores.TEXT_GREEN_BOLD + "Atualizar dados da Conta \n\n");
                    break;
                case 5:
                    System.out.println(Cores.TEXT_GREEN_BOLD + "Apagar a Conta \n\n");
                    break;
                case 6:
                    System.out.println(Cores.TEXT_GREEN_BOLD + "Saque \n\n");
                    break;
                case 7:
                    System.out.println(Cores.TEXT_GREEN_BOLD + "Depósito \n\n");
                    break;
                case 8:
                    System.out.println(Cores.TEXT_GREEN_BOLD + "Trasnferência entre Contas \n\n");
                    break;
                case 9:
                    System.out.println(Cores.TEXT_GREEN_BOLD + "Banco do Brazil com Z - O seu Futuro começa aqui! \n\n");
                    leia.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida! \n");
                    break;
            }

        }


    }
}
