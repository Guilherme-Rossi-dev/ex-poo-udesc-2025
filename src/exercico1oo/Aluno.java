package exercicio1oo;

class Aluno {
    String matricula;
    String nome;
    int idade;
    int nota1;
    int nota2;
    int nota3;
    int nota4;

    double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    String verificarSituacao() {
        double media = calcularMedia();
        if (media >= 7) return "Aprovado";
        else if (media >= 5) return "Em exame";
        else return "Reprovado";
    }
}
