package GUI;

import javax.swing.*;
import java.time.LocalDate;

public class CalculaIdade {
    public static void main(String[] args) {
        while (true) {
            String strAnoNascimento = JOptionPane.showInputDialog(
                    null,
                    "Em que ano você nasceu [-1 para sair]",
                    "Entre com sua idade",
            JOptionPane.QUESTION_MESSAGE
            );

            if (strAnoNascimento == null || strAnoNascimento.equals("-1")) {
                System.exit(0);
            }
            int anoNascimento = 0;
            try {
                anoNascimento = Integer.parseInt(strAnoNascimento);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Entrada invalida! Tente Novamente"
                );
                continue;
            }

            int idade = LocalDate.now().getYear() - anoNascimento;
            JOptionPane.showMessageDialog(null,
            "Você tem" + idade + "anos de idade");

        }
    }
}
