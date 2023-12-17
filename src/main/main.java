import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n, arrecadacao = 0;
        char tipoVeiculo, veiculo1 = 0, veiculo2 = 0, veiculo3 = 0, servico1 = 0, servico2 = 0, servico3 = 0,
                tipoServico;

        System.out.print("Digite quantas solicitaçoes você deseja: ");

        n = leia.nextInt();

        String[] nomes = new String[n];
        String[] veiculo = new String[n];
        String[] servico = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Qual o seu nome: ");
            nomes[i] = leia.next();

           tabelas.menuVeiculo();

            tipoVeiculo = leia.next().charAt(0);

            while (tipoVeiculo != '1' && tipoVeiculo != '2' && tipoVeiculo != '3') {
                System.out.println("Opcão inválida. Tente novamente.");
                tipoVeiculo = leia.next().charAt(0);
            }

            if (tipoVeiculo == '1') {
                veiculo[i] = "Pequeno (populares)";
                veiculo1++;

            } else if (tipoVeiculo == '2') {
                veiculo[i] = "Médio (SUV e Picape)";
                veiculo2++;
            } else if (tipoVeiculo == '3') {
                veiculo[i] = "Grande (Van e micro-ônibus)";
                veiculo3++;
            }

           
            tabelas.menuServico();
            tipoServico = leia.next().charAt(0);

            while (tipoServico != '1' && tipoServico != '2' && tipoServico != '3') {
                System.out.println("Opcão inválida. Tente novamente.");
                tipoServico = leia.next().charAt(0);
            }

            if (tipoServico == '1') {
                servico[i] = "Lavação externa";
                servico1++;
            } else if (tipoServico == '2') {
                servico[i] = "Lavação externa + interna";
                servico2++;
            } else if (tipoServico == '3') {
                servico[i] = "Lavação externa + interna + cera.";
                servico3++;
            }

            System.out.println("Segue a tabela de precos de acordo com o tipo de veiculo e tipo de servico");
            System.out.println();
                  
            tabelas.tabelaPrecos();

            System.out.println();

            if (tipoVeiculo == '1' && tipoServico == '1') {
                arrecadacao += 30;
                System.out.println(nomes[i] + " com o veiculo " + veiculo[i] + " e o servico de " + servico[i]
                        + " pagara o valor de R$ 30,00");
            } else if (tipoVeiculo == '1' && tipoServico == '2' || tipoVeiculo == '2' && tipoServico == '1') {
                arrecadacao += 50;
                System.out.println(nomes[i] + " com o veiculo " + veiculo[i] + " e o servico de " + servico[i]
                        + " pagara o valor de R$ 50,00");
            } else if (tipoVeiculo == '1' && tipoServico == '3' || tipoVeiculo == '2' && tipoServico == '2'
                    || tipoVeiculo == '3' && tipoServico == '1') {
                arrecadacao += 70;
                System.out.println(nomes[i] + " com o veiculo " + veiculo[i] + " e o servico de " + servico[i]
                        + " pagara o valor de R$ 70,00");
            } else if (tipoVeiculo == '2' && tipoServico == '3' || tipoVeiculo == '3' && tipoServico == '2') {
                arrecadacao += 90;
                System.out.println(nomes[i] + " com o veiculo " + veiculo[i] + " e o servico de " + servico[i]
                        + " pagara o valor de R$ 90,00");
            } else if (tipoVeiculo == '3' && tipoServico == '3') {
                arrecadacao += 110;
                System.out.println(nomes[i] + " com o veiculo " + veiculo[i] + " e o servico de " + servico[i]
                        + " pagara o valor de R$ 110,00");
            }
            ;

        }
        System.out.println("\nPercentuais dos atendimentos pelo tipo do veículo:");
        System.out.println("Pequeno (populares): " + ((double) veiculo1 / n * 100.00) + "%");
        System.out.println("Médio (SUV e Picape): " + ((double) veiculo2 / n * 100.00) + "%");
        System.out.println("Grande (Van e micro-ônibus): " + ((double) veiculo3 / n * 100.00) + "%");
        System.out.println("\nPercentuais dos atendimentos pelo serviço:");
        System.out.println("Lavação externa: " + ((double) servico1 / n * 100.00) + "%");
        System.out.println("Lavação externa + interna: " + ((double) servico2 / n * 100.00) + "%");
        System.out.println("Lavação externa + interna + cera: " + ((double) servico3 / n * 100.00) + "%");
        

        String veiculoMaisAtendido;
        int maxVeiculosAtendidos = Math.max(Math.max(veiculo1, veiculo2), veiculo3);

        if (maxVeiculosAtendidos == veiculo1) {
            veiculoMaisAtendido = "Pequeno (populares)";
        } else if (maxVeiculosAtendidos == veiculo2) {
            veiculoMaisAtendido = "Médio (SUV e Picape)";
        } else {
            veiculoMaisAtendido = "Grande (Van e micro-ônibus)";
        }

        System.out.println("O tipo de veículo mais atendido foi: " + veiculoMaisAtendido);

        String servicoMaisAtendido;
        int maxServicosAtendidos = Math.max(Math.max(servico1, servico2), servico3);

        if (maxServicosAtendidos == servico1) {
            servicoMaisAtendido = "Lavação externa";
        }else if (maxServicosAtendidos == servico2) {
            servicoMaisAtendido = "Lavação externa + interna";
        } else {
            servicoMaisAtendido = "Lavação externa + interna + cera";
        }

        System.out.println("O tipo de servico mais atendido foi: " + servicoMaisAtendido);

    }
}

