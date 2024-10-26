/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibs;

import java.util.ArrayList;
/**
 *
 * @author DESKTOP
 */
public class Lot 
{
    private int block;
    private int lotNumber;
    private double size;
    private double price;
    private String status;
    private String location;
    
    public Lot()
    {}

    public Lot(int block, int lotNumber, double size, double price,String status, String location) 
    {
        this.block = block;
        this.lotNumber = lotNumber;
        this.size = size;
        this.price = price;
        this.status = status;
        this.location = location;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Lot{" + "block=" + block + ", lotNumber=" + lotNumber + ", size=" + size + ", price=" + price + ", status=" + status + ", location=" + location + '}';
    }
    
    
    
    
    
    
}
