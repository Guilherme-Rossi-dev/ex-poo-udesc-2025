package exercicio4oo.testes;

import exercicio4oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.definirAluno("2025001", "Guilherme");

        a.definirNotas(7, 8, 6);

        System.out.println("Aluno: Guilherme");
        System.out.printf("Média: %.2f%n", a.calcularMedia());
        a.imprimirSituacao();
    }
}