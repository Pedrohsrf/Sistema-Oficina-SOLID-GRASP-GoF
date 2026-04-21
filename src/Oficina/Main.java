package Oficina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
            try{
                int escolha;
                System.out.println("\nBem-vindo(a) a Oficina Beid!\n \nEscolha o tipo do seu veiculo! \n1-Carro \n2-Moto\nSua resposta: ");
                escolha = Teclado.nextInt();
                Funcionario cleiton = new Funcionario(001,"Cleiton","987.654.321-00","Mecânico");
                Funcionario robson = new Funcionario(002,"Robson","983.574.451-98","Mecânico");

                if(escolha == 1){
                    Carro carro = new Carro("BMW","BMW X1","Branco","00001","2.0","FGL8F81","2026",4);
                    Cliente Ronaldo = new Cliente(1002, "Ronaldo", "123.456.678-01", "(85)123345678", carro, 100.00);


                    System.out.println("Seu saldo atual: " +Ronaldo.getSaldo() +"\nDigite o problema que seu carro apresenta: \n1-Bateria falhando" +
                            "\n2-Oléo e filtro vazando" +
                            "\n3-Pneu furado" +
                            "\n4-Pastilha de freio desgastada" +
                            "\n5-Descalibrado/desalinhado\nSua resposta:");
                    int problema = Teclado.nextInt();
                    switch (problema) {
                        case 1:
                            Problema bateriaFalhando = new Problema("Bateria falhando");
                            Servico bateria = new Servico(01, "Troca de bateria", "001", 200.00, false, carro, bateriaFalhando, cleiton, Ronaldo);
                            cleiton.atribuirServico(bateria);
                            System.out.printf("Ok! será realizado o servico: %s\n" ,bateria.getNome());
                            Thread.sleep(3000);
                            bateria.executar();
                            Thread.sleep(2000);
                            cleiton.finalizarServico(bateria);
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
                                break;
                        case 2:
                            Problema oleoFiltro = new Problema("Óleo e filtro vazando");
                            Servico trocaOleo = new Servico(02, "Troca de óleo e filtro", "002", 150.00, false, carro, oleoFiltro, robson, Ronaldo);
                            cleiton.atribuirServico(trocaOleo);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaOleo.getNome());
                            Thread.sleep(3000);
                            trocaOleo.executar();
                            Thread.sleep(2000);
                            robson.finalizarServico(trocaOleo);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento2 = Teclado.nextInt();
                            switch (formaDePagamento2) {
                                case 1:
                                    PagamentoPix pix2 = new PagamentoPix();
                                    trocaOleo.setPagamento(pix2);
                                    trocaOleo.pagar(trocaOleo.getPreco());
                                    System.out.println("\nObrigado por ter nos escolhido!");
                                    break;
                                case 2:
                                    PagamentoCredito credito2 = new PagamentoCredito();
                                    trocaOleo.setPagamento(credito2);
                                    trocaOleo.pagar(trocaOleo.getPreco());
                                    System.out.println("Obrigado por ter nos escolhido!");
                                    break;
                            }
                            break;

                        case 3:
                            Problema pneuFurado = new Problema("Pneu furado");
                            Servico trocaPneu = new Servico(03, "Troca de pneu", "003", 120.00, false, carro, pneuFurado, cleiton, Ronaldo);
                            cleiton.atribuirServico(trocaPneu);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaPneu.getNome());
                            Thread.sleep(3000);
                            trocaPneu.executar();
                            Thread.sleep(2000);
                            cleiton.finalizarServico(trocaPneu);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento3 = Teclado.nextInt();
                            switch (formaDePagamento3) {
                                case 1:
                                    PagamentoPix pix3 = new PagamentoPix();
                                    trocaPneu.setPagamento(pix3);
                                    trocaPneu.pagar(trocaPneu.getPreco());
                                    System.out.println("\nObrigado por ter nos escolhido!");
                                    break;
                                case 2:
                                    PagamentoCredito credito3 = new PagamentoCredito();
                                    trocaPneu.setPagamento(credito3);
                                    trocaPneu.pagar(trocaPneu.getPreco());
                                    System.out.println("Obrigado por ter nos escolhido!");
                                    break;
                            }
                            break;

                        case 4:
                            Problema pastilhaDesgastada = new Problema("Pastilha de freio desgastada");
                            Servico trocaPastilha = new Servico(04, "Troca de pastilha de freio", "004", 180.00, false, carro, pastilhaDesgastada, robson, Ronaldo);
                            cleiton.atribuirServico(trocaPastilha);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaPastilha.getNome());
                            Thread.sleep(3000);
                            trocaPastilha.executar();
                            Thread.sleep(2000);
                            robson.finalizarServico(trocaPastilha);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento4 = Teclado.nextInt();
                            switch (formaDePagamento4) {
                                case 1:
                                    PagamentoPix pix4 = new PagamentoPix();
                                    trocaPastilha.setPagamento(pix4);
                                    trocaPastilha.pagar(trocaPastilha.getPreco());
                                    System.out.println("\nObrigado por ter nos escolhido!");
                                    break;
                                case 2:
                                    PagamentoCredito credito4 = new PagamentoCredito();
                                    trocaPastilha.setPagamento(credito4);
                                    trocaPastilha.pagar(trocaPastilha.getPreco());
                                    System.out.println("Obrigado por ter nos escolhido!");
                                    break;
                            }
                            break;

                        case 5:
                            Problema desalinhado = new Problema("Descalibrado/desalinhado");
                            Servico alinhamento = new Servico(05, "Alinhamento e balanceamento", "005", 100.00, false, carro, desalinhado, cleiton, Ronaldo);
                            cleiton.atribuirServico(alinhamento);
                            System.out.printf("Ok! será realizado o servico: %s\n", alinhamento.getNome());
                            Thread.sleep(3000);
                            alinhamento.executar();
                            Thread.sleep(2000);
                            cleiton.finalizarServico(alinhamento);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento5 = Teclado.nextInt();
                            switch (formaDePagamento5) {
                                case 1:
                                    PagamentoPix pix5 = new PagamentoPix();
                                    alinhamento.setPagamento(pix5);
                                    alinhamento.pagar(alinhamento.getPreco());
                                    System.out.println("\nObrigado por ter nos escolhido!");
                                    break;
                                case 2:
                                    PagamentoCredito credito5 = new PagamentoCredito();
                                    alinhamento.setPagamento(credito5);
                                    alinhamento.pagar(alinhamento.getPreco());
                                    System.out.println("Obrigado por ter nos escolhido!");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            break;
                            }
                    }
                else if (escolha == 2) {
                    Moto moto = new Moto("BMW","R 1250 GS","Preta","0023","1.6","KAL3E32","2025", 150);
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
                            Servico bateria = new Servico(01, "Troca de bateria", "001", 200.00, false, moto, bateriaFalhando, cleiton, Ronaldo);
                            cleiton.atribuirServico(bateria);
                            System.out.printf("Ok! será realizado o servico: %s\n" ,bateria.getNome());
                            Thread.sleep(3000);
                            bateria.executar();
                            Thread.sleep(2000);
                            cleiton.finalizarServico(bateria);
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
                            break;
                        case 2:
                            Problema oleoFiltro = new Problema("Óleo e filtro vazando");
                            Servico trocaOleo = new Servico(02, "Troca de óleo e filtro", "002", 150.00, false, moto, oleoFiltro, cleiton, Ronaldo);
                            cleiton.atribuirServico(trocaOleo);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaOleo.getNome());
                            Thread.sleep(3000);
                            trocaOleo.executar();
                            Thread.sleep(2000);
                            cleiton.finalizarServico(trocaOleo);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento2 = Teclado.nextInt();
                            switch (formaDePagamento2) {
                                case 1:
                                    PagamentoPix pix2 = new PagamentoPix();
                                    trocaOleo.setPagamento(pix2);
                                    trocaOleo.pagar(trocaOleo.getPreco());
                                    System.out.println("\nObrigado por ter nos escolhido!");
                                    break;
                                case 2:
                                    PagamentoCredito credito2 = new PagamentoCredito();
                                    trocaOleo.setPagamento(credito2);
                                    trocaOleo.pagar(trocaOleo.getPreco());
                                    System.out.println("Obrigado por ter nos escolhido!");
                                    break;
                            }
                            break;

                        case 3:
                            Problema pneuFurado = new Problema("Pneu furado");
                            Servico trocaPneu = new Servico(03, "Troca de pneu", "003", 120.00, false, moto, pneuFurado, robson, Ronaldo);
                            cleiton.atribuirServico(trocaPneu);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaPneu.getNome());
                            Thread.sleep(3000);
                            trocaPneu.executar();
                            Thread.sleep(2000);
                            robson.finalizarServico(trocaPneu);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento3 = Teclado.nextInt();
                            switch (formaDePagamento3) {
                                case 1:
                                    PagamentoPix pix3 = new PagamentoPix();
                                    trocaPneu.setPagamento(pix3);
                                    trocaPneu.pagar(trocaPneu.getPreco());
                                    System.out.println("\nObrigado por ter nos escolhido!");
                                    break;
                                case 2:
                                    PagamentoCredito credito3 = new PagamentoCredito();
                                    trocaPneu.setPagamento(credito3);
                                    trocaPneu.pagar(trocaPneu.getPreco());
                                    System.out.println("Obrigado por ter nos escolhido!");
                                    break;
                            }
                            break;

                        case 4:
                            Problema pastilhaDesgastada = new Problema("Pastilha de freio desgastada");
                            Servico trocaPastilha = new Servico(04, "Troca de pastilha de freio", "004", 180.00, false, moto, pastilhaDesgastada, cleiton, Ronaldo);
                            cleiton.atribuirServico(trocaPastilha);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaPastilha.getNome());
                            Thread.sleep(3000);
                            trocaPastilha.executar();
                            Thread.sleep(2000);
                            cleiton.finalizarServico(trocaPastilha);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento4 = Teclado.nextInt();
                            switch (formaDePagamento4) {
                                case 1:
                                    PagamentoPix pix4 = new PagamentoPix();
                                    trocaPastilha.setPagamento(pix4);
                                    trocaPastilha.pagar(trocaPastilha.getPreco());
                                    System.out.println("\nObrigado por ter nos escolhido!");
                                    break;
                                case 2:
                                    PagamentoCredito credito4 = new PagamentoCredito();
                                    trocaPastilha.setPagamento(credito4);
                                    trocaPastilha.pagar(trocaPastilha.getPreco());
                                    System.out.println("Obrigado por ter nos escolhido!");
                                    break;
                            }
                            break;

                        case 5:
                            Problema desalinhado = new Problema("Descalibrado/desalinhado");
                            Servico alinhamento = new Servico(05, "Alinhamento e balanceamento", "005", 100.00, false, moto, desalinhado, robson, Ronaldo);
                            cleiton.atribuirServico(alinhamento);
                            System.out.printf("Ok! será realizado o servico: %s\n", alinhamento.getNome());
                            Thread.sleep(3000);
                            alinhamento.executar();
                            Thread.sleep(2000);
                            robson.finalizarServico(alinhamento);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento5 = Teclado.nextInt();
                            switch (formaDePagamento5) {
                                case 1:
                                    PagamentoPix pix5 = new PagamentoPix();
                                    alinhamento.setPagamento(pix5);
                                    alinhamento.pagar(alinhamento.getPreco());
                                    System.out.println("\nObrigado por ter nos escolhido!");
                                    break;
                                case 2:
                                    PagamentoCredito credito5 = new PagamentoCredito();
                                    alinhamento.setPagamento(credito5);
                                    alinhamento.pagar(alinhamento.getPreco());
                                    System.out.println("\nObrigado por ter nos escolhido!");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            break;
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
            Teclado.close();
    }
}
