package lab2;

import java.util.Objects;

public class Resumo {
    private final String tema;
    private final String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return getTema() + ": "  + getConteudo();
    }

    public String getTema() {
        return tema;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Resumo resumo)) return false;
        return Objects.equals(tema, resumo.tema);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tema);
    }

    public String getConteudo() {
        return conteudo;
    }
}
