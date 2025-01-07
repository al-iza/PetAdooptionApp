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
public class InsertionSort {

    List<AnimalModel> animalSortList;

    public InsertionSort() {
        animalSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of AnimalModel objects by their Age in ascending or
     * descending order.
     *
     * @param animalList the list of AnimalModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<AnimalModel> sortByAge(List<AnimalModel> animalList, boolean isDesc) {
        this.animalSortList.clear();
        this.animalSortList.addAll(animalList);
        if (animalSortList == null || animalSortList.isEmpty()) {
            throw new IllegalArgumentException("Animal list cannot be null or empty.");
        }

        for (int i = 1; i < animalSortList.size(); i++) {
            AnimalModel currentAnimal = animalSortList.get(i);
            int j = i - 1;

            // Shift elements of the sorted segment to the right to find the correct position
            while (j >= 0 && shouldSwap(animalSortList.get(j).getAge(), currentAnimal.getAge(), isDesc)) {
                animalSortList.set(j + 1, animalSortList.get(j));
                j--;
            }

            // Place the current element in its correct position
            animalSortList.set(j + 1, currentAnimal);
        }

        return animalSortList;
    }

    /**
     * Determines if two age values should be swapped based on the sort order.
     *
     * @param current the age of the current element
     * @param comparison the age of the comparison element
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the values should be swapped, false otherwise
     */
    private boolean shouldSwap(int current, int comparison, boolean isDesc) {
        return isDesc ? current < comparison : current > comparison;
    }
}

