import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Se Beber Não Case");
        meuFilme.setAnoDeLancamento(2009);
        meuFilme.setDuracaoEmMinutos(100);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaDasAvaliacoes());
    }
}
