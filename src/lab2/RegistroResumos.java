package lab2;

import java.util.Arrays;

public class RegistroResumos {
    private int numeroDeResumos;
    private Resumo[] resumos;

    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
    }

    public void adicionaResumo(String tema, String conteudo){
        resumos[numeroDeResumos] = new Resumo(tema, conteudo);
        numeroDeResumos ++;
    }

    public Resumo[] pegaResumos(){
        return resumos;
    }


    public String imprimeResumos(){
        return toString();
    }

    public int contaResumo(){
        return numeroDeResumos;
    }

    public boolean temResumo(String tema) {
        for (Resumo resumo: resumos){
            if (resumo.getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

}