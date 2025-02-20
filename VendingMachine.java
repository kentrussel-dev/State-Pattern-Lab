public class VendingMachine {
    private VendingMachineState currentState;
    private VendingMachineState idleState;
    private VendingMachineState itemSelectedState;
    private VendingMachineState dispensingState;
    private VendingMachineState outOfOrderState;

    private int balance;
    private String selectedItem;
    private int itemPrice;

    public VendingMachine() {
        idleState = new IdleState();
        itemSelectedState = new ItemSelectedState();
        dispensingState = new DispensingState();
        outOfOrderState = new OutOfOrderState();

        currentState = idleState;
        balance = 0;
        itemPrice = 10; // Example price
    }

    public void selectItem(String item) {
        currentState.selectItem(this, item);
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }

    public void setCurrentState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getIdleState() {
        return idleState;
    }

    public VendingMachineState getItemSelectedState() {
        return itemSelectedState;
    }

    public VendingMachineState getDispensingState() {
        return dispensingState;
    }

    public VendingMachineState getOutOfOrderState() {
        return outOfOrderState;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}