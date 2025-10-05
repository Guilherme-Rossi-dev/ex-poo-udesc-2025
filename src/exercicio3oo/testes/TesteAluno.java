package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.setMatricula("2025001");
        a.setNome("Guilherme");
        a.setIdade(34);
        a.setNota1(7);
        a.setNota2(8);
        a.setNota3(6);
        a.setNota4(9);

        System.out.printf("Aluno: %s%n", a.getNome());
        System.out.printf("Média: %.2f%n", a.calcularMedia());
        System.out.printf("Situação: %s%n", a.verificarSituacao());
    }
}
