package relacoes;

import javax.swing.JOptionPane;
import static relacoes.Injetora.relacaoInjetora;
import static relacoes.Injetora.relacaoInjetoraComposta;
import static relacoes.Total.relacaoTotal;
import static relacoes.Total.relacaoTotalComposta;

public class Monomorfismo {

    public static boolean relacaoMonomorfismo(Relacao relacao) {

        if (relacaoTotal(relacao) && relacaoInjetora(relacao)) {
            JOptionPane.showMessageDialog(null, "A relação é monomorfica");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "A relação não é monomorfica");
            return false;
        }
    }

    public static boolean relacaoMonomorfismoComposta(Relacao relacao) {
        if (relacaoTotalComposta(relacao) && relacaoInjetoraComposta(relacao)) {
            JOptionPane.showMessageDialog(null, "A composição de relação é monomorfica");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "A composição de relação não é monomorfica");
            return false;
        }
    }
}
