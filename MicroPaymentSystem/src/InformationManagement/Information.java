package InformationManagement;

import BeenzManagement.Bonus;
import StaffManagement.Employee;

public class Information {
    
    public Employee for_use;
    
    public Bonus for_info;
    
    public OpenedDocument od;
    
    public Contribution c;
    
    public Information(){
        
    }
    
    public Information(OpenedDocument od){
        this.od = od;
    }
    
    public Information(Contribution c){
        this.c = c;
    }
    
}
