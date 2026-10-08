package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoOnline;

    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120);
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
// faltou por aqui, mas ainda tá sendo feito, normal :) @katarinamaelly
    public void adicionaTempoOnline(int tempoOnline){
        this.tempoOnline += tempoOnline;
    }

    public boolean atingiuMetaTempoOnline(){
        if (tempoOnline >= tempoOnlineEsperado) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return nomeDisciplina + ' ' + tempoOnline + '/' + tempoOnlineEsperado;
    }
}
