package relacoes;

import static relacoes.Funcional.relacaoFuncional;
import static relacoes.Sobrejetora.relacaoSobrejetora;

public class Epimorfismo {

    public static boolean relacaoEpimorfismo(Relacao relacao) {
        
        return relacaoFuncional(relacao) && relacaoSobrejetora(relacao);
    }

    public static boolean relacaoEpimorfismoComposta(Relacao relacao) {
        return relacaoFuncional(relacao) && relacaoSobrejetora(relacao);
    }
}
