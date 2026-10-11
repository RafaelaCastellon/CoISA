package lab2;

/**
 * Representa o descanso do aluno, considerando as horas de descanso e o número de semanas.
 *
 * @author Rafaela Castellon
 */
public class Descanso {
    private int HorasDescanso;
    private int NumeroSemanas;
    private String StatusGeral;

    /**
     * Cria um registro de descanso com o número de semanas e as horas de descanso informadas.
     *
     * @param numeroSemanas número de semanas consideradas
     * @param horasDescanso quantidade de horas de descanso
     */
    public Descanso(int numeroSemanas, int horasDescanso) {
        NumeroSemanas = numeroSemanas;
        HorasDescanso = horasDescanso;
    }
    
    /**
     * Define a quantidade de horas de descanso.
     *
     * @param valor quantidade de horas de descanso
     */
    public void defineHorasDescanso(int valor) {
        this.HorasDescanso = valor;
    }
    
    /**
     * Define o número de semanas consideradas.
     *
     * @param valor número de semanas
     */
    public void defineNumeroSemanas(int valor){
        this.NumeroSemanas = valor;
    }

    /**
     * Retorna o status geral de descanso.
     * Se não houver semanas registradas, o status será "cansado". Caso contrário, será "descansado" quando
     * a média de horas de descanso por semana for igual ou superior a 26; caso contrário, será "cansado".
     *
     * @return status geral de descanso
     */
    public String getStatusGeral() {
        if (NumeroSemanas == 0) {
            StatusGeral = "cansado";
        } else if (HorasDescanso / NumeroSemanas >= 26) {
            StatusGeral = "descansado";
        } else {
            StatusGeral = "cansado";
        }
        return StatusGeral;
    }
}