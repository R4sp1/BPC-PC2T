package students;

public enum StudentType {
    TECH("Student technickeho oboru", "Studenti umi urcit jestli je jejich rok narozeni prestupny"),
    HUMA("Student humanitarniho oboru", "Studenti umi urcit jejich znamei zverokruhu"),
    COMBI("Student kombinovanoho oboru", "Studenti umi urcit jestli je jejich rok narozeni prestupny a jejich znameni zverokruhu");

    private final String internalName;
    private final String description;

    StudentType(String internalName, String description) {
        this.internalName = internalName;
        this.description = description;
    }

    public String getInternalName() {
        return internalName;
    }

    public String getDescription() {
        return description;
    }

}
