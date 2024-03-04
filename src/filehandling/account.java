package filehandling;
public class account {
    int acc_no;
    int pwd;
    double balance;
    public account(int acc_no,int pwd,double balance) {
    	super();
    	this.acc_no=acc_no;
    	this.pwd=pwd;
    	this.balance=balance;
    }
    public double withDrawal(int pwd,double amount)
    {
    	if(pwd==this.pwd)
    	{
    		if(amount<=balance) {
    			balance-=amount;
    			return amount;
    		}
    		else
    			return -1;
    	}
    	else
    		return 0;
    }
    public boolean deposit(int pwd,double amount)
    {
    	if(pwd==this.pwd)
    	{
    		balance+=amount;
    		return true;
    	}
    		else
    			return false;
    }
}