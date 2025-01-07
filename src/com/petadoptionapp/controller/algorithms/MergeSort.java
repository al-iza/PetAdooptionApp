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
public class MergeSort {

    public List<AnimalModel> sortByAdoptionFees(List<AnimalModel> petList, boolean isDesc) {
        if (petList == null || petList.isEmpty()) {
            throw new IllegalArgumentException("Pet list cannot be null or empty.");
        }

        return mergeSort(petList, isDesc);
    }

    private List<AnimalModel> mergeSort(List<AnimalModel> petList, boolean isDesc) {
        if (petList.size() <= 1) {
            return petList;
        }

        int mid = petList.size() / 2;
        List<AnimalModel> left = new ArrayList<>(petList.subList(0, mid));
        List<AnimalModel> right = new ArrayList<>(petList.subList(mid, petList.size()));

        // Recursively split and merge
        left = mergeSort(left, isDesc);
        right = mergeSort(right, isDesc);

        return merge(left, right, isDesc);
    }

    private List<AnimalModel> merge(List<AnimalModel> left, List<AnimalModel> right, boolean isDesc) {
        List<AnimalModel> merged = new ArrayList<>();
        int i = 0, j = 0;

        // Merge based on the adoption fees
        while (i < left.size() && j < right.size()) {
            if (shouldPlaceLeft(left.get(i).getAdoptionFees(), right.get(j).getAdoptionFees(), isDesc)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }

    private boolean shouldPlaceLeft(Double leftFee, Double rightFee, boolean isDesc) {
        int comparison = leftFee.compareTo(rightFee);
        return isDesc ? comparison > 0 : comparison < 0;
    }
}
