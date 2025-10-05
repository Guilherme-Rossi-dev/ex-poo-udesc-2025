package exercicio5oo.classes;

public class Aluno {
    private String matricula;
    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;

    public Aluno() {
        this.matricula = "";
        this.nome = "";
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }

    public Aluno(String matricula, String nome, int nota1, int nota2, int nota3) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

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

    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }
}
