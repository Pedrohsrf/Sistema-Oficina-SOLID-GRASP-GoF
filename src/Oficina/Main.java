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
                OficinaFacade oficina = new OficinaFacade();

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
                            Servico bateria = new Servico(1, "Troca de bateria", "001", 200.00, false, carro, bateriaFalhando, cleiton, Ronaldo);
                            System.out.printf("Ok! será realizado o servico: %s\n", bateria.getNome());

                            oficina.atribuirERealizarServico(cleiton, bateria);
                            Thread.sleep(3000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento = Teclado.nextInt();
                            if (formaDePagamento == 1) {
                                oficina.definirPagamento(bateria, new PagamentoPix());
                            } else {
                                oficina.definirPagamento(bateria, new PagamentoCredito());
                            }

                            oficina.finalizarEPagarServico(cleiton, bateria);
                            System.out.println("\nObrigado por ter nos escolhido!");
                            break;
                        case 2:
                            Problema oleoFiltro = new Problema("Óleo e filtro vazando");
                            Servico trocaOleo = new Servico(02, "Troca de óleo e filtro", "002", 150.00, false, carro, oleoFiltro, robson, Ronaldo);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaOleo.getNome());
                            oficina.atribuirERealizarServico(robson, trocaOleo);
                            Thread.sleep(3000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento2 = Teclado.nextInt();
                            switch (formaDePagamento2) {
                                case 1:
                                    oficina.definirPagamento(trocaOleo, new PagamentoPix());
                                    break;
                                case 2:
                                    oficina.definirPagamento(trocaOleo, new PagamentoCredito());
                                    break;
                            }

                            oficina.finalizarEPagarServico(robson, trocaOleo);
                            System.out.println("\nObrigado por ter nos escolhido!");
                            break;

                        case 3:
                            Problema pneuFurado = new Problema("Pneu furado");
                            Servico trocaPneu = new Servico(03, "Troca de pneu", "003", 120.00, false, carro, pneuFurado, cleiton, Ronaldo);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaPneu.getNome());
                            oficina.atribuirERealizarServico(cleiton, trocaPneu);
                            Thread.sleep(3000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento3 = Teclado.nextInt();
                            switch (formaDePagamento3) {
                                case 1:
                                    oficina.definirPagamento(trocaPneu, new PagamentoPix());
                                    break;
                                case 2:
                                    oficina.definirPagamento(trocaPneu,new PagamentoCredito());
                                    break;
                            }
                            oficina.finalizarEPagarServico(cleiton,trocaPneu);
                            System.out.println("\nObrigado por ter nos escolhido!");
                            break;

                        case 4:
                            Problema pastilhaDesgastada = new Problema("Pastilha de freio desgastada");
                            Servico trocaPastilha = new Servico(04, "Troca de pastilha de freio", "004", 180.00, false, carro, pastilhaDesgastada, robson, Ronaldo);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaPastilha.getNome());
                            oficina.atribuirERealizarServico(robson, trocaPastilha);
                            Thread.sleep(3000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");
                            int formaDePagamento4 = Teclado.nextInt();
                            switch (formaDePagamento4) {
                                case 1:
                                    oficina.definirPagamento(trocaPastilha, new PagamentoPix());
                                    break;
                                case 2:
                                    oficina.definirPagamento(trocaPastilha, new PagamentoCredito());
                                    break;
                            }

                            oficina.finalizarEPagarServico(robson, trocaPastilha);
                            System.out.println("\nObrigado por ter nos escolhido!");
                            break;

                        case 5:
                            Problema desalinhado = new Problema("Descalibrado/desalinhado");
                            Servico alinhamento = new Servico(05, "Alinhamento e balanceamento", "005", 100.00, false, carro, desalinhado, cleiton, Ronaldo);
                            System.out.printf("Ok! será realizado o servico: %s\n", alinhamento.getNome());
                            oficina.atribuirERealizarServico(cleiton, alinhamento);
                            Thread.sleep(3000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");
                            int formaDePagamento5 = Teclado.nextInt();
                            switch (formaDePagamento5) {
                                case 1:
                                    oficina.definirPagamento(alinhamento, new PagamentoPix());
                                    break;
                                case 2:
                                    oficina.definirPagamento(alinhamento, new PagamentoCredito());
                                    break;
                            }

                            oficina.atribuirERealizarServico(cleiton, alinhamento);
                            System.out.println("Obrigado por ter nos escolhido!");
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
                            System.out.printf("Ok! será realizado o servico: %s\n", bateria.getNome());
                            oficina.atribuirERealizarServico(cleiton, bateria);
                            Thread.sleep(3000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento = Teclado.nextInt();
                            if (formaDePagamento == 1) {
                                oficina.definirPagamento(bateria, new PagamentoPix());
                            } else {
                                oficina.definirPagamento(bateria, new PagamentoCredito());
                            }

                            oficina.finalizarEPagarServico(cleiton, bateria);
                            System.out.println("\nObrigado por ter nos escolhido!");
                            break;
                        case 2:
                            Problema oleoFiltro = new Problema("Óleo e filtro vazando");
                            Servico trocaOleo = new Servico(02, "Troca de óleo e filtro", "002", 150.00, false, moto, oleoFiltro, cleiton, Ronaldo);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaOleo.getNome());
                            oficina.atribuirERealizarServico(robson, trocaOleo);
                            Thread.sleep(3000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento2 = Teclado.nextInt();
                            switch (formaDePagamento2) {
                                case 1:
                                    oficina.definirPagamento(trocaOleo, new PagamentoPix());
                                    break;
                                case 2:
                                    oficina.definirPagamento(trocaOleo, new PagamentoCredito());
                                    break;
                            }

                            oficina.finalizarEPagarServico(robson, trocaOleo);
                            System.out.println("\nObrigado por ter nos escolhido!");
                            break;

                        case 3:
                            Problema pneuFurado = new Problema("Pneu furado");
                            Servico trocaPneu = new Servico(03, "Troca de pneu", "003", 120.00, false, moto, pneuFurado, robson, Ronaldo);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaPneu.getNome());
                            oficina.atribuirERealizarServico(cleiton, trocaPneu);
                            Thread.sleep(3000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");

                            int formaDePagamento3 = Teclado.nextInt();
                            switch (formaDePagamento3) {
                                case 1:
                                    oficina.definirPagamento(trocaPneu, new PagamentoPix());
                                    break;
                                case 2:
                                    oficina.definirPagamento(trocaPneu,new PagamentoCredito());
                                    break;
                            }
                            oficina.finalizarEPagarServico(cleiton,trocaPneu);
                            System.out.println("\nObrigado por ter nos escolhido!");
                            break;

                        case 4:
                            Problema pastilhaDesgastada = new Problema("Pastilha de freio desgastada");
                            Servico trocaPastilha = new Servico(04, "Troca de pastilha de freio", "004", 180.00, false, moto, pastilhaDesgastada, cleiton, Ronaldo);
                            System.out.printf("Ok! será realizado o servico: %s\n", trocaPastilha.getNome());
                            oficina.atribuirERealizarServico(robson, trocaPastilha);
                            Thread.sleep(3000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");
                            int formaDePagamento4 = Teclado.nextInt();
                            switch (formaDePagamento4) {
                                case 1:
                                    oficina.definirPagamento(trocaPastilha, new PagamentoPix());
                                    break;
                                case 2:
                                    oficina.definirPagamento(trocaPastilha, new PagamentoCredito());
                                    break;
                            }

                            oficina.finalizarEPagarServico(robson, trocaPastilha);
                            System.out.println("\nObrigado por ter nos escolhido!");
                            break;

                        case 5:
                            Problema desalinhado = new Problema("Descalibrado/desalinhado");
                            Servico alinhamento = new Servico(05, "Alinhamento e balanceamento", "005", 100.00, false, moto, desalinhado, robson, Ronaldo);
                            System.out.printf("Ok! será realizado o servico: %s\n", alinhamento.getNome());
                            oficina.atribuirERealizarServico(cleiton, alinhamento);
                            Thread.sleep(3000);
                            System.out.println("\nDigite a forma que deseja realizar o pagamento" +
                                    "\n1-Pix" +
                                    "\n2-Crédito\nSua resposta: ");
                            int formaDePagamento5 = Teclado.nextInt();
                            switch (formaDePagamento5) {
                                case 1:
                                    oficina.definirPagamento(alinhamento, new PagamentoPix());
                                    break;
                                case 2:
                                    oficina.definirPagamento(alinhamento, new PagamentoCredito());
                                    break;
                            }

                            oficina.atribuirERealizarServico(cleiton, alinhamento);
                            System.out.println("Obrigado por ter nos escolhido!");
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
