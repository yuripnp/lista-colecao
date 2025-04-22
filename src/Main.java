import model.Filme;
import model.Pessoa;
import model.Serie;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Serie serie = new Serie();
        Serie serieUm = new Serie();
        Serie serieDois = new Serie();
        Filme filme = new Filme();
        var filmeDois = new Filme();
        var filmeTres = new Filme();

        serie.setTitle("Breaking Bad");
        serie.setDescription("série sobre um usuário de drogas");
        serie.setGenre("Drama");
        serie.setReleaseDate(new Date());

        serieUm.setTitle("Game of Thrones");
        serieUm.setDescription("série sobre o trono de ferro");
        serieUm.setGenre("Fantasia");
        serieUm.setReleaseDate(new Date());

        serieDois.setTitle("Stranger Things");
        serieDois.setDescription("série sobre crianças que enfrentam monstros");
        serieDois.setGenre("Ficção Científica");
        serieDois.setReleaseDate(new Date());

        filme.setTitle("O Senhor dos Anéis");
        filme.setDescription("filme sobre a jornada de um hobbit");
        filme.setGenre("Fantasia");
        filme.setReleaseDate("2001-12-19");

        filmeDois.setTitle("A Origem");
        filmeDois.setDescription("filme sobre sonhos dentro de sonhos");
        filmeDois.setGenre("Ficção Científica");
        filmeDois.setReleaseDate("2010-07-16");

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filme);
        filmes.add(filmeDois);
        filmes.add(filmeTres);

        System.out.println("Filmes um " + filmes.get(0).getTitle());
        System.out.println("O tamanho do numero de filmes é: " + filmes.size());
        System.out.println("imprimindo o tostring do filme: " + filme.toString());
        System.out.println(filmes);
        Filme[] filmesArray = new Filme[2];
        filmesArray[0] = filme;
        filmesArray[1] = filmeDois;

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        System.out.println("---------------------------------------------------------");
        Pessoa pessoaUm = new Pessoa();
        pessoaUm.setNome("Lucas");
        pessoaUm.setIdade(25);

        Pessoa pessoaDois = new Pessoa();
        pessoaDois.setNome("Ana");
        pessoaDois.setIdade(30);

        pessoas.add(pessoaUm);
        pessoas.add(pessoaDois);

        System.out.println("Todas as pessoas: " + pessoas);
        System.out.println("Primeira pessoa: " + pessoas.get(0).getNome());
        System.out.println("Numero de pessoas ativas: " + pessoas.size());



        

    }
}
