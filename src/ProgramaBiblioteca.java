public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia", "HarperCollins", 10, 1, "978-0544003415");

        Filme filme = new Filme("Inception", "Christopher Nolan", 2010, "Sci-Fi", "Warner Bros", 5, "Christopher Nolan", "Leonardo DiCaprio", "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.", 148);

        Publicacao[] publicacoes = new Publicacao[2];
        publicacoes[0] = livro;
        publicacoes[1] = filme;

        for (Publicacao publicacao : publicacoes) {
            publicacao.imprimeDados();
            System.out.println();
        }

    }
}
