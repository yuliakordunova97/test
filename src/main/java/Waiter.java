public class Waiter extends Person implements Aboutwork,Experience {
    public int zaday;
    public int numberdays;

    public Waiter(String name, String surname, String makes, String workExperiense, int zaday, int numberdays) {
        super(name, surname, makes, workExperiense);
        this.zaday = zaday;
        this.numberdays = numberdays;
    }

    @Override
    public double salaryCalculation() {
        return zaday * numberdays;
    }

    @Override
    public void performanceOfwork() {
        System.out.println(name + " " + whatDoing());
    }

    @Override
    public void aboutExperience() {
        System.out.println(getAbout() + " has"+ " " + workExperiense + " " + " work experience");
    }
}
