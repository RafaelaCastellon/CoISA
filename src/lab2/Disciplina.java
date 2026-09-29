package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas){

    }

    public void cadastraNota(int nota, double valorNota){

    }

    public boolean aprovado() {
        double total = 0.0;
        for (double item: notas){
            total += item;
        }
        double media = total / 4;
        if (media >= 7.0){
            return true;
        } else {
            return false;
        }
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
