//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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