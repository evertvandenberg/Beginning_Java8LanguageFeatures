package ch1.annotations;

/**
 * Created by vdBerg on 11/12/17.
 */
public class Manager extends Employee {
    @Override
    public void setSalary(double salary) {
        System.out.println("Manager.setSalary():" + salary);
    }


}
