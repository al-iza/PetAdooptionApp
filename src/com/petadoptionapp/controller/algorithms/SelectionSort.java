/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petadoptionapp.controller.algorithms;

import com.petadoptionapp.model.AnimalModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class SelectionSort {
    List<AnimalModel> AnimalSortList;

    
    public SelectionSort() {
        AnimalSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of AnimalModel objects by their Pet ID in ascending or descending order.
     *
     * @param animalList the list of AnimalModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    public List<AnimalModel> sortByPetId(List<AnimalModel> animalList, boolean isDesc) {
        this.AnimalSortList.clear();
        this.AnimalSortList.addAll(animalList);
        if (AnimalSortList == null || AnimalSortList.isEmpty()) {
            throw new IllegalArgumentException("Animal list cannot be null or empty.");
        }

        for (int i = 0; i < AnimalSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndexByPetId(AnimalSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(AnimalSortList, i, extremumIndex);
            }
        }

        return AnimalSortList;
    }

    private int findExtremumIndexByPetId(List<AnimalModel> animalSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < animalSortList.size(); j++) {
            if (shouldSwap(animalSortList.get(j).getPetID(), animalSortList.get(extremumIndex).getPetID(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    public List<AnimalModel> sortByName(List<AnimalModel> animalList, boolean isDesc) {
        this.AnimalSortList.clear();
        this.AnimalSortList.addAll(animalList);
        if (AnimalSortList == null || AnimalSortList.isEmpty()) {
            throw new IllegalArgumentException("Animal list cannot be null or empty.");
        }

        for (int i = 0; i < AnimalSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndexByName(AnimalSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(AnimalSortList, i, extremumIndex);
            }
        }

        return AnimalSortList;
    }

    private int findExtremumIndexByName(List<AnimalModel> animalSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < animalSortList.size(); j++) {
            if (shouldSwap(animalSortList.get(j).getName(), animalSortList.get(extremumIndex).getName(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    private boolean shouldSwap(String current, String extremum, boolean isDesc) {
        return isDesc ? current.compareTo(extremum) > 0 : current.compareTo(extremum) < 0;
    }

    private void swap(List<AnimalModel> AnimalSortList, int i, int j) {
        AnimalModel temp = AnimalSortList.get(i);
        AnimalSortList.set(i, AnimalSortList.get(j));
        AnimalSortList.set(j, temp);
    }
}