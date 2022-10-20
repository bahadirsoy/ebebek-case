public class Employee {

    private String name;
    private float salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, float salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public static void main(String[] args){
        Employee emp = new Employee("Kemal", 2000f, 45, 1985);

        System.out.println("Adı : " + emp.getName());
        System.out.println("Maaşı : " + emp.getSalary());
        System.out.println("Çalışma Saati : " + emp.getWorkHours());
        System.out.println("Vergi : " + emp.tax());
        System.out.println("Bonus : " + emp.bonus());
        System.out.println("Maaş Artışı : " + emp.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (emp.getSalary() + emp.bonus() - emp.tax()));
        System.out.println("Toplam Maaş : " + (emp.getSalary() + emp.raiseSalary() + emp.bonus()));
    }

    public float tax(){
        return getSalary() < 1000 ? 0 : getSalary() * 0.03f;
    }

    public int bonus(){
        return getWorkHours() > 40 ? (getWorkHours() - 40) * 30 : 0;
    }

    public float raiseSalary(){
        int year = 2021 - getHireYear();
        //float totalSalary = getSalary() + bonus() - tax();

        if(year < 10) return getSalary() * 0.05f;
        else if(year > 9 && year < 20) return getSalary() * 0.1f;
        else return getSalary() * 0.15f;
    }

    @Override
    public String toString() {
        return
            "name = " + name + "\n" +
            "salary = " + salary + "\n" +
            "workHours = " + workHours + "\n" +
            "hireYear = " + hireYear + "\n";
    }

    /* GETTER AND SETTERS */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    /* -- GETTER AND SETTERS -- */

}
