package School;

public abstract class Human {
    private String name;
    private String surname;
    private boolean isInSchool;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected Human() {
    }

    //region getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setInSchool(boolean inSchool) {
        isInSchool = inSchool;
    }
    //endregion

    public void goInSchool() {
        isInSchool = true;
    }

    public void outFromSchool() {
        isInSchool = false;
    }

    public boolean isInSchool() {
        return isInSchool;
    }

    public abstract String toString();
}
