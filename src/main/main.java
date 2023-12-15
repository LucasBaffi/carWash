import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n;
        char tipoVeiculo, veiculo1 = 0, veiculo2 = 0, veiculo3 = 0, servico1 = 0, servico2 = 0, servico3 = 0, tipoServico;
        int[][] matrizA = new int[n][n];
        
        
        System.err.print("Digite quantas solicitaçoes você deseja: ");
        n = leia.nextInt();
        String[] nomes = new String[n];

        for (int i = 0; i < n; i++) {
            
            System.out.print("Qual o seu nome: ");
             nomes[i] = leia.next();

             System.out.println("Qual o tipo do seu carro\n" + 
             "1 - Pequeno (populares)\n" +
             "2 - Médio (SUV e Picape)\n" +
             "3 - Grande (Van e micro-ônibus).");  

            tipoVeiculo = leia.next().charAt(0);

            while(tipoVeiculo != '1' && tipoVeiculo != '2' && tipoVeiculo != '3'){
                System.out.println("Opcão inválida. Tente novamente.");
                tipoVeiculo = leia.next().charAt(0);
            }

            if(tipoVeiculo == '1'){
                veiculo1++;

            }else if(tipoVeiculo == '2'){
                veiculo2++;
            }else if(tipoVeiculo == '3'){
                veiculo3++;
            }

            
           System.out.println("Qual o tipo de serviço\n" +
             "1 - Lavação externa\n" +
             "2 - Lavação externa + interna\n" +
             "3 - Lavação externa + interna + cera.");       
             
           tipoServico = leia.next().charAt(0);

           while(tipoServico != '1' && tipoServico != '2' && tipoServico != '3'){
               System.out.println("Opcão inválida. Tente novamente.");
               tipoServico = leia.next().charAt(0);
           }

           if(tipoServico == '1'){
               servico1++;
           }else if(tipoServico == '2'){
               servico2++;
           }else if(tipoServico == '3'){
               servico3++;
           }

        }



    }
}