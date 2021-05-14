package BeenzManagement;

import InformationManagement.Information;
import MicropaymentManagementSystem.MicroPayment;
import StaffManagement.Employee;
import java.util.ArrayList;
import java.util.List;

public class Bonus {
        
        //one to many link
        List<Information> for_use;
        //information instance;
        Information information;
        //many to one
        Employee collected_by;
        //one to many link
        List<MicroPayment> micropayments;
        //one to many link
        List<Integer> bonuses;
        //attribute
        int point;
        
        public Bonus(){
            bonuses = new ArrayList<Integer>();
        }
        public Bonus( Employee collected_by){
            this.collected_by = collected_by;
            for_use = new ArrayList();
        }
        public void collect()
        {
            bonuses.add(point);
        }
        public void redeem()
        {
            bonuses.clear();
        }
        public void addInformation(Information information){
            for_use.add(information);
        }
        public void clearInformation(){
            for_use.clear();
        }
        public int getInformationNumber(){
            return for_use.size();
        }
       }
