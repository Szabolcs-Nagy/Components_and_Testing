package Test;

import BeenzManagement.Bonus;
import InformationManagement.Information;
import MicropaymentManagementSystem.MicroPayment;
import StaffManagement.Employee;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBonus {
    
    public TestBonus() {
    }
    @Test
    public void receive() {
        //Initializing an information
        Information openedFile = new Information();
        //Initializing another information
        Information contributed = new Information();
        //initializing an employee
        Employee JD0303 = new Employee(0303, "Joe Doe");
        //initializing a bonus for an employee
        Bonus bonusOfJD0303 = new Bonus(JD0303);
        //Collect the bonus for the opened file
        bonusOfJD0303.addInformation(openedFile);
        //Collect the bonus for the contribution
        bonusOfJD0303.addInformation(contributed);
        //Initializing a micropayment
        MicroPayment micropaymentVacation = 
                new MicroPayment(JD0303, "Vacation to South America", bonusOfJD0303);
        //The employee receives the micropayment
        JD0303.receiveMicropayment(micropaymentVacation);
        //Collect the bonus for another the opened file
        bonusOfJD0303.addInformation(openedFile);
        //Collect the bonus for another the contribution
        bonusOfJD0303.addInformation(contributed);
        //Initializing another micropayment
        MicroPayment micropaymentCD = 
                new MicroPayment(JD0303, "CD", bonusOfJD0303);
         //The employee receives the second micropayment
        JD0303.receiveMicropayment(micropaymentCD);
        
        //Checking if the number of the micropayments the employee has received two 
        assertEquals(JD0303.getMicroPaymentNumber(), 2 );

    }
}
