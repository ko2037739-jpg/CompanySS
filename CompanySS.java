
package companys;
import java.util.ArrayList;
import java.util.List;

public class CompanyS {

   
    public static void main(String[] args) {
        Employee  emp1 = new Employee ("ahmed");
        Manager_1 mgr1 = new Manager_1("sara",1500.50);
        System.out.println("Employee:"+ emp1.getName());
        System.out.println("Manager:"+mgr1.getName()+"with bonus:"+mgr1.getBonus());
        
        
        List<Object> companyRecords = new ArrayList<>();
         PayrollManager.addBonusPoints(companyRecords);
        
        System.out.println("\nRecords after adding bonus:companyRecords");
        List<Double> salaries = new ArrayList<>();
        salaries.add(2500.0);
        salaries.add(3200.75);
        
        double totalsalaries = PayrollManager.calculateTotal(salaries);
        System.out.println(" Total salaries:"+ totalsalaries);
        
        
    }
    
}
