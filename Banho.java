import java.time.LocalDate;

public class Banho extends ServicoBase {
    private char pelo;
    private char tamanho;

    public Banho() {
    }

    public Banho(char pelo, char tamanho) {
        this.pelo = pelo;
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
    public void acrescimo(){

        if (pelo == 'c'){
            double c = 0.0;
        } else if (pelo == 'm') {
            double m = 10.0;
        } else if (pelo == 'l') {
            double g = 20.0;
        }

    }

    @Override
    public Double getPreco() {
        double preco = 0.0;
        if (tamanho == 'P') {
            preco = 20;
        } else if (tamanho == 'M') {
            preco = 30;
        } else if (tamanho == 'G') {
            preco = 40;
        }
        return preco;
    }

    @Override
    public String toString() {
        return "Banho{" +
                "pelo=" + pelo +
                ", tamanho=" + tamanho +
                '}';
    }
}
