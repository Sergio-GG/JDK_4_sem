public class Employee {
    private int personalId;
    private long phoneNumber;
    private String name;
    private int experience;

    public Employee(int personalId, long phoneNumber, String name, int experience){
        this.personalId = personalId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }


    public int getExperience() {
        return experience;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getPersonalId() {
        return personalId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personalId=" + personalId +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }


}
