package etapa01.prova01.questao07;

public class RelatorioTeste {
    public static void main(String[] args) {
        Dados dado1 = new Dados("Banco do Brasil", "Patrick Viegas", 1111 - 1,
                1111, 1000, "99999999",
                "patrickviegas4@gmail.com", "Rua teste");

        RelatorioSimples relatorioSimples = new RelatorioSimples("Testando Relatório simples",dado1);
        RelatorioComplexo relatorioComplexo = new RelatorioComplexo("Testando Relatório complexo",dado1);

        System.out.println("##########################################");
        System.out.println("Relatório Simples");
        System.out.println("##########################################");
        relatorioSimples.geraRelatorio();
        System.out.println("##########################################");
        System.out.println("Relatório Complexo");
        System.out.println("##########################################");
        relatorioComplexo.geraRelatorio();
    }
}
