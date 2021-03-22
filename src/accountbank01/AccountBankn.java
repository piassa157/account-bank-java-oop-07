package accountbank01;

/**
 *
 * @author Piassa
 */
public class AccountBankn {
    public int numAccount;
    protected String type;
    private String ownerAccount;
    private float balance;
    private boolean accountState;
    
    public AccountBankn() {
        this.balance = 0;
        this.accountState = false;
    }
    
    public void showAccount(){
        System.out.println("Account: " + this.getNumAccount());
        System.out.println("Owner: " + this.getOwnerAccount());
        System.out.println("Type: " + this.getType());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Status: " + this.isAccountState());
    }
    
    public void openAccount(String typeAccount){
        this.setType(typeAccount);
        this.setAccountState(true);
        
        if ("CC".equals(typeAccount)) {
            this.setBalance(50);
        } else if ("CP".equals(typeAccount)) {
            this.setBalance(150);
        }
        
        System.out.println("Account opening has bee success!");
    }
    
    public void closeAccount(){
        if(this.getBalance() > 0){
            System.out.println("Account has bee not closed!");
        } else if (this.getBalance() < 0) {
            System.out.println("Account has bee not closed!");
        } else {
            this.setAccountState(false);
            System.out.println("Account has bee closed!");
        }
    }
    
    public void deposit(float newValue){
        if(this.isAccountState()){
            this.setBalance(this.getBalance() + newValue);
            System.out.println("Deposit success!");
        }else {
            System.out.println("Account not actived!");
        }
    }

    public void withdraw(float value){
        if(this.isAccountState()){
            if(this.getBalance() >= value){
                this.setBalance(this.getBalance() - value);
                System.out.println("Success withdraw");
            }else {
                System.out.println("Balance not enough");
            }
        }else {
            System.out.println("Account not actived!");
        }
    }
    
    public void paymentPlan(){
        int payment = 0;
        
        if ("CC".equals(this.getType())) {
            payment = 12;
        } else if ("CP".equals(this.getType())) {
            payment = 20;
        }
        
        if(this.isAccountState()){
            this.setBalance(this.getBalance() - payment);
            System.out.println("Payment has bee success!");
        }else {
            System.out.println("Account not actived!");
        }
    }

    public int getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean isAccountState() {
        return accountState;
    }

    public void setAccountState(boolean accountState) {
        this.accountState = accountState;
    }
    
    
    
}
