public class Flight {
    private static final int TOTAL_SEATING_CAPACITY = 150;
    private int totalCheckedBags;
    private int totalPassengers;
    public void addOnePassenger(int bags, int carryOns){
        int totalBags = bags;
        if (carryOns > 2) {
            totalBags = bags + carryOns -2;
        }
        addOnePassenger(totalBags);
    }
    public void addOnePassenger(int bags){
        if (isSeatAvailable()) {
            addOnePassenger();
            totalCheckedBags += bags;
        }
    }
    private boolean isSeatAvailable(){
        System.out.println(totalCheckedBags);
        return totalCheckedBags < TOTAL_SEATING_CAPACITY;
    }
    public void addOnePassenger(){
        if (isSeatAvailable()){
            totalPassengers +=1;
        }
    }

    public int getTotalCheckedBags(){
        return totalCheckedBags;
    }
    public int getTotalPassengers(){
        return totalPassengers;
    }
}
