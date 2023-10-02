import java.time.LocalDate;

public class Tosa extends ServicoBase{
    private char tamanho;

    public Tosa() {
    }

    public Tosa(char tamanho) {
        this.tamanho = tamanho;
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
            preco = 22.00;
        } else if (tamanho == 'M') {
            preco = 30.00;
        } else if (tamanho == 'G') {
            preco = 40.00;
        }
        return preco;
    }

    @Override
    public String toString() {
        return "Tosa{" +
                "tamanho=" + tamanho +
                '}';
    }
}
