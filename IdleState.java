public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Item selected: " + item);
        vendingMachine.setCurrentState(vendingMachine.getItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is now out of order.");
        vendingMachine.setCurrentState(vendingMachine.getOutOfOrderState());
    }
}