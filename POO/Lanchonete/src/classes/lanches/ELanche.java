package classes.lanches;

public enum ELanche {
    X_SALADA (1, "X-Salada"),
    X_BURGUER (2,"X-Burguer"),
    MISTO_QUENTE (3, "Misto Quente"),
    HOT_DOG (4,"Hot Dog"),
    MINI_PIZZA (5, "Mini Pizza"),
    PIZZA (6, "PIZZA");

    private int valorOpcao;
    private String lanche;

    ELanche(int opcao, String lanche) {
        valorOpcao = opcao;
        this.lanche = lanche;
    }

    public static ELanche getByValorOpcao(int escolha) {
        for (ELanche e : ELanche.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        return null;
    }

    public int getValorOpcao() {
        return valorOpcao;
    }

    public void setValorOpcao(int valorOpcao) {
        this.valorOpcao = valorOpcao;
    }

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }
}
