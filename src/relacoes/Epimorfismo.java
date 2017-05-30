package relacoes;

import static relacoes.Funcional.relacaoFuncional;
import static relacoes.Sobrejetora.relacaoSobrejetora;

public class Epimorfismo {

    public static void relacaoEpimorfismo(Relacao relacao) {
        
        if(relacaoFuncional(relacao) && relacaoSobrejetora(relacao)){
            return é isso mesmo;
        }else{
            return não é isso não;
        }
    }

    public static void relacaoEpimorfismoComposta(Relacao relacao) {

    }
}
