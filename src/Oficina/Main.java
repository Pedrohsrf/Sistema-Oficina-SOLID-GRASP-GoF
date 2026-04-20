package Oficina;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
            try{
                int escolha;
                System.out.println("\nBem-vindo(a) a Oficina Beid!\n \nEscolha o tipo do seu veiculo! \n1-Carro \n2-Moto\nSua resposta: ");
                escolha = Teclado.nextInt();
                Funcionario cleiton = new Funcionario(001,"Cleiton","987.654.321-00","Mecânico");
                Funcionario robson = new Funcionario(002,"Robson","983.574.451-98","Mecânico");
                //fazer loop ou não.
                if(escolha == 1){
                    Carro carro = new Carro("BMW","BMW X1","Branco","00001","2.0","FGL8F81","2026",4);
                    Cliente Ronaldo = new Cliente(1002, "Ronaldo", "123.456.678-01", "(85)123345678", carro, 100.00);
                    System.out.println("Digite o problema que seu carro apresenta: \n1-Bateria falhando" +
                            "\n2-Oléo e filtro vazando" +
                            "\n3-Pneu furado" +
                            "\n4-Pastilha de freio desgastada" +
                            "\n5-Descalibrado/desalinhado\nSua resposta:");
                    int problema = Teclado.nextInt();
                    switch (problema) {
                        case 1:
                            Problema bateriaFalhando = new Problema("Bateria falhando");
                            Servico bateria = new Servico(01, "Troca de bateria", "001", 200.00, false, carro, bateriaFalhando, cleiton);
                            cleiton.atribuirServico(bateria);
                            System.out.printf("Ok! será realizado o servico: %s\n" ,bateria.getNome());
                            Thread.sleep(3000);
                            bateria.executar();
                            Thread.sleep(2000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");
                            int formaDePagamento = Teclado.nextInt();
                            switch(formaDePagamento){
                                case 1:
                                    PagamentoPix pix = new PagamentoPix();
                                    bateria.setPagamento(pix);
                                    bateria.pagar(bateria.getPreco());
                                    System.out.println("\nObrigado por ter nos escolhido!");
                                    break;
                                case 2:
                                    PagamentoCredito credito = new PagamentoCredito();
                                    bateria.setPagamento(credito);
                                    bateria.pagar(bateria.getPreco());
                                    System.out.println("Obrigado por ter nos escolhido!");
                                    break;
                                }
                            }
                    }
                else if (escolha == 2) {
                    Moto moto = new Moto("BMW","R 1250 GS","Preta","0023","","","", 150);
                    Cliente Ronaldo = new Cliente(1002, "Ronaldo", "123456789", "(85)123345678", moto, 100.00);
                    System.out.println("Digite o problema que seu carro apresenta: \n1-Bateria falhando" +
                            "\n2-Oléo e filtro vazando" +
                            "\n3-Pneu furado" +
                            "\n4-Pastilha de freio desgastada" +
                            "\n5-Descalibrado/desalinhado\nSua resposta:");
                    int problema = Teclado.nextInt();
                    switch (problema) {
                        case 1:
                            Problema bateriaFalhando = new Problema("Bateria falhando");
                            Servico bateria = new Servico(01, "Troca de bateria", "001", 200.00, false, moto, bateriaFalhando, cleiton);
                            cleiton.atribuirServico(bateria);
                            System.out.printf("Ok! será realizado o servico: %s\n" ,bateria.getNome());
                            Thread.sleep(3000);
                            bateria.executar();
                            Thread.sleep(2000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");
                            int formaDePagamento = Teclado.nextInt();
                            switch(formaDePagamento){
                                case 1:
                                    PagamentoPix pix = new PagamentoPix();
                                    bateria.setPagamento(pix);
                                    bateria.pagar(bateria.getPreco());
                                    System.out.println("\nObrigado por ter nos escolhido!");
                                    break;
                                case 2:
                                    PagamentoCredito credito = new PagamentoCredito();
                                    bateria.setPagamento(credito);
                                    bateria.pagar(bateria.getPreco());
                                    System.out.println("Obrigado por ter nos escolhido!");
                                    break;
                            }
                    }
                 }
                } catch (InterruptedException e) {
                System.out.println("[ERRO] Argumento inválido: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("[ERRO] Valor não numérico encontrado: ");
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO] Argumento inválido: " + e.getMessage());
            } catch (NullPointerException e){
                System.out.println("[AVISO] Argumento nulo: " +e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("[FATAL] Erro inesperado no processamento do lote");
                throw new RuntimeException(e);
            }
    }
}
