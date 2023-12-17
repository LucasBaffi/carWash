public class tabelas {
    

    public static void tabelaPrecos() {

        String[][] tabelaPrecos = {
            { "Tipo de servico", " 1", "2", "3" },
            { "Tipo do veiculo", " ", "", "" },
            { "      1", " ", "R$30", "R$50", "R$70" },
            { "      2", " ", "R$50", "R$70", "R$90" },
            { "      3", " ", "R$70", "R$90", "R$110" },
    };
    for (int m = 0; m < tabelaPrecos.length; m++) {
        for (int j = 0; j < tabelaPrecos[m].length; j++) {
            System.out.print(tabelaPrecos[m][j] + "\t");
        }
        System.out.println();
    }
    }

     public static void menuServico() {

        System.out.println("Qual o tipo de serviço\n" +
        "1 - Lavação externa\n" +
        "2 - Lavação externa + interna\n" +
        "3 - Lavação externa + interna + cera.");
    }

    public static void menuVeiculo() {

        System.out.println("Qual o tipo de veículo\n" +
        "1 - Pequeno (populares)\n" +
        "2 - Medio (SUV e Picape)\n" +
        "3 - Grande (Van e micro-onibus).");
    }
}
