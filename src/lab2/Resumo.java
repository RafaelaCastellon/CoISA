package lab2;

import java.util.Objects;

/**
 * Representa um resumo, armazenando seu tema e seu conteúdo.
 *
 * @author Seu nome
 */
public class Resumo {
    private String tema;
    private String conteudo;
    
    /**
     * Cria um resumo com um tema e um conteúdo.
     *
     * @param tema tema do resumo
     * @param conteudo conteúdo do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }
    
    /**
     * Retorna o tema e o conteúdo do resumo.
     *
     * @return texto com o tema e o conteúdo
     */
    @Override
    public String toString() {
        return getTema() + ": "  + getConteudo();
    }
    
    /**
     * Retorna o tema do resumo.
     *
     * @return tema do resumo
     */
    public String getTema() {
        return tema;
    }
    
    /**
     * Verifica se dois resumos possuem o mesmo tema.
     *
     * @param o objeto que será comparado com este resumo
     * @return true se os temas forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Resumo resumo)) return false;
        return Objects.equals(tema, resumo.tema);
    }
    
    /**
     * Retorna o código hash do tema do resumo.
     *
     * @return código hash do tema
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(tema);
    }
    
    /**
     * Retorna o conteúdo do resumo.
     *
     * @return conteúdo do resumo
     */
    public String getConteudo() {
        return conteudo;
    }
}
