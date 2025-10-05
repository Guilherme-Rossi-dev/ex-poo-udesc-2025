package exercicio2oo.testes;

import exercicio2oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.matricula = "2025001";
        a.nome = "Guilherme";
        a.idade = 34;
        a.nota1 = 7;
        a.nota2 = 8;
        a.nota3 = 6;
        a.nota4 = 9;

        System.out.println("Aluno: " + a.nome);
        System.out.println("Média: " + a.calcularMedia());
        System.out.println("Situação: " + a.verificarSituacao());
    }
}
