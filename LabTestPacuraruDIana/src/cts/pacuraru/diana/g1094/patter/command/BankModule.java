package cts.pacuraru.diana.g1094.patter.command;



public abstract class BankModule {
    public abstract void processTransaction(String sourseAccount, String destinationAccount, double value,
            String destinationBank);
}