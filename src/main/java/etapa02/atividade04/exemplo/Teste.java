package etapa02.atividade04.exemplo;

public class Teste {
    public static void main (String[] args){
        Pessoa pessoa1 = new Pessoa("Patrick", "535243432", SexoEnum.MASCULINO);

        System.out.println(pessoa1.getSexo());

    }
}
