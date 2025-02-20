public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectItem("Soda");
        vendingMachine.insertCoin(10);
        vendingMachine.dispenseItem();

        vendingMachine.setOutOfOrder();
        vendingMachine.selectItem("Chips");
    }
}
