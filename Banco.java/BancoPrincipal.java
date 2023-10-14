package PooAula05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        conta dadosUsuario = new conta();
        System.out.println("---------------------------------------------------");
        System.out.println("O seu saldo atual: R$"+dadosUsuario.getSaldo());
        System.out.println("---------------------------------------------------");
        String perguntaSaque;
        int respostaSaque;

        System.out.println("Numero da conta: ");
        dadosUsuario.numConta = entradaDados.nextInt();

        System.out.println("Deseja abrir conta Corrente ou conta Poupanca ?\n[1 - para conta corrente " +
           "// 2 - para conta Poupaca // 3 - Se possui conta:  ");
        dadosUsuario.tipo = entradaDados.next();

        System.out.println("Nome do dono: ");
        dadosUsuario.setDono(entradaDados.next());
        dadosUsuario.setStatus("true");

        do {
            if (dadosUsuario.status == false){
                break;
            }
            if (dadosUsuario.tipo.trim().equalsIgnoreCase("1")){
                System.out.println("PARABENS!!! Voce ganhou R$50,00 reais");
                dadosUsuario.newSaldo = (dadosUsuario.NewSaldo + 50);
            }
            if (dadosUsuario.tipo.trim().equalsIgnoreCase("2")){
                System.out.println("PARABENS!!! Voce ganhou R$150,00 reais");
                dadosUsuario.newSaldo = (dadosUsuario.NewSaldo + 150);
            }

            System.out.println("Deseja sacar ou depositar algum dinheiro ?\n [SIM/NAO]");
            perguntaSaque = entradaDados.next();

            if (perguntaSaque.trim().equalsIgnoreCase("sim")){
                System.out.print("Digite 1 para sacar ou 2 para depositar: ");
                respostaSaque = entradaDados.nextInt();

                if (respostaSaque == 1){
                    System.out.println("Quanto deseja sacar ?");
                    dadosUsuario.NewSaldo = entradaDados.nextDouble();
                    break;
                }
                if (respostaSaque == 2){
                    System.out.println("Quanto deseja depositar ?");
                    dadosUsuario.newSaldo = entradaDados.nextDouble();
                    break;
                } else if (perguntaSaque.trim().equalsIgnoreCase("nao")) {
                    break;
                } else{
                    System.out.println("Valor invalido");
                    break;
                }
            }

        }while (dadosUsuario.saque>1);

        dadosUsuario.info();
    }


}
