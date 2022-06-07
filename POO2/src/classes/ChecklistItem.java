package classes;

import java.util.UUID;

public class ChecklistItem {

    //Variáveis
    private String uuidCheck;
    private String nomeCheck;
    private String descricaoCheck;
    private boolean completaCheck;



    public ChecklistItem() {
        this.setUuidCheck(UUID.randomUUID().toString());
    }

    public void completarCheck() {
        setCompletaCheck(true);
    }


    //Getters & Setters

    public String getUuidCheck() {
        return uuidCheck;
    }

    public void setUuidCheck(String uuidCheck) {
        this.uuidCheck = uuidCheck;
    }

    public String getNomeCheck() {
        return nomeCheck;
    }

    public void setNomeCheck(String nomeCheck) {
        this.nomeCheck = nomeCheck;
    }

    public String getDescricaoCheck() {
        return descricaoCheck;
    }

    public void setDescricaoCheck(String descricaoCheck) {
        this.descricaoCheck = descricaoCheck;
    }

    public boolean isCompletaCheck() {
        return completaCheck;
    }

    public void setCompletaCheck(boolean completaCheck) {
        this.completaCheck = completaCheck;
    }

}
