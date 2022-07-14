package WhoCanDrive;

public class Person {

    private String name;
    private int age;
    private boolean driverLicence;
    private int dayWithoutPenalty;

    public Person(String name, int age, boolean driverLicence, int dayWithoutPenalty) {
        this.name = name;
        this.age = age;
        this.driverLicence = driverLicence;
        this.dayWithoutPenalty = dayWithoutPenalty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(boolean driverLicence) {
        this.driverLicence = driverLicence;
    }

    public int getDayWithoutPenalty() {
        return dayWithoutPenalty;
    }

    public void setDayWithoutPenalty(int dayWithoutPenalty) {
        this.dayWithoutPenalty = dayWithoutPenalty;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", driverLicence=" + driverLicence +
                ", dayWithoutPenalty=" + dayWithoutPenalty +
                '}';
    }
}
