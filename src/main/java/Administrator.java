public class Administrator extends Person implements Aboutwork,Experience {
    public int zaweek;
    public int numberweek;

    public Administrator(String name, String surname, String makes, String workExperiense, int zaweek, int numberweek) {
        super(name, surname, makes, workExperiense);
        this.zaweek = zaweek;
        this.numberweek = numberweek;
    }

    @Override
    public double salaryCalculation() {
        return zaweek * numberweek;
    }

    @Override
    public void performanceOfwork() {
        System.out.println(name + " " + whatDoing());
    }

    @Override
    public void aboutExperience() {
        System.out.println(getAbout() + " has" + " "+ workExperiense + " " + " work experience");
    }
}