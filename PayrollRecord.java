//Author:Or Adar
package employee;

/**
 * a payroll record that has the
 * @param ID
 * @param salary
 * @param bonus
 * @param tax
 * params, also has a final salary which is his salary+bonus minus tax
 * a tostring to return his payroll and his final salary after tax.
 */
public record PayrollRecord(long ID,double salary,double bonus, double tax) {
    public double finalSalary(){
        double total=salary+bonus;
        total-=tax;
        return total;
    }
    @Override
    public String toString(){
        return "Payroll: "+ID+" Salary after tax: "+finalSalary();
    }
}
