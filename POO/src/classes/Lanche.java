package classes;

public abstract class Lanche {
    public String[] ingredientes = new String[10];
    public double valor;

    public String tipo;

    public void adicionarIngrediente (String ingrediente) {
        for (int i = 0; i < 10; i++) {
            if (this.ingredientes[i] == null) {
                this.ingredientes[i] = ingrediente;
                break;
            }
        }
    }
    public void montarComanda () {
        System.out.println();
        System.out.println("====="+this.tipo+"=====");
        System.out.printf("VALOR: R$%.2f\n", this.valor);
        System.out.println();
        System.out.println("=INGREDIENTES=");
        for (String ingrediente: this.ingredientes) {
            if (ingrediente != null) {
                System.out.println(ingrediente);
            }
        }
        System.out.println("=======================");
    }
}
