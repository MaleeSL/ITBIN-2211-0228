package loginandsignup;

public class Nilai {
    private double id;
    private double name;
    private double salary;
    private double ot;
    private double bonus;
    private double total;

    public Nilai() {
    }

    public Nilai(double id, double name, double salary, double ot) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ot = ot;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary() {
        return salary;
    }

    public double getName() {
        return name;
    }

    public double getId() {
        return id;
    }

    public double getTotal() {
        // Assuming total is calculated based on some formula including bonus and OT
        return id + name + salary + (ot * 100) + bonus;
    }

    public double getOt() {
        return ot;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(double name) {
        this.name = name;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setOt(double ot) {
        this.ot = ot;
    }
}
