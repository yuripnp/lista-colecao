import model.*;

import java.util.*;

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

        filmeTres.setTitle("O Poderoso Chefão");
        filmeTres.setDescription("filme sobre a máfia italiana");
        filmeTres.setGenre("Drama");
        filmeTres.setReleaseDate("1972-03-24");

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
        System.out.println("---------------------------------------------------------------");
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produtoUm = new Produto("Produto 1", 10.0, 5);
        Produto produtoDois = new Produto("Produto 2", 20.0, 10);
        Produto produtoTres = new Produto("Produto 3", 30.0, 15);
        produtos.add(produtoUm);
        produtos.add(produtoDois);
        produtos.add(produtoTres);
        System.out.println("Todos os produtos: " + produtos);
        System.out.println("Primeiro produto: " + produtos.get(0).getNome());
        System.out.println("------------------------------------------------------------------");
        ArrayList<Video> videos = new ArrayList<>();
        videos.add(serie);
        videos.add(serieUm);
        videos.add(filme);
        videos.add(filmeDois);
        System.out.println("Todos os videos: " + videos);
        for (Video video : videos) {
            if(video instanceof Serie seireItem && seireItem.getGenre().equals("Fantasia")) {
                System.out.println("Série: " + seireItem.getTitle());
            } else if (video instanceof Filme filmeItem) {
                System.out.println("Filme: " + filmeItem.getDescription());
            }
        }
        videos.forEach(video -> { System.out.println("Título: " + video.getTitle()); });

        System.out.println("------------------------------------------------------------------");
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Ana");
        nomes.add("João");
        System.out.println("Todos os nomes: " + nomes);
        Collections.sort(nomes);
        System.out.println("Nomes ordenados: " + nomes);
        System.out.println(filmes);
        Collections.sort(filmes);
        System.out.println("Filmes ordenados: " + filmes);

        pessoas.sort(Comparator.comparing(Pessoa::getIdade));
        System.out.println("------------------------------------------------------------");

        List<Filme> filmesList = new ArrayList<>();
        filmesList.add(filme);
        filmesList.add(filmeDois);
        filmesList.add(filmeTres);

        List<Integer> numeros = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Números: " + numeros);
        Set<Integer> numerosSet = new HashSet<>(numeros);
        numerosSet.add(6);
        numerosSet.add(7);
        System.out.println("Números Set: " + numerosSet);
        numerosSet.add(7);
        System.out.println("Números Set após adicionar duplicado: " + numerosSet);
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("tres", 3);
        System.out.println("Mapa: " + mapa);
        List<String> lista = new Stack<>(); // LIFO ultmo entra, primeiro a sair, otimo em processamento de texto
        lista.add("um");
        lista.add("dois");
        lista.add("tres");






        

    }
}
