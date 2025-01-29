package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Se Beber Não Case", 2009);
        meuFilme.avalia(8);
        Filme filmeFavorito = new Filme("Gente Grande", 2008);
        filmeFavorito.avalia(5);
        var filmeFavorito2 = new Filme("Os Vingadores", 2009);
        filmeFavorito2.avalia(10);

        Serie lost = new Serie("Lost" , 2004);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeFavorito2);
        lista.add(filmeFavorito);
        lista.add(meuFilme);
        lista.add(lost);

        for (Titulo item : lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
            //Filme filme = (Filme) item;
            System.out.println("Classificação " + filme.getClassificacao());
            }
        }
    }
}
