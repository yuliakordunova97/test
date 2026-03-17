public abstract class Person {
    public String name;
    public String surname;
    public String makes;
    public String workExperiense;


    public Person(String name, String surname, String makes, String workExperiense) {
        this.name = name;
        this.surname = surname;
        this.makes = makes;
        this.workExperiense = workExperiense;
    }

    public abstract double salaryCalculation();

    public String getAbout(){
        return name + " " + surname;
    }
    public String whatDoing(){
        return makes;
    }

    @Override
    public String toString(){
        return getAbout() + " "  + makes + " " + workExperiense;
    }

}
