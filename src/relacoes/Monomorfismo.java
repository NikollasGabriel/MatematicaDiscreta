package relacoes;

import static relacoes.Injetora.relacaoInjetora;
import static relacoes.Total.relacaoTotal;

public class Monomorfismo {

    public static boolean relacaoMonomorfismo(Relacao relacao) {

        return relacaoTotal(relacao) && relacaoInjetora(relacao);
    }

    public static boolean relacaoMonomorfismoComposta(Relacao relacao) {
        return relacaoTotal(relacao) && relacaoInjetora(relacao);
    }
}
