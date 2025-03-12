package aula6.record;

import java.util.ArrayList;
import java.util.List;

public class CatalogoFilmes {
    private List<Filme> filmes;

    public CatalogoFilmes() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public Filme buscarFilmePorTitulo(String titulo) {
        for (Filme filme : filmes) {
            if (filme.titulo().equalsIgnoreCase(titulo)) {
                return filme;
            }
        }
        return null; // Return null if the movie is not found
    }

    public List<Filme> listarFilmes() {
        return new ArrayList<>(filmes);
    }
}