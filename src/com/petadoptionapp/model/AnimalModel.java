/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petadoptionapp.model;

/**
 *
 * @author DELL
 */
public class AnimalModel {

    private int petID;
    private String name;
    private String category;
    private String breed;
    private int age;
    private String gender;
    private String colour;
    private String size;
    private double adoptionFees;
    private String description;

    public AnimalModel(int petID, String name, String category, String breed, int age, String gender, String colour, String size, double adoptionFees, String description) {
        this.petID = petID;
        this.name = name;
        this.category = category;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.colour = colour;
        this.size = size;
        this.adoptionFees = adoptionFees;
        this.description = description;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getAdoptionFees() {
        return adoptionFees;
    }

    public void setAdoptionFees(double adoptionFees) {
        this.adoptionFees = adoptionFees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
