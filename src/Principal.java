import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Se Beber Não Case");
        meuFilme.setAnoDeLancamento(2009);
        meuFilme.setDuracaoEmMinutos(100);
        meuFilme.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos());

        Filme filmeFavorito = new Filme();
        filmeFavorito.setNome("Gente Grande");
        filmeFavorito.setAnoDeLancamento(2008);
        filmeFavorito.setDuracaoEmMinutos(120);
        filmeFavorito.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + filmeFavorito.getDuracaoEmMinutos());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(30);
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(filmeFavorito);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

    }
}
