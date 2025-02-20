public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Item already selected. Please insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Coin inserted: " + amount);
        vendingMachine.setBalance(vendingMachine.getBalance() + amount);
        vendingMachine.setCurrentState(vendingMachine.getDispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Please insert coins first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is now out of order.");
        vendingMachine.setCurrentState(vendingMachine.getOutOfOrderState());
    }
}