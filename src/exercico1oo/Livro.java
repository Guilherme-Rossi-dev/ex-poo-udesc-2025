package exercicio1oo;

class Livro {
    String titulo;
    String autor;
    String genero;
    boolean emprestado;

    void emprestar() {
        emprestado = true;
    }

    void devolver() {
        emprestado = false;
    }

    boolean verificarDisponibilidade() {
        return !emprestado;
    }
}
