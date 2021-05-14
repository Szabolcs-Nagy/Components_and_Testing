package InformationManagement;

import java.util.Date;

public class Contribution extends Information{
	
	//attributes
	Date date;
        String content;
        
        public Contribution (String content, Date date){
            this.date = date;
            this.content = content;
            
        }
	 
}
