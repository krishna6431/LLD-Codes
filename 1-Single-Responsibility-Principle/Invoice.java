// This is a poor design because it is handling cause this class is doing many things
// If we decide to change the logic for either of the functionality we have to change the class.

class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }


    public int calculateTotal(){
        return marker.price * quantity;
    }

    public void printInvoice(){
        System.out.println("Invoice for " + marker.name + " - " + marker.color + " marker");
    }

    public void saveToDB(){
        // Database operations to save invoice
    }
}