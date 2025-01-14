// 1. COMPONENT INTERFACE
// This interface defines the "core behavior" or contract.
// Anything that implements Coffee must provide a description and cost.
public interface Coffee {
    String getDescription();

    double getCost();
}