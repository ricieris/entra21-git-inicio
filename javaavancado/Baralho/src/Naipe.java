public enum Naipe {
    PAUS("♣"),
    OURO("♦"),
    ESPADA("♠"),
    COPAS("♥");

    private final String naipe;


    // Getters & Setters
    Naipe(String naipe) {
        this.naipe = naipe;
    }

    public String getNaipe() {
        return this.naipe;
    }
}
