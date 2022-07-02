package classes;

public enum EMenuItem {

    VOLTAR(0, "Voltar"),
    AVALIAR_ITEM(1, "Avaliar item"),
    VER_AVALIACOES(2, "Ver avaliações");


    private final int valorOpcao;
    private final String descricao;

    EMenuItem(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }

    public static EMenu getByValorOpcao(int escolha) {
        for (EMenu e : EMenu.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        return null;
    }


    // Getters & Setters

    public int getValorOpcao() {
        return this.valorOpcao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
