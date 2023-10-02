import java.time.LocalDate;

public class Hotelzinho extends ServicoBase {

    private char tamanho;
    private int horas;

    public Hotelzinho() {
    }

    public Hotelzinho(char tamanho, int horas) {
        this.tamanho = tamanho;
        this.horas = horas;
    }

    @Override
    public LocalDate getData() {
        return null;
    }

    @Override
    public Integer codigo() {
        return null;
    }

    @Override
    public String getDescricao() {
        return null;
    }

    @Override
    public Double getPreco() {
        double preco = 0.0;

        if (tamanho == 'P'){
            preco = 12.00 * horas;
        } else if (tamanho == 'M') {
            preco = 18.00 * horas;
        } else if (tamanho == 'G') {
            preco = 25.00 * horas;
        }
        return preco;
    }

    @Override
    public String toString() {
        return "Hotelzinho{" +
                "tamanho=" + tamanho +
                ", horas=" + horas +
                '}';
    }
}
