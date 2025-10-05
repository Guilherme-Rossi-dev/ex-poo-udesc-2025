package exercicio4oo.classes;

public class Aluno {
    private String matricula;
    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public void imprimirSituacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println("Aluno aprovado. Média: " + media);
        } else {
            System.out.println("Aluno reprovado. Média: " + media);
        }
    }

    public void definirNotas(int n1, int n2, int n3) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public void definirAluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
}