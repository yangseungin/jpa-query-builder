package persistence.domain;

public enum GenerationType {
    TABLE(""),
    SEQUENCE(""),
    IDENTITY(" generated by default as identity"),
    AUTO("");

    public String generateDDL;

    GenerationType(String generateDDL) {
        this.generateDDL = generateDDL;
    }

}
