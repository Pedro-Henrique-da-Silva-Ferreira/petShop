import java.time.LocalDate;

public interface Servico {

    public LocalDate getData();

    public Integer codigo();

    public String getDescricao();

    public  Double getPreco();
}
