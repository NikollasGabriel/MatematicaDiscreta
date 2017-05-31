package relacoes;

import javax.swing.JOptionPane;
import static relacoes.Epimorfismo.relacaoEpimorfismo;
import static relacoes.Monomorfismo.relacaoMonomorfismo;

public class Isomorfismo {

    public static boolean relacaoIsomorfismo(Relacao relacao) {

        if (relacaoMonomorfismo(relacao) && relacaoEpimorfismo(relacao)) {
            JOptionPane.showMessageDialog(null, "A relação é isomorfica");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "A relação não é isomorfica");
            return false;
        }
    }

    public static boolean relacaoIsomorfismoComposta(Relacao relacao) {
        if (relacaoMonomorfismo(relacao) && relacaoEpimorfismo(relacao)) {
            JOptionPane.showMessageDialog(null, "A composição de relação é isomorfica");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "A composição de relação não é isomorfica");
            return false;
        }
    }

}
