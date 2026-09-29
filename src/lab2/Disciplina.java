package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private String[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas){

    }

    public void cadastraNota(int nota, double valorNota){

    }

    public boolean aprovado() {

    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", horasEstudo=" + horasEstudo +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
