package exercicio4oo.testes;

import exercicio4oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.definirLivro("O Senhor dos Anéis", "J.R.R. Tolkien");

        l.verificarDisponibilidade();

        l.emprestar();
        l.verificarDisponibilidade();

        l.devolver();
        l.verificarDisponibilidade();
    }
}
