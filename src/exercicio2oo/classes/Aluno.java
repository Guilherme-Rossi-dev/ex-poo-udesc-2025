package exercicio2oo.classes;

public  class Aluno {
   public String matricula;
    public String nome;
    public int idade;
    public int nota1;
    public int nota2;
    public int nota3;
    public int nota4;

    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    public String verificarSituacao() {
        double media = calcularMedia();
        if (media >= 7) return "Aprovado";
        else if (media >= 5) return "Em exame";
        else return "Reprovado";
    }
}
