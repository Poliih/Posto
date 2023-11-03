public class Combustivel {
    private String tipo;
    private int estoque;
    private int limiteEstoque;

    public Combustivel(String tipo, int limiteEstoque) {
        this.tipo = tipo;
        this.limiteEstoque = limiteEstoque;
        this.estoque = 0; // Inicia com estoque zerado
    }

    public int reporEstoque(int quantidade) {
        if (quantidade < 0) {
            return 0;
        }

        if (estoque + quantidade > limiteEstoque) {
            int quantidadeReposta = limiteEstoque - estoque;
            estoque = limiteEstoque;
            return quantidadeReposta;
        } else {
            estoque += quantidade;
            return quantidade;
        }
    }

    public int abastecerVeiculo(int quantidade) {
        if (quantidade < 0) {
            return 0;
        }

        if (quantidade > estoque) {
            int abastecido = estoque;
            estoque = 0;
            return abastecido;
        } else {
            estoque -= quantidade;
            return quantidade;
        }
    }

    public int mostrarEstoque() {
        return estoque;
    }
}
