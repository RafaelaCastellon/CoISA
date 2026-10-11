package lab2;

import java.util.Arrays;

/**
 * Representa uma disciplina, armazenando seu nome, horas de estudo, notas e pesos das notas.
 *
 * @author Rafaela Castellon
 */
public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private double[] pesos;
    private int numNotas;
    
    /**
     * Cria uma disciplina com quatro notas e sem pesos.
     *
     * @param nomeDisciplina nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
    	this.nomeDisciplina = nomeDisciplina;
    	this.horasEstudo = 0;
    	this.numNotas = 4;
    	this.notas = new double[numNotas];
    	this.pesos = null;
    }
    
    /**
     * Cria uma disciplina com uma quantidade definida de notas, considerando todas as notas com o mesmo peso.
     *
     * @param nomeDisciplina nome da disciplina
     * @param numNotas quantidade de notas da disciplina
     */
	public Disciplina(String nomeDisciplina, int numNotas) {
	    this.nomeDisciplina = nomeDisciplina;
	    this.horasEstudo = 0;
	    this.numNotas = numNotas;
	    this.notas = new double[numNotas];
	    this.pesos = null;
	}
	
	/**
     * Cria uma disciplina com uma quantidade definida de notas e os pesos correspondentes a cada nota.
     *
     * @param nomeDisciplina nome da disciplina
     * @param numNotas quantidade de notas da disciplina
     * @param pesos array com os pesos de cada nota
     */
	public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
	    this.nomeDisciplina = nomeDisciplina;
	    this.horasEstudo = 0;
	    this.numNotas = numNotas;
	    this.notas = new double[numNotas];
	    this.pesos = new double[numNotas];
	    for (int i = 0; i < numNotas; i++) {
	        this.pesos[i] = pesos[i];
	    }
	}
	
	/**
     * Registra as horas de estudo da disciplina.
     *
     * @param horas quantidade de horas de estudo a adicionar
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }
    
    /**
     * Registra uma nota da disciplina.
     *
     * @param nota posição da nota, começando em 1
     * @param valorNota valor da nota a ser registrada
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    /**
     * Calcula a média das notas cadastradas.
     * Se não houver pesos, calcula a média aritmética.
     * Caso contrário, calcula a média ponderada.
     *
     * @return média das notas da disciplina
     */
	public double calculaMedia() {
	    double total = 0.0;
	    if (pesos == null) {
	        for (double item : notas) {
	            total += item;
	        }
	        return total / numNotas;
	    } else {
	        double totalPesos = 0.0;
	        for (int i = 0; i < numNotas; i++) {
	            total += notas[i] * pesos[i];
	            totalPesos += pesos[i];
	        }
	        return total / totalPesos;
	    }
	}
	
	/**
     * Verifica se a média da disciplina é suficiente para aprovação.
     *
     * @return true se a média for maior ou igual a 7.0, false caso contrário
     */
    public boolean aprovado() {
        if (calculaMedia() >= 7.0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Retorna uma representação textual da disciplina,
     * contendo o nome, as horas de estudo, a média e as notas.
     *
     * @return representação textual da disciplina
     */
    @Override
    public String toString() {
        return nomeDisciplina + " " + horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
    }
}