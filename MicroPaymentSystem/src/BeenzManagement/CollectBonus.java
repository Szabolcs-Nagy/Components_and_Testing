package BeenzManagement;

public class CollectBonus implements Request {
    
    private Bonus bonus;
    
    public CollectBonus(Bonus bonus){
        this.bonus=bonus;
    }
    
    @Override
    public void execute(){
        bonus.collect();
    }
    
    @Override
    public void undo(){
      bonus.redeem();
    }  
}