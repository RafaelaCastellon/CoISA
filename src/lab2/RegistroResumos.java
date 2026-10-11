package lab2;
/**
 * Registra e gerencia resumos de conteúdos,
 * permitindo adicionar, consultar e buscar resumos cadastrados.
 *
 * @author Rafaela Castellon
 */
public class RegistroResumos {
    private int numeroDeResumos;
    private Resumo[] resumos;

    /**
     * Cria um registro de resumos com a capacidade informada.
     *
     * @param numeroDeResumos quantidade máxima de resumos que podem ser cadastrados
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }
    
    /**
     * Adiciona um resumo ao registro.
     *
     * @param tema tema do resumo
     * @param conteudo conteúdo do resumo
     */
    public void adicionaResumo(String tema, String conteudo){
        resumos[numeroDeResumos] = new Resumo(tema, conteudo);
        numeroDeResumos ++;
    }
    
    /**
     * Retorna o array de resumos armazenados.
     *
     * @return array de resumos
     */
    public Resumo[] pegaResumos(){
        return resumos;
    }
    
    /**
     * Retorna uma mensagem com a quantidade de resumos cadastrados
     * e os respectivos temas.
     *
     * @return texto com a quantidade de resumos e seus temas
     */
    public String imprimeResumos(){
        return "- " + numeroDeResumos + " resumo(s) cadastrado(s) \n" + "- " + toString();
    }
    
    /**
     * Retorna a quantidade de resumos cadastrados.
     *
     * @return número de resumos cadastrados
     */
    public int contaResumo(){
        return numeroDeResumos;
    }

    /**
     * Verifica se existe um resumo com o tema informado.
     *
     * @param tema tema a ser pesquisado
     * @return true se o tema estiver cadastrado, false caso contrário
     */
    public boolean temResumo(String tema) {
        for (int i = 0 ; i < numeroDeResumos; i ++){
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Busca nos conteúdos dos resumos a chave informada, ignorando diferenças entre letras maiúsculas e minúsculas.
     * Os temas encontrados são retornados.
     *
     * @param chaveDeBusca palavra ou trecho a ser pesquisado
     * @return array com os temas dos resumos encontrados
     */
    public String[] busca(String chaveDeBusca) {
    	String[] resultado = new String[numeroDeResumos];
    	int contador = 0;
    	for (int i = 0; i < numeroDeResumos; i++) {
    		if (resumos[i].getConteudo().toLowerCase().contains(chaveDeBusca.toLowerCase())) {
    			resultado[contador] = resumos[i].getTema();
    			contador++;
    		}
    	}
    	resultado = java.util.Arrays.copyOf(resultado, contador);
    	java.util.Arrays.sort(resultado);
    	return resultado;
    }
    
    /**
     * Retorna os temas dos resumos cadastrados, separados por " | ".
     *
     * @return texto contendo os temas dos resumos
     */
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