package com.example.Printers.Printer;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Printer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String model;
    private boolean singleFunction;
    private int trays;

    public Printer() {}

    public Printer(String brand, String model, boolean singleFunction, int trays) {
        this.brand = brand;
        this.model = model;
        this.singleFunction = singleFunction;
        this.trays = trays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isSingleFunction() {
        return singleFunction;
    }

    public void setSingleFunction(boolean singleFunction) {
        this.singleFunction = singleFunction;
    }

    public int getTrays() {
        return trays;
    }

    public void setTrays(int trays) {
        this.trays = trays;
    }

    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Trays: " + trays + ", Single Function: " + singleFunction;
    }

}
