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
public class BinarySearch {
    public ArrayList<AnimalModel> searchByPetName(String searchValue, List<AnimalModel> petList,
                int left, int right) {

            ArrayList<AnimalModel> matchingAccounts = new ArrayList<>();
            searchValue = searchValue.trim();
            if (right < left) {
                return matchingAccounts;
            }

            int mid = (left + right) / 2;

            if (searchValue.toLowerCase().equals(petList.get(mid).getName().toLowerCase())) {
                matchingAccounts.add(petList.get(mid));
                matchingAccounts.addAll(searchByPetName(searchValue, petList, left, mid - 1));
                matchingAccounts.addAll(searchByPetName(searchValue, petList, mid + 1, right));
            } else if (searchValue.compareToIgnoreCase(petList.get(mid).getName()) < 0) {
                return searchByPetName(searchValue, petList, left, mid - 1);
            } else {
                return searchByPetName(searchValue, petList, mid + 1, right);
            }
            return matchingAccounts;
        }
}
