//By Doing this lets say one FileInvoiceDao is in production and we want to introduce one more
//  DatabaseInvoiceDao so we will not modify the already running and tested file in the production 
// we will create new class which will implement InvoiceDao
//  By doing this we are giving flexibility to extend the funcitonality without modifying existing classes.
public interface InvoiceDao{
    public void sava(Invoice invoice);
}