class Bank {

    void deposit(int cash) {
        System.out.println("Cash deposited: " + cash);
    }

    void deposit(int cheque, String bankName) {
        System.out.println("Cheque deposited: " + cheque + " Bank: " + bankName);
    }

    void deposit(double online) {
        System.out.println("Online transfer: " + online);
    }
}

class Main {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.deposit(1000);
        b.deposit(2000, "SBI");
        b.deposit(1500.50);
    }
}