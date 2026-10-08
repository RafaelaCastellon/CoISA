package lab2;

public class Descanso {
    private int HorasDescanso;
    private int NumeroSemanas;
    private String StatusGeral;

    public Descanso(int numeroSemanas, int horasDescanso) {
        NumeroSemanas = numeroSemanas;
        HorasDescanso = horasDescanso;
    }

    public void defineHorasDescanso(int valor) {
        this.HorasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor){
        this.NumeroSemanas = valor;
    }

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