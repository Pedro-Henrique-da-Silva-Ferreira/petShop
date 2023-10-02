import java.time.LocalDate;

public abstract class ServicoBase implements Servico{
    private LocalDate data;
    private int codigo;
    private String descricao;

    public ServicoBase() {
    }

    public ServicoBase(LocalDate data, int codigo, String descricao) {
        this.data = data;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ServicoBase{" +
                "data=" + data +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
