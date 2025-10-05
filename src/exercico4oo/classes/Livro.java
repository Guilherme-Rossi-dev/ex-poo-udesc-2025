package exercicio4oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public void definirLivro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false; // inicialmente disponível
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro já está emprestado!");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro já estava disponível!");
        }
    }

    public void verificarDisponibilidade() {
        if (emprestado) {
            System.out.println("Livro indisponível para empréstimo.");
        } else {
            System.out.println("Livro disponível para empréstimo.");
        }
    }
}
