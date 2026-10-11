package lab2;


/**
 * Registra o tempo online de uma disciplina,
 * permitindo acompanhar o tempo realizado e a meta esperada.
 *
 * @author Rafaela Castellon
 */
public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoOnline;

    /**
     * Cria um registro de tempo online com a meta padrão de 120.
     *
     * @param nomeDisciplina nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120);
    }
    
    /**
     * Cria um registro de tempo online com uma meta definida.
     *
     * @param nomeDisciplina nome da disciplina
     * @param tempoOnlineEsperado tempo online esperado para a disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
    
    /**
     * Adiciona tempo ao total online registrado.
     *
     * @param tempoOnline quantidade de tempo a adicionar
     */
    public void adicionaTempoOnline(int tempoOnline){
        this.tempoOnline += tempoOnline;
    }
    
    /**
     * Verifica se o tempo online registrado atingiu a meta esperada.
     *
     * @return true se o tempo registrado for maior ou igual à meta,
     *         false caso contrário
     */
    public boolean atingiuMetaTempoOnline(){
        if (tempoOnline >= tempoOnlineEsperado) {
            return true;
        }
        return false;
    }
    
    /**
     * Retorna uma representação textual do registro, mostrando o nome da disciplina, o tempo realizado e o tempo esperado.
     *
     * @return representação textual do registro de tempo online
     */
    @Override
    public String toString() {
        return nomeDisciplina + ' ' + tempoOnline + '/' + tempoOnlineEsperado;
    }
}
