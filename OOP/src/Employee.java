package OOP.src;

public class Employee {
    public int salary;
    public int overtime;
    public int payPerHour;

    // public Employee(int salary, int overtime, int payPerHour) {
    //     setsalary(salary);
    //     setOvertime(overtime);
    //     setPayPerHour(payPerHour);
    // }

    public void setsalary(final int salary) {
        if (salary <= 0 ) {
            throw new IllegalArgumentException("salary cannot be bellow 0");
        }

        this.salary = salary;
    };

    public int getSalary () {
        return this.salary;
    }

    public void setOvertime(final int overtime) {
        if (overtime <= 0 ) {
            throw new IllegalArgumentException("overtime cannot be bellow 0");
        }

        this.overtime = overtime;
    };

    public int getOvertime () {
        return this.salary;
    }

    public void setPayPerHour(final int payPerHour) {
        if (payPerHour <= 0 ) {
            throw new IllegalArgumentException("pay Per Hour cannot be bellow 0");
        }

        this.payPerHour = payPerHour;
    };

    public int getPayPerHour () {
        return this.salary;
    }

    
    public int calculateWage() {
        return this.salary + (this.payPerHour * this.overtime);
    }

}
