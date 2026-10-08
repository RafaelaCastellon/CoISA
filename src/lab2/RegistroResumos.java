package lab2;

public class RegistroResumos {
    private int numeroDeResumos;
    private Resumo[] resumos;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    public void adicionaResumo(String tema, String conteudo){
        resumos[numeroDeResumos] = new Resumo(tema, conteudo);
        numeroDeResumos ++;
    }

    public Resumo[] pegaResumos(){
        return resumos;
    }

    public String imprimeResumos(){
        return "- " + numeroDeResumos + " resumo(s) cadastrado(s) \n" + "- " + toString();
    }

    public int contaResumo(){
        return numeroDeResumos;
    }

    public boolean temResumo(String tema) {
        for (int i = 0 ; i < numeroDeResumos; i ++){
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String resultado = "";

        for (int i = 0; i < numeroDeResumos; i++) {
            resultado += resumos[i].getTema();
            if (i < numeroDeResumos - 1) {
                resultado += " | ";
            }
        }
        return resultado;
    }
}