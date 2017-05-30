package relacoes;

import static relacoes.Injetora.relacaoInjetora;
import static relacoes.Total.relacaoTotal;

public class Monomorfismo {

    public static void relacaoMonomorfismo(Relacao relacao) {

        if (relacaoTotal(relacao) && relacaoInjetora(relacao)) {
            return é isso mesmo;
        } else {
            return não é isso não;
        }
    }

    public static void relacaoMonomorfismoComposta(Relacao relacao) {

    }
}
