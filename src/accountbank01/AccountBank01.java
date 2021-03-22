package accountbank01;

/**
 *
 * @author Piassa
 */
public class AccountBank01 {

    public static void main(String[] args) {
        AccountBankn account1 = new AccountBankn();
        
        account1.setNumAccount(666);
        account1.setOwnerAccount("Skillerx");
        account1.openAccount("CC");
        account1.deposit(500);
        account1.showAccount();
   
    }
    
}
