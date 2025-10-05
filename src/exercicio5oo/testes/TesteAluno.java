package exercicio5oo.testes;

import exercicio5oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.definirAluno("2025001", "Guilherme");
        a.definirNotas(7, 8, 6);

        System.out.println(a.toString());

        System.out.printf("Média: %.2f%n", a.calcularMedia());
        a.imprimirSituacao();
    }
}
