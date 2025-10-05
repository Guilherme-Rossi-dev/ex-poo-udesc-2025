package exercicio2oo.testes;

import exercicio2oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.titulo = "O Senhor dos Anéis";
        l.autor = "J.R.R. Tolkien";
        l.genero = "Fantasia";
        l.emprestado = false;

        System.out.println("Disponível? " + l.verificarDisponibilidade());
        l.emprestar();
        System.out.println("Disponível? " + l.verificarDisponibilidade());
        l.devolver();
        System.out.println("Disponível? " + l.verificarDisponibilidade());
    }
}
