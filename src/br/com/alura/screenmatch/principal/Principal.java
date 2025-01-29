package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        Filme meuFilme = new Filme("Se Beber Não Case", 2009);
        meuFilme.setDuracaoEmMinutos(100);
        meuFilme.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        System.out.println(meuFilme.mediaDasAvaliacoes());
        filtro.filtra(meuFilme);

        Filme filmeFavorito = new Filme("Gente Grande", 2008);
        filmeFavorito.setDuracaoEmMinutos(120);
        filmeFavorito.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + filmeFavorito.getDuracaoEmMinutos());
        filtro.filtra(filmeFavorito);

        Serie lost = new Serie("Lost" , 2004);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(30);
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos() + "\n");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(filmeFavorito);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);
        filtro.filtra(episodio);

        //Filme filmeFavorito2 = new Filme();
        var filmeFavorito2 = new Filme("Os Vingadores", 2009);
        filmeFavorito2.setDuracaoEmMinutos(200);
        filmeFavorito2.exibeFichaTecnica();
        filmeFavorito2.avalia(10);
        filtro.filtra(filmeFavorito2);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeFavorito2);
        listaDeFilmes.add(filmeFavorito);
        listaDeFilmes.add(meuFilme);
        System.out.println("\nTamanho da Lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println((listaDeFilmes));
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
    }
}
