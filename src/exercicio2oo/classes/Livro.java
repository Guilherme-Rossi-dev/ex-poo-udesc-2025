package exercicio2oo.classes;

public class Livro {
    public String titulo;
    public String autor;
    public String genero;
    public boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }

    public boolean verificarDisponibilidade() {
        return !emprestado;
    }
}
