package School;

public class Teacher extends Human{
    private String name;
    private String surname;
    private String subject;
    private int experience;

    public Teacher(String name, String surname, String subject, int experience) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.experience = experience;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    //endregion

    @Override
    public String toString() {
        return name + " " + surname +
                " " + subject + " " + experience;
    }
}
