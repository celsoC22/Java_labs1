package lab1.transaction_types;

import lab1.Transaction;

public class AddGameCredits extends Transaction {

    protected String company_name;

    public AddGameCredits(int store_id, int transaction_id, int account_id, double amount, String company_name) {
        super(store_id, transaction_id, account_id, amount);
        this.company_name = company_name;
    }


    public String getCompany_name() {
        return company_name;
    }
    @Override
    public String toString() {

        String output =
                "\n[ADD GAME CREDIT] " +
                        "\nTransaction ID: " + this.transaction_id +
                        "\nAccount ID: " + this.account_id +
                        "\nStore ID: " + this.store_id +
                        "\nCompany Name: " + this.company_name +
                        "\nAmount: " + this.amount +
                        "\nTimestamp: " + this.timestamp;

        return output;
    }


}
