package relacoes;

import static relacoes.Epimorfismo.relacaoEpimorfismo;
import static relacoes.Monomorfismo.relacaoMonomorfismo;

public class Isomorfismo {

    public static String relacaoIsomorfismo(Relacao relacao) {

        if (relacaoMonomorfismo(relacao) && relacaoEpimorfismo(relacao)) {
            return "É Monomorfismo";
        } else {
            return "Não é Monomorfismo";
        }

    }

    public static void relacaoIsomorfismoComposta(Relacao relacao) {

    }

}
