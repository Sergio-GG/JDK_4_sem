import java.util.ArrayList;

public class Catalog {

    ArrayList<Employee> arrayList;

    public Catalog() {
        arrayList = new ArrayList<>();
    }

    // Метод добавления нового рабочего
    public void addNewEmployee(Employee employee){
        arrayList.add(employee);
    }

    public void arrayToString() {
        for (Employee e : arrayList) {
            System.out.println(e.toString());
        }
    }

    // Метод поиска рабочего по стажу
    public Employee findByExperience(int exp) {
        for (Employee e : arrayList) {
            if (e.getExperience() == exp) {
                return e;
            }
        }
        return null;
    }

    // Метод определения номера телефона по имени
    public long findPhonenumber(String name) {
        for (Employee e : arrayList) {
            if (e.getName().equals(name)) {
                return e.getPhoneNumber();
            }
        }
        return 0;
    }

    // Метод поиска рабочего по табельному номеру
    public Employee findById(int iD) {
        for (Employee e : arrayList) {
            if (e.getPersonalId() == iD) {
                return e;
            }
        }
        return null;
    }
}

