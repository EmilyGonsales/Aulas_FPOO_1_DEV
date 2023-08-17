package enumeracao;

public enum StatusEnum {
    EM_PREPARACAO("Em preparação"),
    EM_TRANSPORTE("Em transporter"),
    ENTREGUE("Entregue ao ciente");

    private String status;

    private StatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

}
