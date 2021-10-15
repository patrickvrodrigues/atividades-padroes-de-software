package etapa03.atividade01.questao03;

public class Logger {
    public static Logger instancia;


    public static synchronized Logger getInstance() {
        if (instancia == null)
            instancia = new Logger();

        return instancia;
    }

    /* por default não imprime o log */
    private boolean ativo = false;
    private Logger() {
    }
    public boolean isAtivo() {
        return this.ativo;

    }
    public void setAtivo(boolean b) {
        this.ativo = b;
    }
    public void log(String s) {

        if (this.ativo)
            System.out.println("LOG :: " + s);

    }
}