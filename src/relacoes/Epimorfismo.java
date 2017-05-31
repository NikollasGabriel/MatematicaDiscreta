package relacoes;

import javax.swing.JOptionPane;
import static relacoes.Funcional.relacaoFuncional;
import static relacoes.Funcional.relacaoFuncionalComposta;
import static relacoes.Sobrejetora.relacaoSobrejetora;
import static relacoes.Sobrejetora.relacaoSobrejetoraComposta;

public class Epimorfismo {

    public static boolean relacaoEpimorfismo(Relacao relacao) {

        if (relacaoFuncional(relacao) && relacaoSobrejetora(relacao)) {
            JOptionPane.showMessageDialog(null, "A relação é epimorfica");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "A relação não é epimorfica");
            return false;
        }
    }

    public static boolean relacaoEpimorfismoComposta(Relacao relacao) {

        if (relacaoFuncionalComposta(relacao) && relacaoSobrejetoraComposta(relacao)) {
            JOptionPane.showMessageDialog(null, "A composição de relação é epimorfica");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "A composição de relação não é epimorfica");
            return false;
        }
    }
}
