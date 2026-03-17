public class Cook extends Person implements Aboutwork,Experience{
    public int zahour;
    public int numberhours;

    public Cook(String name, String surname, String makes, String workExperiense, int zahour, int numberhours) {
        super(name, surname, makes, workExperiense);
        this.zahour = zahour;
        this.numberhours = numberhours;
    }

    @Override
    public double salaryCalculation(){
        return zahour * numberhours;
    }
    @Override
    public void performanceOfwork(){
        System.out.println( name + " " +whatDoing());
    }
    @Override
    public void aboutExperience(){
        System.out.println( getAbout()+ " has"+ " " + workExperiense + " " + " work experience");
    }

}