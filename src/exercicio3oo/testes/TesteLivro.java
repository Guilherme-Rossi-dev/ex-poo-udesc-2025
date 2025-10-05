package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.setTitulo("O Senhor dos Anéis");
        l.setAutor("J.R.R. Tolkien");
        l.setGenero("Fantasia");
        l.setEmprestado(false);

        // Verifica disponibilidade inicial
        System.out.printf("Disponível? %s%n", !l.isEmprestado());

        // Empresta o livro
        l.emprestar();
        System.out.printf("Disponível? %s%n", !l.isEmprestado());

        // Devolve o livro
        l.devolver();
        System.out.printf("Disponível? %s%n", !l.isEmprestado());
    }
}
