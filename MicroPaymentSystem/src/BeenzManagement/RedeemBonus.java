package BeenzManagement;

public class RedeemBonus implements Request{
    private Bonus bonus;
    
    public RedeemBonus(){
        
    }
    public RedeemBonus(Bonus bonus){
        this.bonus=bonus;
    }
    
    @Override
    public void execute(){
        bonus.redeem();
    }
    
    @Override
    public void undo()
    {
        bonus.collect();
    }
}