/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibs;

/**
 *
 * @author acer
 */

//Implements
public class Console implements TransactionLogs{
    public void transactionsuccess(String transactionID)
    {
        System.out.println("Transaction Completed! ID: " + transactionID);
    }
    
    public void transactionfailed()
    {
        System.out.println("Transaction Failed!");
    }
    
}
