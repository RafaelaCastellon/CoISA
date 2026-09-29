package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoOnline;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempo){

    }
    public boolean atingiuMetaTempoOnline(){
        if (tempoOnline >= tempoOnlineEsperado) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "RegistroTempoOnline{" +
                "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", tempoOnlineEsperado=" + tempoOnlineEsperado +
                ", tempoOnline=" + tempoOnline +
                '}';
    }
}
