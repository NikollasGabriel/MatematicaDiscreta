package relacoes;

import static relacoes.Epimorfismo.relacaoEpimorfismo;
import static relacoes.Monomorfismo.relacaoMonomorfismo;

public class Isomorfismo {

    public static void relacaoIsomorfismo(Relacao relacao) {

        if (relacaoMonomorfismo(relacao) && relacaoEpimorfismo(relacao)) {
            return é isso mesmo;
        } else {
            return não é isso não;
        }

    }

    public static void relacaoIsomorfismoComposta(Relacao relacao) {

    }

}
