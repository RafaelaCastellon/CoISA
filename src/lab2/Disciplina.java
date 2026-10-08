package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public double calculaMedia(){
        double total = 0.0;
        for (double item : notas) {
            total += item;
        }
        double media = total / 4;
        return media;
    }

    public boolean aprovado() {
        if (calculaMedia() >= 7.0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
    }
}