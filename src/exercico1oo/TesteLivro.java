package exercicio1oo;

public class TesteLivro {
    public static void main(String[] args) {
        exercicio1oo.Livro l = new exercicio1oo.Livro();
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
