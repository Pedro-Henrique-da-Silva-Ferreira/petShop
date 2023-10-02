import java.util.ArrayList;
import java.util.List;

public class RelatorioLista {
    private List<Servico> servicos = new ArrayList<>();

    public void adicionaServico(Servico serv){
        servicos.add(serv);
    }
    public Double somaTudo(){
        Double tudo = 0.0;
        for (Servico soma: servicos) {
            tudo += soma.getPreco();
        }
        return tudo;
    }
    public String mostrar() {
        StringBuilder s = new StringBuilder();
        for (Servico a : servicos) {
            s.append(a.getDescricao());
        }
        return s.toString();
    }
}

