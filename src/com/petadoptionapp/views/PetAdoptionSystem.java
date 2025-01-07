/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.petadoptionapp.views;

import com.petadoptionapp.controller.algorithms.BinarySearch;
import com.petadoptionapp.controller.algorithms.InsertionSort;
import com.petadoptionapp.controller.algorithms.MergeSort;
import com.petadoptionapp.model.AnimalModel;
import com.petadoptionapp.controller.algorithms.SelectionSort;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PetAdoptionSystem extends javax.swing.JFrame {

    private java.awt.CardLayout cardLayout;
    private DefaultTableModel tableModel1;
    private DefaultTableModel tableModel2;
    private ArrayList<AnimalModel> petList = new ArrayList<>();
    private SelectionSort selectionSort;
    private MergeSort mergeSort;
    private InsertionSort insertionSort;

    public PetAdoptionSystem() {
        initComponents();
        initializeLayout();
        addDataToTable(petList);
        initializePets();
        selectionSort = new SelectionSort();
        mergeSort = new MergeSort();
        insertionSort = new InsertionSort();
    }

    private void initializePets() {
        AnimalModel Pet1 = new AnimalModel(001, "Kiara", "Cat", "Persian", 1, "Female", "White", "Small", 55000, "This dignified, docile creature is generally quiet, sweet and good natured.");
        AnimalModel Pet3 = new AnimalModel(002, "Poppie", "Fish", "Goldfish", 1, "Male", "Golden yellow", "Medium", 3000, "Beautiful fot your Aquarium.");
        AnimalModel Pet4 = new AnimalModel(005, "Kiwi", "Bird", "Parrot", 2, "Female", "Pink", "Medium", 28000, "Good singing skill with soothing voice.");
        AnimalModel Pet5 = new AnimalModel(006, "Larry", "Dog", "Husky", 3, "Male", "White", "Large", 78000, "Guard dog,Fast,Strong,Obedient and independent.");
        // AnimalModel Pet6 = new AnimalModel(009, "Rocky", "Dog", "German Shepherd", 5, "Male", "Brown", "Large", 68000, "Guard dog,Fast,Strong,Obedient and independent.");
        AnimalModel Pet6 = new AnimalModel(017, "Kiara", "Cat", "Persian", 1, "Female", "White", "Small", 55000, "This dignified, docile creature is generally quiet, sweet, and good-natured.");
        AnimalModel Pet2 = new AnimalModel(004, "Bruno", "Dog", "Labrador Retriever", 2, "Male", "Golden", "Large", 40000, "Friendly, outgoing, and high-spirited companions.");
        AnimalModel Pet7 = new AnimalModel(007, "Sky", "Bird", "Parrot", 3, "Female", "Green", "Small", 15000, "Highly intelligent and loves to mimic sounds.");
        // AnimalModel Pet9 = new AnimalModel(008, "Finn", "Fish", "Betta", 1, "Male", "Blue", "Small", 2000, "Vibrant", colorful fish that is easy to care for.");
        AnimalModel Pet8 = new AnimalModel(003, "Luna", "Cat", "Siamese", 2, "Female", "Cream and Brown", "Medium", 35000, "Talkative, affectionate, and sociable.");
        AnimalModel Pet9 = new AnimalModel(010, "Max", "Dog", "Beagle", 3, "Male", "Tricolor", "Medium", 30000, "Curious, friendly, and full of energy.");
        AnimalModel Pet10 = new AnimalModel(015, "Tweety", "Bird", "Canary", 1, "Female", "Yellow", "Small", 8000, "Known for its cheerful singing and vibrant color.");
        AnimalModel Pet11 = new AnimalModel(011, "Goldie", "Fish", "Goldfish", 2, "Female", "Golden", "Small", 1500, "Peaceful, easy to care for, and great for beginners.");
        AnimalModel Pet12 = new AnimalModel(013, "Shadow", "Cat", "Maine Coon", 4, "Male", "Black", "Large", 45000, "Gentle giant known for its friendly and playful personality.");
        AnimalModel Pet13 = new AnimalModel(012, "Charlie", "Dog", "Poodle", 1, "Male", "White", "Medium", 60000, "Intelligent, active, and easy to train.");
        AnimalModel Pet14 = new AnimalModel(014, "Coco", "Bird", "Cockatiel", 2, "Female", "Gray and Yellow", "Small", 12000, "Affectionate, social, and great at whistling tunes.");
        AnimalModel Pet15 = new AnimalModel(016, "Bubbles", "Fish", "Angelfish", 1, "Male", "Silver", "Small", 3000, "Elegant, peaceful fish ideal for community aquariums.");

        petList.add(Pet1);
        petList.add(Pet2);
        petList.add(Pet3);
        petList.add(Pet4);
        petList.add(Pet5);
        // petList.add(Pet6);
        petList.add(Pet7);
        petList.add(Pet8);
        //petList.add(Pet9);
        petList.add(Pet10);
        petList.add(Pet11);
        petList.add(Pet12);
        petList.add(Pet13);
        petList.add(Pet14);
        petList.add(Pet15);
        petList.add(Pet6);
        petList.add(Pet9);

        addDataToTable(petList);

    }

    private void initializeLayout() {
        cardLayout = new java.awt.CardLayout();
        getContentPane().setLayout(cardLayout);

        getContentPane().add(pnlWelcome, "Welcome");
        getContentPane().add(pnlLogin, "Login");
        getContentPane().add(pnlAllAnimal, "AllAnimals");
        getContentPane().add(pnlManageAnimal, "ManageAnimals");
        getContentPane().add(pnlEditAnimal, "EditAnimal");
        getContentPane().add(pnlAddAnimal, "AddAnimal");
        getContentPane().add(pnlHome, "Home");
        getContentPane().add(pnlAboutUs, "AboutUs");
        getContentPane().add(pnlCustomerRequests, "CustomerRequests");
        getContentPane().add(pnlCustomerRequest, "CustomerRequest");

        loadScreen("Welcome");
    }

    private void loadScreen(String Page) {
        cardLayout.show(getContentPane(), Page);
    }

    private void addDataToTable(List<AnimalModel> petList) {
        tableModel1 = (DefaultTableModel) jTable11.getModel();
        tableModel2 = (DefaultTableModel) jTable13.getModel();

        tableModel1.setRowCount(0);
        for (AnimalModel pet : petList) {
            tableModel1.addRow(new Object[]{pet.getPetID(), pet.getName(), pet.getCategory(), pet.getBreed(), pet.getAge(),
                pet.getGender(), pet.getColour(), pet.getSize(), pet.getAdoptionFees(), pet.getDescription()});
        }
        tableModel2.setRowCount(0);
        for (AnimalModel pet : petList) {
            tableModel2.addRow(new Object[]{pet.getPetID(), pet.getName(), pet.getCategory(), pet.getBreed(), pet.getAge(),
                pet.getGender(), pet.getColour(), pet.getSize(), pet.getAdoptionFees(), pet.getDescription()});
        }

    }

    private boolean validateAnimalFields(String name, String category, String breed, String gender, String color, String size,
            String adoptionFees, String description, String ageStr) {
        // Check for empty fields
        if (name.isEmpty() || category.isEmpty() || breed.isEmpty() || gender.isEmpty() || color.isEmpty() || size.isEmpty()
                || adoptionFees.isEmpty() || description.isEmpty() || ageStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled.");
            return false;
        }

        // Validate age (should be a number)
        try {
            Integer.parseInt(ageStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Age must be a valid number.");
            return false;
        }

        // Validate adoption fees (should be a number)
        try {
            Double.parseDouble(adoptionFees);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Adoption fees must be a valid number.");
            return false;
        }

        return true;
    }

    private void addAnimal() {
        try {
            int petID = Integer.parseInt(txtFldAddAnimalName1.getText());

            String name = txtFldAddAnimalName.getText();
            String category = (String) jComboBox1.getSelectedItem();
            String breed = txtFldAddAnimalBreed.getText();
            String ageStr = txtFldAddAnimalAge.getText();
            String gender = "";
            if (btnMale.isSelected()) {
                gender = "Male";
            }
            if (btnFemale.isSelected()) {
                gender = "Female";
            }
            String colour = txtFldAddAnimalColor.getText();
            int sizeIndex = sizeSlider.getValue();
            String size = "small";
            if (sizeIndex == 1) {
                size = "Small";
            } else if (sizeIndex == 2) {
                size = "Medium";
            } else {
                size = "Large";
            }
            String adoptionFeesStr = txtFldAddAnimalAdoptionFees.getText();
            String description = txtFldAddAnimalDescription.getText();
            if (findPetByID(petID) != null) {
                JOptionPane.showMessageDialog(null, "Pet with this ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate input fields
            if (!validateAnimalFields(name, category, breed, gender, colour, size, adoptionFeesStr, description, ageStr)) {
                return;
            }

            // Create a new AnimalModel object
            int age = Integer.parseInt(ageStr);
            double adoptionFees = Double.parseDouble(adoptionFeesStr);
            AnimalModel newPet = new AnimalModel(petID, name, category, breed, age, gender, colour, size, adoptionFees, description);

            // Add the pet to the list
            petList.add(newPet);
            JOptionPane.showMessageDialog(this, "Pet added successfully.");

            // Update the table to show the new animal
            addDataToTable(petList);

            // Clear the input fields
            clearFields();
            loadScreen("ManageAnimals");  // Switch to the Manage Animals screen
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void updateSetText() {
        loadScreen("EditAnimal");
        try {
            int petID = Integer.parseInt(txtFldEditAnimalPetID.getText());
            AnimalModel petToUpdate = findPetByID(petID);

            if (petToUpdate != null) {
                txtFldEditAnimalName.setText(petToUpdate.getName());
                jComboBox2.setSelectedItem(petToUpdate.getCategory());
                txtFldEditAnimalBreed.setText(petToUpdate.getBreed());
                txtFldEditAnimalColor.setText(petToUpdate.getColour());
                int size;
                if (petToUpdate.getSize().equals("Small")) {
                    size = 1;
                } else if (petToUpdate.getSize().equals("Medium")) {
                    size = 2;
                } else {
                    size = 3;
                }
                sizeSlider.setValue(size);
                txtFldEditAnimalDescription.setText(petToUpdate.getDescription());
            } else {
                JOptionPane.showMessageDialog(this, "No Pet Found with the given Pet ID.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Pet ID.");
        }
    }

    private void updateAnimal() {
        try {
            int petID = Integer.parseInt(txtFldEditAnimalPetID.getText());
            AnimalModel petToUpdate = findPetByID(petID);

            if (petToUpdate != null) {
                // Get new values from input fields and validate
                String name = txtFldEditAnimalName.getText();
                String category = (String) jComboBox2.getSelectedItem();
                String breed = txtFldEditAnimalBreed.getText();
                String ageStr = txtFldEditAnimalAge.getText();
                String gender = "";
                if (btnMale1.isSelected()) {
                    gender = "Male";
                }
                if (btnFemale1.isSelected()) {
                    gender = "Female";
                }
                String colour = txtFldEditAnimalColor.getText();
                int sizeIndex = sizeSlider1.getValue();
                String size = "small";
                if (sizeIndex == 1) {
                    size = "Small";
                } else if (sizeIndex == 2) {
                    size = "Medium";
                } else {
                    size = "Large";
                }
                String adoptionFeesStr = txtFldEditAnimalAdoptionFees.getText();
                String description = txtFldEditAnimalDescription.getText();

                // Validate input fields
                if (!validateAnimalFields(name, category, breed, gender, colour, size, adoptionFeesStr, description, ageStr)) {
                    return;
                }

                // Update the pet details
                int age = Integer.parseInt(ageStr);
                double adoptionFees = Double.parseDouble(adoptionFeesStr);
                petToUpdate.setName(name);
                petToUpdate.setCategory(category);
                petToUpdate.setBreed(breed);
                petToUpdate.setAge(age);
                petToUpdate.setGender(gender);
                petToUpdate.setColour(colour);
                petToUpdate.setSize(size);
                petToUpdate.setAdoptionFees(adoptionFees);
                petToUpdate.setDescription(description);

                // Update the table
                addDataToTable(petList);
                JOptionPane.showMessageDialog(this, "Pet updated successfully.");

                // Clear the input fields and go back to Manage Animals screen
                clearFields();
                loadScreen("ManageAnimals");
            } else {
                JOptionPane.showMessageDialog(this, "Pet ID not found.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please check the fields.");
        }
    }

    private void deleteAnimal() {
        try {
            int petID = Integer.parseInt(txtFldEditAnimalPetID.getText());
            AnimalModel petToDelete = findPetByID(petID);

            if (petToDelete != null) {
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this pet?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    petList.remove(petToDelete);
                    addDataToTable(petList);  // Update table
                    clearFields();
                    loadScreen("ManageAnimals");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pet ID not found.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Pet ID.");
        }
    }

    private AnimalModel findPetByID(int petID) {
        for (AnimalModel pet : petList) {
            if (pet.getPetID() == petID) {
                return pet;
            }
        }
        return null;
    }

    private void clearFields() {
        txtFldEditAnimalPetID.setText("");
        txtFldAddAnimalName.setText("");
        txtFldAddAnimalBreed.setText("");
        txtFldAddAnimalAge.setText("");
        txtFldAddAnimalColor.setText("");
        txtFldAddAnimalAdoptionFees.setText("");
        txtFldAddAnimalDescription.setText("");
    }

// Method to load a specific screen based on the name
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        pnlLoginMain = new javax.swing.JPanel();
        lblLoginLogin = new javax.swing.JLabel();
        lblLoginUsername = new javax.swing.JLabel();
        lblLoginPassword = new javax.swing.JLabel();
        txtFldLoginUsername = new javax.swing.JTextField();
        btnLoginLogin = new javax.swing.JButton();
        btnLoginFp = new javax.swing.JButton();
        btnLoginCna = new javax.swing.JButton();
        pwdFldLogin = new javax.swing.JPasswordField();
        lblIconLoginWoofs = new javax.swing.JLabel();
        lblIconLoginLLA = new javax.swing.JLabel();
        lblIconLoginLogo = new javax.swing.JLabel();
        pnlAboutUs = new javax.swing.JPanel();
        pnlIconAboutUsLeftPanel = new javax.swing.JPanel();
        btnAboutUsManageAnimal = new javax.swing.JButton();
        btnAboutUsCustomerRequest = new javax.swing.JButton();
        btnAboutussCustomermessages = new javax.swing.JButton();
        btnAboutUsHistory = new javax.swing.JButton();
        btnAboutUsHome = new javax.swing.JButton();
        btnAboutUsLogout = new javax.swing.JButton();
        pnlAllAnimalTop1 = new javax.swing.JPanel();
        lblAllAnimalAL1 = new javax.swing.JLabel();
        pnlIconAllAnimalLogo1 = new javax.swing.JLabel();
        pnlIconAllAnimaLLA1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblIconLoginWoofs1 = new javax.swing.JLabel();
        pnlHome = new javax.swing.JPanel();
        jPanel191 = new javax.swing.JPanel();
        jPanel190 = new javax.swing.JPanel();
        jButton239 = new javax.swing.JButton();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jButton190 = new javax.swing.JButton();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jButton103 = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jButton189 = new javax.swing.JButton();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        jButton187 = new javax.swing.JButton();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jPanel91 = new javax.swing.JPanel();
        jButton102 = new javax.swing.JButton();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jPanel98 = new javax.swing.JPanel();
        jButton188 = new javax.swing.JButton();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jPanel99 = new javax.swing.JPanel();
        jButton104 = new javax.swing.JButton();
        jLabel117 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jPanel192 = new javax.swing.JPanel();
        jButton195 = new javax.swing.JButton();
        jLabel251 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jPanel193 = new javax.swing.JPanel();
        jButton196 = new javax.swing.JButton();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel185 = new javax.swing.JPanel();
        btnHomeAllAnimals = new javax.swing.JButton();
        btnHomeManageAnimal = new javax.swing.JButton();
        btnHomeCustomerRequest = new javax.swing.JButton();
        btnHomeCustomerMessage = new javax.swing.JButton();
        btnHomeAboutUs = new javax.swing.JButton();
        btnHomeLogOut = new javax.swing.JButton();
        pnlAllAnimal = new javax.swing.JPanel();
        pnlAllAnimalTop = new javax.swing.JPanel();
        lblAllAnimalAL = new javax.swing.JLabel();
        pnlIconAllAnimalLogo = new javax.swing.JLabel();
        pnlIconAllAnimaLLA = new javax.swing.JLabel();
        pnlIconAllAnimaLeftPanel = new javax.swing.JPanel();
        btnAllAnimalManageAnimal = new javax.swing.JButton();
        btnAllAnimalCustomerRequest = new javax.swing.JButton();
        btnAllAnimalCustomermessages = new javax.swing.JButton();
        btnAllAnimalAboutUs = new javax.swing.JButton();
        btnAllAnimalHome = new javax.swing.JButton();
        btnAllAnimalLogout = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        btnSearch1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        scrlpaneManageAnimalAD1 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        pnlManageAnimal = new javax.swing.JPanel();
        pnlManageAnimalMiddle = new javax.swing.JPanel();
        btnManageAnimalEdit = new javax.swing.JButton();
        btnManageAnimalAdd = new javax.swing.JButton();
        scrlpaneManageAnimalAD = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnManageAnimalSortByPetID1 = new javax.swing.JButton();
        pnlManageAnimalTop = new javax.swing.JPanel();
        lblManageAnimalMA = new javax.swing.JLabel();
        pnlIconManageAnimalLogo = new javax.swing.JLabel();
        pnlIconManageAnimalLLA = new javax.swing.JLabel();
        pnlManageAnimalLeft = new javax.swing.JPanel();
        btnManageAnimalAllAnimal = new javax.swing.JButton();
        btnManageAnimalCustomerRequest1 = new javax.swing.JButton();
        btnManageAnimaCustomermessages = new javax.swing.JButton();
        btnManageAnimalAboutUs = new javax.swing.JButton();
        btnManageAnimalHome = new javax.swing.JButton();
        btnManageAnimaLogout = new javax.swing.JButton();
        pnlAddAnimal = new javax.swing.JPanel();
        lblAddAnimalTop = new javax.swing.JPanel();
        lblIconAddAnimalLLA = new javax.swing.JLabel();
        lblIconAddAnimalLogo = new javax.swing.JLabel();
        lblAddAnimalAddanimal = new javax.swing.JLabel();
        pnlAddAnimalBottom = new javax.swing.JPanel();
        pnlAddAnimalBottomLeft = new javax.swing.JPanel();
        btnAddAnimalHome = new javax.swing.JButton();
        btnAddAnimalAllAnimal = new javax.swing.JButton();
        btnAddAnimalManageAnimal = new javax.swing.JButton();
        btnAddAnimalLogout = new javax.swing.JButton();
        btnAddAnimalAboutUs = new javax.swing.JButton();
        btnAddAnimalHistory = new javax.swing.JButton();
        btnAddAnimalCustomerMessages = new javax.swing.JButton();
        btnAddAnimalCustomerRequest = new javax.swing.JButton();
        btnAddAnimalBack = new javax.swing.JButton();
        pnlAddAnimalBottomMiddle = new javax.swing.JPanel();
        btnAddAnimalImage = new javax.swing.JButton();
        btnAddAnimalAdd = new javax.swing.JButton();
        lblAddAnimalDescription = new javax.swing.JLabel();
        lblAddAnimalPetCategory = new javax.swing.JLabel();
        lblAddAnimalAge = new javax.swing.JLabel();
        lblAddAnimalColor = new javax.swing.JLabel();
        lblAddAnimalAdoptiionFees = new javax.swing.JLabel();
        lblAddAnimalName = new javax.swing.JLabel();
        lblAddAnimalGender = new javax.swing.JLabel();
        lblAddAnimalBreed = new javax.swing.JLabel();
        pnlIconAddAnimalImage = new javax.swing.JLabel();
        lblAddAnimalSize = new javax.swing.JLabel();
        txtFldAddAnimalDescription = new javax.swing.JTextField();
        txtFldAddAnimalName = new javax.swing.JTextField();
        txtFldAddAnimalBreed = new javax.swing.JTextField();
        txtFldAddAnimalAge = new javax.swing.JTextField();
        txtFldAddAnimalAdoptionFees = new javax.swing.JTextField();
        txtFldAddAnimalColor = new javax.swing.JTextField();
        lblAddAnimalName1 = new javax.swing.JLabel();
        txtFldAddAnimalName1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        sizeSlider = new javax.swing.JSlider();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlAddAnimalBottomRight = new javax.swing.JPanel();
        pnlIconAddAnimalWoofs = new javax.swing.JLabel();
        pnlEditAnimal = new javax.swing.JPanel();
        pnlEditAnimalBottom = new javax.swing.JPanel();
        pnlEditAnimalTop = new javax.swing.JPanel();
        lblIconEditAnimalLLA = new javax.swing.JLabel();
        lblIconEditAnimalLogo = new javax.swing.JLabel();
        lblEditAnimalUpdateAnimalInformation = new javax.swing.JLabel();
        pnlEditAnimalBottomRight = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        pnlEditAnimalBottomMiddle = new javax.swing.JPanel();
        lblEditAnimalDescription = new javax.swing.JLabel();
        lblEditAnimalPetCategory = new javax.swing.JLabel();
        lblEditAnimalPetID = new javax.swing.JLabel();
        lblEditAnimalAge = new javax.swing.JLabel();
        lblEditAnimalColor = new javax.swing.JLabel();
        lblEditAnimalGender = new javax.swing.JLabel();
        lblEditAnimalName = new javax.swing.JLabel();
        lblEditAnimalSize = new javax.swing.JLabel();
        lblEditAnimalBreed = new javax.swing.JLabel();
        lblIconEditAnimalImage = new javax.swing.JLabel();
        lblEditAnimalAdoptionFee = new javax.swing.JLabel();
        txtFldEditAnimalName = new javax.swing.JTextField();
        txtFldEditAnimalDescription = new javax.swing.JTextField();
        txtFldEditAnimalBreed = new javax.swing.JTextField();
        txtFldEditAnimalAge = new javax.swing.JTextField();
        txtFldEditAnimalColor = new javax.swing.JTextField();
        txtFldEditAnimalAdoptionFees = new javax.swing.JTextField();
        txtFldEditAnimalPetID = new javax.swing.JTextField();
        btnEditAnimalImage = new javax.swing.JButton();
        btnEditAnimalSave = new javax.swing.JButton();
        btnEditAnimalCheck = new javax.swing.JButton();
        btnEditAnimalDelete = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnMale1 = new javax.swing.JRadioButton();
        btnFemale1 = new javax.swing.JRadioButton();
        sizeSlider1 = new javax.swing.JSlider();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlEditAnimalBottomLeft = new javax.swing.JPanel();
        btnEditAnimalHome = new javax.swing.JButton();
        btnEditAnimalAllAnimal = new javax.swing.JButton();
        btnEditAnimalManageAnimal = new javax.swing.JButton();
        btnEditAnimalCustomerRequest = new javax.swing.JButton();
        btnEditAnimalCustomerMessages = new javax.swing.JButton();
        btnEditAnimalHistory = new javax.swing.JButton();
        btnEditAnimalLogout = new javax.swing.JButton();
        btnEditAnimalAboutUs = new javax.swing.JButton();
        btnEditAnimalBack = new javax.swing.JButton();
        pnlCustomerRequests = new javax.swing.JPanel();
        pnlIconAllAnimaLeftPanel1 = new javax.swing.JPanel();
        btnAllAnimalManageAnimal1 = new javax.swing.JButton();
        btnAllAnimalCustomerRequest1 = new javax.swing.JButton();
        btnAllAnimalCustomermessages1 = new javax.swing.JButton();
        btnAllAnimalAboutUs1 = new javax.swing.JButton();
        btnAllAnimalHome1 = new javax.swing.JButton();
        btnAllAnimalLogout1 = new javax.swing.JButton();
        scrlpaneAllAnimalAnimalList1 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        pnlAllAnimalTop2 = new javax.swing.JPanel();
        lblAllAnimalAL2 = new javax.swing.JLabel();
        pnlIconAllAnimalLogo2 = new javax.swing.JLabel();
        pnlIconAllAnimaLLA2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlCustomerRequest = new javax.swing.JPanel();
        pnlEditAnimalTop1 = new javax.swing.JPanel();
        lblIconEditAnimalLLA1 = new javax.swing.JLabel();
        lblIconEditAnimalLogo1 = new javax.swing.JLabel();
        lblEditAnimalUpdateAnimalInformation1 = new javax.swing.JLabel();
        pnlEditAnimalBottom1 = new javax.swing.JPanel();
        pnlEditAnimalBottomMiddle1 = new javax.swing.JPanel();
        lblEditAnimalDescription1 = new javax.swing.JLabel();
        lblEditAnimalPetCategory1 = new javax.swing.JLabel();
        lblEditAnimalPetID1 = new javax.swing.JLabel();
        lblEditAnimalAge1 = new javax.swing.JLabel();
        lblEditAnimalColor1 = new javax.swing.JLabel();
        lblEditAnimalGender1 = new javax.swing.JLabel();
        lblEditAnimalName1 = new javax.swing.JLabel();
        lblEditAnimalSize1 = new javax.swing.JLabel();
        lblEditAnimalBreed1 = new javax.swing.JLabel();
        lblIconEditAnimalImage1 = new javax.swing.JLabel();
        lblEditAnimalAdoptionFee1 = new javax.swing.JLabel();
        txtFldEditAnimalName1 = new javax.swing.JTextField();
        txtFldEditAnimalDescription1 = new javax.swing.JTextField();
        txtFldEditAnimalPetCategory1 = new javax.swing.JTextField();
        txtFldEditAnimalBreed1 = new javax.swing.JTextField();
        txtFldEditAnimalAge1 = new javax.swing.JTextField();
        txtFldEditAnimalGender1 = new javax.swing.JTextField();
        txtFldEditAnimalColor1 = new javax.swing.JTextField();
        txtFldEditAnimalAdoptionFees1 = new javax.swing.JTextField();
        txtFldEditAnimalSize1 = new javax.swing.JTextField();
        txtFldEditAnimalPetID1 = new javax.swing.JTextField();
        btnEditAnimalImage1 = new javax.swing.JButton();
        btnEditAnimalSave1 = new javax.swing.JButton();
        btnEditAnimalCheck1 = new javax.swing.JButton();
        btnEditAnimalDelete1 = new javax.swing.JButton();
        pnlEditAnimalBottomLeft1 = new javax.swing.JPanel();
        btnEditAnimalHome1 = new javax.swing.JButton();
        btnEditAnimalAllAnimal1 = new javax.swing.JButton();
        btnEditAnimalManageAnimal1 = new javax.swing.JButton();
        btnEditAnimalHistory1 = new javax.swing.JButton();
        btnEditAnimalLogout1 = new javax.swing.JButton();
        btnEditAnimalAboutUs1 = new javax.swing.JButton();
        btnEditAnimalBack1 = new javax.swing.JButton();
        pnlEditAnimalBottomRight1 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        pnlSignUp = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlWelcome = new javax.swing.JPanel();
        lblIconWelcomeWoofs = new javax.swing.JLabel();
        lblIconWelcomeLLA = new javax.swing.JLabel();
        lblIconWelcomeLogo = new javax.swing.JLabel();
        lblIconWelcomeWTWAW = new javax.swing.JLabel();
        lblIconWelcomeClickHere = new javax.swing.JPanel();
        lblIconWelcomeClick = new javax.swing.JLabel();
        btnWelcomeLogin = new javax.swing.JButton();

        pnlLogin.setMaximumSize(new java.awt.Dimension(1284, 695));
        pnlLogin.setMinimumSize(new java.awt.Dimension(1284, 695));
        pnlLogin.setPreferredSize(new java.awt.Dimension(1284, 695));

        pnlLoginMain.setBackground(new java.awt.Color(255, 255, 255));

        lblLoginLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoginLogin.setText("Login to your Account");

        lblLoginUsername.setText("Username");

        lblLoginPassword.setText("Password");

        txtFldLoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldLoginUsernameActionPerformed(evt);
            }
        });

        btnLoginLogin.setBackground(new java.awt.Color(180, 50, 43));
        btnLoginLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoginLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginLogin.setText("Login");
        btnLoginLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginLoginActionPerformed(evt);
            }
        });

        btnLoginFp.setText("Forget Password?");
        btnLoginFp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginFpActionPerformed(evt);
            }
        });

        btnLoginCna.setText("Create new account");

        javax.swing.GroupLayout pnlLoginMainLayout = new javax.swing.GroupLayout(pnlLoginMain);
        pnlLoginMain.setLayout(pnlLoginMainLayout);
        pnlLoginMainLayout.setHorizontalGroup(
            pnlLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginMainLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnLoginCna, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLoginMainLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pnlLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoginLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pwdFldLogin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLoginFp)
                            .addGroup(pnlLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnLoginLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                .addComponent(txtFldLoginUsername, javax.swing.GroupLayout.Alignment.LEADING))))))
        );
        pnlLoginMainLayout.setVerticalGroup(
            pnlLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginMainLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLoginLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblLoginUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFldLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblLoginPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdFldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoginFp)
                .addGap(37, 37, 37)
                .addComponent(btnLoginLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoginCna)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        lblIconLoginWoofs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/woofs.png.png"))); // NOI18N

        lblIconLoginLLA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/love (1).png"))); // NOI18N

        lblIconLoginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/logooo (1).png"))); // NOI18N

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblIconLoginLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 588, Short.MAX_VALUE)
                        .addComponent(lblIconLoginLLA)
                        .addGap(46, 46, 46))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(pnlLoginMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIconLoginWoofs, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblIconLoginLogo))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIconLoginLLA, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLoginMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconLoginWoofs, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pnlAboutUs.setMaximumSize(new java.awt.Dimension(1284, 695));
        pnlAboutUs.setMinimumSize(new java.awt.Dimension(1284, 695));
        pnlAboutUs.setPreferredSize(new java.awt.Dimension(1284, 695));

        pnlIconAboutUsLeftPanel.setBackground(new java.awt.Color(255, 204, 0));
        pnlIconAboutUsLeftPanel.setMaximumSize(new java.awt.Dimension(1100, 670));
        pnlIconAboutUsLeftPanel.setMinimumSize(new java.awt.Dimension(1100, 670));

        btnAboutUsManageAnimal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAboutUsManageAnimal.setText("Manage Animal");
        btnAboutUsManageAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsManageAnimalActionPerformed(evt);
            }
        });

        btnAboutUsCustomerRequest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAboutUsCustomerRequest.setText("All Animals");
        btnAboutUsCustomerRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsCustomerRequestActionPerformed(evt);
            }
        });

        btnAboutussCustomermessages.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAboutussCustomermessages.setText("Customer Request");
        btnAboutussCustomermessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutussCustomermessagesActionPerformed(evt);
            }
        });

        btnAboutUsHistory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAboutUsHistory.setText("History");
        btnAboutUsHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsHistoryActionPerformed(evt);
            }
        });

        btnAboutUsHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAboutUsHome.setText("HOME");
        btnAboutUsHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsHomeActionPerformed(evt);
            }
        });

        btnAboutUsLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAboutUsLogout.setText("LOG OUT");
        btnAboutUsLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIconAboutUsLeftPanelLayout = new javax.swing.GroupLayout(pnlIconAboutUsLeftPanel);
        pnlIconAboutUsLeftPanel.setLayout(pnlIconAboutUsLeftPanelLayout);
        pnlIconAboutUsLeftPanelLayout.setHorizontalGroup(
            pnlIconAboutUsLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconAboutUsLeftPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlIconAboutUsLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAboutUsLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAboutUsManageAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAboutUsHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAboutussCustomermessages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnAboutUsCustomerRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAboutUsHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlIconAboutUsLeftPanelLayout.setVerticalGroup(
            pnlIconAboutUsLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconAboutUsLeftPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnAboutUsHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAboutUsManageAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnAboutUsCustomerRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAboutussCustomermessages, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnAboutUsHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAboutUsLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAllAnimalTop1.setBackground(new java.awt.Color(255, 204, 0));
        pnlAllAnimalTop1.setMaximumSize(new java.awt.Dimension(1284, 695));

        lblAllAnimalAL1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblAllAnimalAL1.setForeground(new java.awt.Color(255, 255, 255));
        lblAllAnimalAL1.setText("ABOUT US");

        pnlIconAllAnimalLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/logooo (1).png"))); // NOI18N

        pnlIconAllAnimaLLA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/love (1).png"))); // NOI18N

        javax.swing.GroupLayout pnlAllAnimalTop1Layout = new javax.swing.GroupLayout(pnlAllAnimalTop1);
        pnlAllAnimalTop1.setLayout(pnlAllAnimalTop1Layout);
        pnlAllAnimalTop1Layout.setHorizontalGroup(
            pnlAllAnimalTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAllAnimalTop1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlIconAllAnimalLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(lblAllAnimalAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(pnlIconAllAnimaLLA1)
                .addGap(59, 59, 59))
        );
        pnlAllAnimalTop1Layout.setVerticalGroup(
            pnlAllAnimalTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAllAnimalTop1Layout.createSequentialGroup()
                .addGroup(pnlAllAnimalTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAllAnimalTop1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAllAnimalTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlIconAllAnimaLLA1)
                            .addComponent(pnlIconAllAnimalLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlAllAnimalTop1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblAllAnimalAL1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 204, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/Screenshot_2025-01-05_191506-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        lblIconLoginWoofs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/woofs.png.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIconLoginWoofs1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIconLoginWoofs1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout pnlAboutUsLayout = new javax.swing.GroupLayout(pnlAboutUs);
        pnlAboutUs.setLayout(pnlAboutUsLayout);
        pnlAboutUsLayout.setHorizontalGroup(
            pnlAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAboutUsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAboutUsLayout.createSequentialGroup()
                        .addComponent(pnlIconAboutUsLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlAllAnimalTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlAboutUsLayout.setVerticalGroup(
            pnlAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAboutUsLayout.createSequentialGroup()
                .addComponent(pnlAllAnimalTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlIconAboutUsLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlHome.setBackground(new java.awt.Color(255, 255, 255));
        pnlHome.setMaximumSize(new java.awt.Dimension(1284, 695));
        pnlHome.setMinimumSize(new java.awt.Dimension(1284, 695));
        pnlHome.setPreferredSize(new java.awt.Dimension(1284, 695));

        jPanel191.setPreferredSize(new java.awt.Dimension(800, 400));

        jButton239.setBackground(new java.awt.Color(255, 204, 0));
        jButton239.setForeground(new java.awt.Color(255, 255, 255));
        jButton239.setText("EDIT");
        jButton239.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton239ActionPerformed(evt);
            }
        });

        jLabel248.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel248.setText("KIARA");

        jLabel249.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industr");

        javax.swing.GroupLayout jPanel190Layout = new javax.swing.GroupLayout(jPanel190);
        jPanel190.setLayout(jPanel190Layout);
        jPanel190Layout.setHorizontalGroup(
            jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel190Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel190Layout.createSequentialGroup()
                        .addComponent(jLabel249, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton239, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel190Layout.createSequentialGroup()
                        .addComponent(jLabel248)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel190Layout.setVerticalGroup(
            jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel190Layout.createSequentialGroup()
                .addComponent(jLabel248)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel190Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton239))
                    .addComponent(jLabel249, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton190.setBackground(new java.awt.Color(255, 204, 0));
        jButton190.setForeground(new java.awt.Color(255, 255, 255));
        jButton190.setText("EDIT");
        jButton190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton190ActionPerformed(evt);
            }
        });

        jLabel238.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel238.setText("LARRY");

        jLabel239.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industr");

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(jLabel239, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton190, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel238))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addComponent(jLabel238)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton190)
                    .addComponent(jLabel239, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/GERMANSEPHERD (1).jpg"))); // NOI18N

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/Husky (1).jpg"))); // NOI18N

        jLabel232.setForeground(new java.awt.Color(255, 255, 255));
        jLabel232.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/Redbetta (1).jpg"))); // NOI18N

        jLabel231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/Goldfish (1).jpg"))); // NOI18N

        jLabel230.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/whitecat (1).jpg"))); // NOI18N

        jLabel227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/blue parrot (1).jpg"))); // NOI18N

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/pink parrot (1).jpg"))); // NOI18N

        jButton103.setBackground(new java.awt.Color(255, 204, 0));
        jButton103.setForeground(new java.awt.Color(255, 255, 255));
        jButton103.setText("EDIT");
        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel114.setText("LUCY");

        jLabel115.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industr");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addComponent(jLabel114)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel53Layout.createSequentialGroup()
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton103)
                    .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton189.setBackground(new java.awt.Color(255, 204, 0));
        jButton189.setForeground(new java.awt.Color(255, 255, 255));
        jButton189.setText("EDIT");
        jButton189.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton189ActionPerformed(evt);
            }
        });

        jLabel236.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel236.setText("PHOENIX");

        jLabel237.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industr");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jLabel237, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton189, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jLabel236)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                .addComponent(jLabel236)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton189))
                    .addComponent(jLabel237, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton187.setBackground(new java.awt.Color(255, 204, 0));
        jButton187.setForeground(new java.awt.Color(255, 255, 255));
        jButton187.setText("EDIT");
        jButton187.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton187ActionPerformed(evt);
            }
        });

        jLabel228.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel228.setText("KIWI");

        jLabel229.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industr");

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addComponent(jLabel229, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton187, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel228))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addComponent(jLabel228)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel229, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton187))
        );

        jButton102.setBackground(new java.awt.Color(255, 204, 0));
        jButton102.setForeground(new java.awt.Color(255, 255, 255));
        jButton102.setText("EDIT");
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel112.setText("BEEB");

        jLabel113.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industr");

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel91Layout.createSequentialGroup()
                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel91Layout.createSequentialGroup()
                        .addComponent(jLabel112)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel91Layout.createSequentialGroup()
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton102)
                    .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton188.setBackground(new java.awt.Color(255, 204, 0));
        jButton188.setForeground(new java.awt.Color(255, 255, 255));
        jButton188.setText("EDIT");
        jButton188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton188ActionPerformed(evt);
            }
        });

        jLabel233.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel233.setText("ROCKY");

        jLabel234.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industr");

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel98Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel98Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel234, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton188, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel98Layout.createSequentialGroup()
                        .addComponent(jLabel233)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel98Layout.createSequentialGroup()
                .addComponent(jLabel233)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton188)
                    .addComponent(jLabel234, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton104.setBackground(new java.awt.Color(255, 204, 0));
        jButton104.setForeground(new java.awt.Color(255, 255, 255));
        jButton104.setText("EDIT");
        jButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton104ActionPerformed(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel117.setText("POPPIE");

        jLabel226.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industr");

        javax.swing.GroupLayout jPanel99Layout = new javax.swing.GroupLayout(jPanel99);
        jPanel99.setLayout(jPanel99Layout);
        jPanel99Layout.setHorizontalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel99Layout.createSequentialGroup()
                        .addComponent(jLabel226, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel99Layout.createSequentialGroup()
                        .addComponent(jLabel117)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel99Layout.setVerticalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel99Layout.createSequentialGroup()
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel99Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton104))
                    .addComponent(jLabel226, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/scottishfold (1).jpg"))); // NOI18N

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/Husky (1).jpg"))); // NOI18N

        jLabel250.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/GERMANSEPHERD (1).jpg"))); // NOI18N

        jButton195.setBackground(new java.awt.Color(255, 204, 0));
        jButton195.setForeground(new java.awt.Color(255, 255, 255));
        jButton195.setText("EDIT");
        jButton195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton195ActionPerformed(evt);
            }
        });

        jLabel251.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel251.setText("ROCKY");

        jLabel252.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industr");

        javax.swing.GroupLayout jPanel192Layout = new javax.swing.GroupLayout(jPanel192);
        jPanel192.setLayout(jPanel192Layout);
        jPanel192Layout.setHorizontalGroup(
            jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel192Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel192Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel252, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton195, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel192Layout.createSequentialGroup()
                        .addComponent(jLabel251)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel192Layout.setVerticalGroup(
            jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel192Layout.createSequentialGroup()
                .addComponent(jLabel251)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton195)
                    .addComponent(jLabel252, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton196.setBackground(new java.awt.Color(255, 204, 0));
        jButton196.setForeground(new java.awt.Color(255, 255, 255));
        jButton196.setText("EDIT");
        jButton196.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton196ActionPerformed(evt);
            }
        });

        jLabel253.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel253.setText("ROCKY");

        jLabel254.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industr");

        javax.swing.GroupLayout jPanel193Layout = new javax.swing.GroupLayout(jPanel193);
        jPanel193.setLayout(jPanel193Layout);
        jPanel193Layout.setHorizontalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel193Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel193Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel254, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton196, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel193Layout.createSequentialGroup()
                        .addComponent(jLabel253)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel193Layout.setVerticalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel193Layout.createSequentialGroup()
                .addComponent(jLabel253)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton196)
                    .addComponent(jLabel254, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel191Layout = new javax.swing.GroupLayout(jPanel191);
        jPanel191.setLayout(jPanel191Layout);
        jPanel191Layout.setHorizontalGroup(
            jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel191Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel191Layout.createSequentialGroup()
                        .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel190, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel230))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel191Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel191Layout.createSequentialGroup()
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel191Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel231, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111)
                    .addComponent(jPanel98, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116))
                .addGap(29, 29, 29)
                .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel191Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel232, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel191Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel250)
                            .addComponent(jLabel56)))
                    .addGroup(jPanel191Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel192, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel191Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel193, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel191Layout.setVerticalGroup(
            jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel191Layout.createSequentialGroup()
                .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel191Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel250, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel191Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel231, javax.swing.GroupLayout.PREFERRED_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel191Layout.createSequentialGroup()
                        .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel190, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel230, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(264, 264, 264))
                    .addGroup(jPanel191Layout.createSequentialGroup()
                        .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel191Layout.createSequentialGroup()
                                .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel192, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel191Layout.createSequentialGroup()
                                        .addComponent(jLabel232, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel191Layout.createSequentialGroup()
                                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel193, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel191Layout.createSequentialGroup()
                                .addComponent(jPanel98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jButton8.setText("HOME");

        jButton9.setText("MY REQUEST");
        jButton9.setPreferredSize(new java.awt.Dimension(72, 23));

        jButton14.setText("ANIMAL");
        jButton14.setPreferredSize(new java.awt.Dimension(72, 23));

        jButton15.setText("LOGIN");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/find__1_-removebg-preview.png"))); // NOI18N
        jButton16.setText("ADOPT");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton18.setText("ABOUT US");
        jButton18.setPreferredSize(new java.awt.Dimension(72, 23));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton78.setText("Adopt");
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 0));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/logooo (1).png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HOME ");

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/love (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(264, 264, 264)
                .addComponent(jLabel61)
                .addGap(16, 16, 16))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel52)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(30, 30, 30))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel185.setBackground(new java.awt.Color(255, 204, 0));
        jPanel185.setMaximumSize(new java.awt.Dimension(1100, 670));
        jPanel185.setMinimumSize(new java.awt.Dimension(1100, 670));

        btnHomeAllAnimals.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHomeAllAnimals.setText("All Animals");
        btnHomeAllAnimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeAllAnimalsActionPerformed(evt);
            }
        });

        btnHomeManageAnimal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHomeManageAnimal.setText("Manage Animal");
        btnHomeManageAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeManageAnimalActionPerformed(evt);
            }
        });

        btnHomeCustomerRequest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHomeCustomerRequest.setText("Customer Request");
        btnHomeCustomerRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeCustomerRequestActionPerformed(evt);
            }
        });

        btnHomeCustomerMessage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHomeCustomerMessage.setText("Customer messages");

        btnHomeAboutUs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHomeAboutUs.setText("About Us");
        btnHomeAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeAboutUsActionPerformed(evt);
            }
        });

        btnHomeLogOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHomeLogOut.setText("LOG OUT");
        btnHomeLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel185Layout = new javax.swing.GroupLayout(jPanel185);
        jPanel185.setLayout(jPanel185Layout);
        jPanel185Layout.setHorizontalGroup(
            jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel185Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHomeLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomeAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomeCustomerMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomeCustomerRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomeManageAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomeAllAnimals, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel185Layout.setVerticalGroup(
            jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel185Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnHomeAllAnimals, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnHomeManageAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnHomeCustomerRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnHomeCustomerMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnHomeAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnHomeLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(jPanel185, javax.swing.GroupLayout.PREFERRED_SIZE, 242, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel191, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(226, 226, 226)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel191, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                    .addComponent(jPanel185, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pnlAllAnimal.setBackground(new java.awt.Color(255, 255, 255));
        pnlAllAnimal.setMaximumSize(new java.awt.Dimension(1284, 695));
        pnlAllAnimal.setMinimumSize(new java.awt.Dimension(1284, 695));
        pnlAllAnimal.setPreferredSize(new java.awt.Dimension(1284, 695));

        pnlAllAnimalTop.setBackground(new java.awt.Color(255, 204, 0));

        lblAllAnimalAL.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblAllAnimalAL.setForeground(new java.awt.Color(255, 255, 255));
        lblAllAnimalAL.setText(" ANIMALS LIST");

        pnlIconAllAnimalLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/logooo (1).png"))); // NOI18N

        pnlIconAllAnimaLLA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/love (1).png"))); // NOI18N

        javax.swing.GroupLayout pnlAllAnimalTopLayout = new javax.swing.GroupLayout(pnlAllAnimalTop);
        pnlAllAnimalTop.setLayout(pnlAllAnimalTopLayout);
        pnlAllAnimalTopLayout.setHorizontalGroup(
            pnlAllAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAllAnimalTopLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(pnlIconAllAnimalLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(lblAllAnimalAL, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(pnlIconAllAnimaLLA)
                .addGap(33, 33, 33))
        );
        pnlAllAnimalTopLayout.setVerticalGroup(
            pnlAllAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAllAnimalTopLayout.createSequentialGroup()
                .addGroup(pnlAllAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAllAnimalTopLayout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(pnlIconAllAnimaLLA))
                    .addComponent(pnlIconAllAnimalLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlAllAnimalTopLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblAllAnimalAL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlIconAllAnimaLeftPanel.setBackground(new java.awt.Color(255, 204, 0));
        pnlIconAllAnimaLeftPanel.setMaximumSize(new java.awt.Dimension(1100, 670));
        pnlIconAllAnimaLeftPanel.setMinimumSize(new java.awt.Dimension(1100, 670));

        btnAllAnimalManageAnimal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalManageAnimal.setText("Manage Animal");
        btnAllAnimalManageAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAnimalManageAnimalActionPerformed(evt);
            }
        });

        btnAllAnimalCustomerRequest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalCustomerRequest.setText("Customer Request");
        btnAllAnimalCustomerRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAnimalCustomerRequestActionPerformed(evt);
            }
        });

        btnAllAnimalCustomermessages.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalCustomermessages.setText("Customer messages");

        btnAllAnimalAboutUs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalAboutUs.setText("About Us");
        btnAllAnimalAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAnimalAboutUsActionPerformed(evt);
            }
        });

        btnAllAnimalHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalHome.setText("HOME");
        btnAllAnimalHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAnimalHomeActionPerformed(evt);
            }
        });

        btnAllAnimalLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalLogout.setText("LOG OUT");
        btnAllAnimalLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAnimalLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIconAllAnimaLeftPanelLayout = new javax.swing.GroupLayout(pnlIconAllAnimaLeftPanel);
        pnlIconAllAnimaLeftPanel.setLayout(pnlIconAllAnimaLeftPanelLayout);
        pnlIconAllAnimaLeftPanelLayout.setHorizontalGroup(
            pnlIconAllAnimaLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconAllAnimaLeftPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlIconAllAnimaLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAllAnimalLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllAnimalManageAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllAnimalAboutUs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllAnimalCustomermessages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnAllAnimalCustomerRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllAnimalHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlIconAllAnimaLeftPanelLayout.setVerticalGroup(
            pnlIconAllAnimaLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconAllAnimaLeftPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnAllAnimalHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAllAnimalManageAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnAllAnimalCustomerRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAllAnimalCustomermessages, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnAllAnimalAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAllAnimalLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSearch.setBackground(new java.awt.Color(255, 204, 0));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search By Name");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnSearch1.setBackground(new java.awt.Color(0, 204, 255));
        btnSearch1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch1.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch1.setText("Refresh");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Search by name:");

        jTable11.setBackground(new java.awt.Color(242, 242, 242));
        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pet ID", "Name", "Pet category", "Breed", "Age", "Gender", "Color", "Size", "Adoption Fees", "Pet Description"
            }
        ));
        scrlpaneManageAnimalAD1.setViewportView(jTable11);

        javax.swing.GroupLayout pnlAllAnimalLayout = new javax.swing.GroupLayout(pnlAllAnimal);
        pnlAllAnimal.setLayout(pnlAllAnimalLayout);
        pnlAllAnimalLayout.setHorizontalGroup(
            pnlAllAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAllAnimalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAllAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAllAnimalLayout.createSequentialGroup()
                        .addComponent(pnlAllAnimalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAllAnimalLayout.createSequentialGroup()
                        .addGroup(pnlAllAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrlpaneManageAnimalAD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAllAnimalLayout.createSequentialGroup()
                                .addComponent(pnlIconAllAnimaLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(455, 455, 455)))
                        .addGap(17, 17, 17))))
        );
        pnlAllAnimalLayout.setVerticalGroup(
            pnlAllAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAllAnimalLayout.createSequentialGroup()
                .addComponent(pnlAllAnimalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAllAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAllAnimalLayout.createSequentialGroup()
                        .addComponent(pnlIconAllAnimaLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, Short.MAX_VALUE)
                        .addGap(51, 51, 51))
                    .addGroup(pnlAllAnimalLayout.createSequentialGroup()
                        .addGroup(pnlAllAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(jTextField7)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrlpaneManageAnimalAD1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch1)
                        .addGap(20, 20, 20))))
        );

        pnlManageAnimalMiddle.setBackground(new java.awt.Color(255, 255, 255));

        btnManageAnimalEdit.setBackground(new java.awt.Color(153, 0, 0));
        btnManageAnimalEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageAnimalEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnManageAnimalEdit.setText("EDIT");
        btnManageAnimalEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAnimalEditActionPerformed(evt);
            }
        });

        btnManageAnimalAdd.setBackground(new java.awt.Color(153, 0, 0));
        btnManageAnimalAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageAnimalAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnManageAnimalAdd.setText("ADD");
        btnManageAnimalAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAnimalAddActionPerformed(evt);
            }
        });

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pet ID", "Name", "Pet category", "Breed", "Age", "Gender", "Color", "Size", "Adoption Fees", "Pet Description"
            }
        ));
        scrlpaneManageAnimalAD.setViewportView(jTable13);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pet ID", "Name", "Age", "Fees" }));

        jLabel2.setText("Sort By:");

        btnManageAnimalSortByPetID1.setBackground(new java.awt.Color(255, 204, 0));
        btnManageAnimalSortByPetID1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageAnimalSortByPetID1.setForeground(new java.awt.Color(255, 255, 255));
        btnManageAnimalSortByPetID1.setText("SORT");
        btnManageAnimalSortByPetID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAnimalSortByPetID1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlManageAnimalMiddleLayout = new javax.swing.GroupLayout(pnlManageAnimalMiddle);
        pnlManageAnimalMiddle.setLayout(pnlManageAnimalMiddleLayout);
        pnlManageAnimalMiddleLayout.setHorizontalGroup(
            pnlManageAnimalMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageAnimalMiddleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlManageAnimalMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManageAnimalMiddleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnManageAnimalSortByPetID1))
                    .addComponent(scrlpaneManageAnimalAD)
                    .addGroup(pnlManageAnimalMiddleLayout.createSequentialGroup()
                        .addComponent(btnManageAnimalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnManageAnimalEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 809, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlManageAnimalMiddleLayout.setVerticalGroup(
            pnlManageAnimalMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageAnimalMiddleLayout.createSequentialGroup()
                .addGroup(pnlManageAnimalMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox3)
                    .addComponent(btnManageAnimalSortByPetID1))
                .addGap(1, 1, 1)
                .addComponent(scrlpaneManageAnimalAD, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlManageAnimalMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageAnimalAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageAnimalEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pnlManageAnimalTop.setBackground(new java.awt.Color(255, 204, 0));

        lblManageAnimalMA.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblManageAnimalMA.setForeground(new java.awt.Color(255, 255, 255));
        lblManageAnimalMA.setText("MANAGE ANIMALS");

        pnlIconManageAnimalLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/logooo (1).png"))); // NOI18N

        pnlIconManageAnimalLLA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/love (1).png"))); // NOI18N

        javax.swing.GroupLayout pnlManageAnimalTopLayout = new javax.swing.GroupLayout(pnlManageAnimalTop);
        pnlManageAnimalTop.setLayout(pnlManageAnimalTopLayout);
        pnlManageAnimalTopLayout.setHorizontalGroup(
            pnlManageAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManageAnimalTopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlIconManageAnimalLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(lblManageAnimalMA, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlIconManageAnimalLLA, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        pnlManageAnimalTopLayout.setVerticalGroup(
            pnlManageAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManageAnimalTopLayout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(lblManageAnimalMA)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManageAnimalTopLayout.createSequentialGroup()
                .addGroup(pnlManageAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlManageAnimalTopLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlIconManageAnimalLLA))
                    .addComponent(pnlIconManageAnimalLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlManageAnimalLeft.setBackground(new java.awt.Color(255, 204, 0));
        pnlManageAnimalLeft.setMaximumSize(new java.awt.Dimension(1100, 670));
        pnlManageAnimalLeft.setMinimumSize(new java.awt.Dimension(1100, 670));

        btnManageAnimalAllAnimal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManageAnimalAllAnimal.setText("All Animal");
        btnManageAnimalAllAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAnimalAllAnimalActionPerformed(evt);
            }
        });

        btnManageAnimalCustomerRequest1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManageAnimalCustomerRequest1.setText("Customer Request");
        btnManageAnimalCustomerRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAnimalCustomerRequest1ActionPerformed(evt);
            }
        });

        btnManageAnimaCustomermessages.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManageAnimaCustomermessages.setText("Customer messages");

        btnManageAnimalAboutUs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManageAnimalAboutUs.setText("About Us");
        btnManageAnimalAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAnimalAboutUsActionPerformed(evt);
            }
        });

        btnManageAnimalHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManageAnimalHome.setText("HOME");
        btnManageAnimalHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAnimalHomeActionPerformed(evt);
            }
        });

        btnManageAnimaLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManageAnimaLogout.setText("LOG OUT");
        btnManageAnimaLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAnimaLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlManageAnimalLeftLayout = new javax.swing.GroupLayout(pnlManageAnimalLeft);
        pnlManageAnimalLeft.setLayout(pnlManageAnimalLeftLayout);
        pnlManageAnimalLeftLayout.setHorizontalGroup(
            pnlManageAnimalLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageAnimalLeftLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlManageAnimalLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManageAnimalAboutUs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageAnimaCustomermessages, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(btnManageAnimalCustomerRequest1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageAnimalAllAnimal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageAnimalHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageAnimaLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlManageAnimalLeftLayout.setVerticalGroup(
            pnlManageAnimalLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageAnimalLeftLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnManageAnimalHome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnManageAnimalAllAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnManageAnimalCustomerRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnManageAnimaCustomermessages, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnManageAnimalAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnManageAnimaLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlManageAnimalLayout = new javax.swing.GroupLayout(pnlManageAnimal);
        pnlManageAnimal.setLayout(pnlManageAnimalLayout);
        pnlManageAnimalLayout.setHorizontalGroup(
            pnlManageAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManageAnimalLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlManageAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlManageAnimalLayout.createSequentialGroup()
                        .addComponent(pnlManageAnimalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManageAnimalLayout.createSequentialGroup()
                        .addComponent(pnlManageAnimalLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlManageAnimalMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        pnlManageAnimalLayout.setVerticalGroup(
            pnlManageAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManageAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlManageAnimalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlManageAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlManageAnimalMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlManageAnimalLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pnlAddAnimal.setBackground(new java.awt.Color(255, 255, 255));
        pnlAddAnimal.setMaximumSize(new java.awt.Dimension(1284, 695));
        pnlAddAnimal.setMinimumSize(new java.awt.Dimension(1284, 695));
        pnlAddAnimal.setPreferredSize(new java.awt.Dimension(1284, 695));

        lblAddAnimalTop.setBackground(new java.awt.Color(255, 204, 0));

        lblIconAddAnimalLLA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/love (1).png"))); // NOI18N

        lblIconAddAnimalLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/logooo (1).png"))); // NOI18N

        lblAddAnimalAddanimal.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblAddAnimalAddanimal.setForeground(new java.awt.Color(255, 255, 255));
        lblAddAnimalAddanimal.setText("ADD ANIMAL");

        javax.swing.GroupLayout lblAddAnimalTopLayout = new javax.swing.GroupLayout(lblAddAnimalTop);
        lblAddAnimalTop.setLayout(lblAddAnimalTopLayout);
        lblAddAnimalTopLayout.setHorizontalGroup(
            lblAddAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblAddAnimalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconAddAnimalLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddAnimalAddanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(lblIconAddAnimalLLA)
                .addGap(23, 23, 23))
        );
        lblAddAnimalTopLayout.setVerticalGroup(
            lblAddAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblAddAnimalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblAddAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblAddAnimalTopLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblAddAnimalAddanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(lblAddAnimalTopLayout.createSequentialGroup()
                        .addComponent(lblIconAddAnimalLogo)
                        .addGap(0, 30, Short.MAX_VALUE))))
            .addGroup(lblAddAnimalTopLayout.createSequentialGroup()
                .addComponent(lblIconAddAnimalLLA)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlAddAnimalBottom.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlAddAnimalBottomLayout = new javax.swing.GroupLayout(pnlAddAnimalBottom);
        pnlAddAnimalBottom.setLayout(pnlAddAnimalBottomLayout);
        pnlAddAnimalBottomLayout.setHorizontalGroup(
            pnlAddAnimalBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        pnlAddAnimalBottomLayout.setVerticalGroup(
            pnlAddAnimalBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        pnlAddAnimalBottomLeft.setBackground(new java.awt.Color(255, 204, 0));
        pnlAddAnimalBottomLeft.setMaximumSize(new java.awt.Dimension(245, 512));
        pnlAddAnimalBottomLeft.setMinimumSize(new java.awt.Dimension(245, 512));
        pnlAddAnimalBottomLeft.setPreferredSize(new java.awt.Dimension(245, 512));

        btnAddAnimalHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddAnimalHome.setText("HOME");
        btnAddAnimalHome.setMaximumSize(new java.awt.Dimension(115, 23));
        btnAddAnimalHome.setMinimumSize(new java.awt.Dimension(115, 23));
        btnAddAnimalHome.setPreferredSize(new java.awt.Dimension(115, 23));
        btnAddAnimalHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnimalHomeActionPerformed(evt);
            }
        });

        btnAddAnimalAllAnimal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddAnimalAllAnimal.setText("All Animals");
        btnAddAnimalAllAnimal.setPreferredSize(new java.awt.Dimension(115, 23));
        btnAddAnimalAllAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnimalAllAnimalActionPerformed(evt);
            }
        });

        btnAddAnimalManageAnimal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddAnimalManageAnimal.setText("Manage Animal");
        btnAddAnimalManageAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnimalManageAnimalActionPerformed(evt);
            }
        });

        btnAddAnimalLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddAnimalLogout.setText("LOG OUT");
        btnAddAnimalLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnimalLogoutActionPerformed(evt);
            }
        });

        btnAddAnimalAboutUs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddAnimalAboutUs.setText("ABOUT US");
        btnAddAnimalAboutUs.setPreferredSize(new java.awt.Dimension(72, 23));
        btnAddAnimalAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnimalAboutUsActionPerformed(evt);
            }
        });

        btnAddAnimalHistory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddAnimalHistory.setText("History");

        btnAddAnimalCustomerMessages.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddAnimalCustomerMessages.setText("Customer messages");
        btnAddAnimalCustomerMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnimalCustomerMessagesActionPerformed(evt);
            }
        });

        btnAddAnimalCustomerRequest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddAnimalCustomerRequest.setText("Customer Request");
        btnAddAnimalCustomerRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnimalCustomerRequestActionPerformed(evt);
            }
        });

        btnAddAnimalBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddAnimalBack.setText("Back");
        btnAddAnimalBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnimalBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddAnimalBottomLeftLayout = new javax.swing.GroupLayout(pnlAddAnimalBottomLeft);
        pnlAddAnimalBottomLeft.setLayout(pnlAddAnimalBottomLeftLayout);
        pnlAddAnimalBottomLeftLayout.setHorizontalGroup(
            pnlAddAnimalBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddAnimalBottomLeftLayout.createSequentialGroup()
                .addGroup(pnlAddAnimalBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddAnimalBottomLeftLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnAddAnimalBack))
                    .addGroup(pnlAddAnimalBottomLeftLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnlAddAnimalBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddAnimalAllAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddAnimalHome, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddAnimalManageAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddAnimalCustomerMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddAnimalCustomerRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddAnimalHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddAnimalAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddAnimalLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pnlAddAnimalBottomLeftLayout.setVerticalGroup(
            pnlAddAnimalBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddAnimalBottomLeftLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnAddAnimalHome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnAddAnimalAllAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddAnimalManageAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddAnimalCustomerMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddAnimalCustomerRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddAnimalHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddAnimalAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnAddAnimalLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddAnimalBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddAnimalImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddAnimalImage.setText(" Image");

        btnAddAnimalAdd.setBackground(new java.awt.Color(255, 204, 0));
        btnAddAnimalAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddAnimalAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAnimalAdd.setText("ADD");
        btnAddAnimalAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnimalAddActionPerformed(evt);
            }
        });

        lblAddAnimalDescription.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAnimalDescription.setText("Description");

        lblAddAnimalPetCategory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAnimalPetCategory.setText("Pet Category");

        lblAddAnimalAge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAnimalAge.setText("Age");

        lblAddAnimalColor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAnimalColor.setText("Color");

        lblAddAnimalAdoptiionFees.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAnimalAdoptiionFees.setText("Adoption Fees");

        lblAddAnimalName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAnimalName.setText("Name");

        lblAddAnimalGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAnimalGender.setText("Gender");

        lblAddAnimalBreed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAnimalBreed.setText("Breed");

        pnlIconAddAnimalImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/GERMANSEPHERD (1).jpg"))); // NOI18N
        pnlIconAddAnimalImage.setText("jLabel27");

        lblAddAnimalSize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAnimalSize.setText("Size");

        txtFldAddAnimalAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldAddAnimalAgeActionPerformed(evt);
            }
        });

        lblAddAnimalName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddAnimalName1.setText("Pet Id");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dog", "Cat", "Bird", "Fish" }));

        sizeSlider.setMaximum(3);
        sizeSlider.setMinimum(1);
        sizeSlider.setPaintLabels(true);
        sizeSlider.setPaintTicks(true);
        sizeSlider.setSnapToTicks(true);
        sizeSlider.setValue(1);

        buttonGroup1.add(btnMale);
        btnMale.setText("Male");

        buttonGroup1.add(btnFemale);
        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });

        jLabel3.setText("S");

        jLabel4.setText("L");

        jLabel6.setText("M");

        javax.swing.GroupLayout pnlAddAnimalBottomMiddleLayout = new javax.swing.GroupLayout(pnlAddAnimalBottomMiddle);
        pnlAddAnimalBottomMiddle.setLayout(pnlAddAnimalBottomMiddleLayout);
        pnlAddAnimalBottomMiddleLayout.setHorizontalGroup(
            pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                        .addComponent(pnlIconAddAnimalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                                .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddAnimalBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAddAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAddAnimalPetCategory))
                                    .addComponent(lblAddAnimalAge, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddAnimalGender, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddAnimalColor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddAnimalSize, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddAnimalDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddAnimalAdoptiionFees, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                                        .addComponent(sizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(58, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                                        .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnAddAnimalAdd))
                                            .addComponent(txtFldAddAnimalDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6)
                                                .addGap(75, 75, 75)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtFldAddAnimalAdoptionFees)
                                            .addComponent(txtFldAddAnimalColor)
                                            .addGroup(pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                                                .addComponent(btnMale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnFemale))
                                            .addComponent(txtFldAddAnimalAge)
                                            .addComponent(txtFldAddAnimalBreed)
                                            .addComponent(txtFldAddAnimalName)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(45, 45, 45))))
                            .addGroup(pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                                .addComponent(lblAddAnimalName1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFldAddAnimalName1)
                                .addGap(45, 45, 45))))
                    .addGroup(pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                        .addComponent(btnAddAnimalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        pnlAddAnimalBottomMiddleLayout.setVerticalGroup(
            pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                        .addComponent(pnlIconAddAnimalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddAnimalImage))
                    .addGroup(pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlAddAnimalBottomMiddleLayout.createSequentialGroup()
                                .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAddAnimalName1)
                                    .addComponent(txtFldAddAnimalName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFldAddAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddAnimalName))
                                .addGap(9, 9, 9)
                                .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAddAnimalPetCategory)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAddAnimalBreed)
                                    .addComponent(txtFldAddAnimalBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFldAddAnimalAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddAnimalAge))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnMale)
                                        .addComponent(btnFemale))
                                    .addComponent(lblAddAnimalGender))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFldAddAnimalColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddAnimalColor))
                                .addGap(34, 34, 34))
                            .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAddAnimalSize)
                                .addComponent(sizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFldAddAnimalAdoptionFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddAnimalAdoptiionFees))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAddAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFldAddAnimalDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddAnimalDescription))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddAnimalAdd)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlIconAddAnimalWoofs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/woofs.png.png"))); // NOI18N

        javax.swing.GroupLayout pnlAddAnimalBottomRightLayout = new javax.swing.GroupLayout(pnlAddAnimalBottomRight);
        pnlAddAnimalBottomRight.setLayout(pnlAddAnimalBottomRightLayout);
        pnlAddAnimalBottomRightLayout.setHorizontalGroup(
            pnlAddAnimalBottomRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddAnimalBottomRightLayout.createSequentialGroup()
                .addComponent(pnlIconAddAnimalWoofs, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        pnlAddAnimalBottomRightLayout.setVerticalGroup(
            pnlAddAnimalBottomRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddAnimalBottomRightLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(pnlIconAddAnimalWoofs, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlAddAnimalLayout = new javax.swing.GroupLayout(pnlAddAnimal);
        pnlAddAnimal.setLayout(pnlAddAnimalLayout);
        pnlAddAnimalLayout.setHorizontalGroup(
            pnlAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAddAnimalLayout.createSequentialGroup()
                        .addComponent(pnlAddAnimalBottomLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlAddAnimalBottomMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlAddAnimalBottomRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblAddAnimalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAddAnimalBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAddAnimalLayout.setVerticalGroup(
            pnlAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddAnimalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAddAnimalBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlAddAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddAnimalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(pnlAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAddAnimalBottomRight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAddAnimalBottomLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAddAnimalBottomMiddle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pnlEditAnimal.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditAnimal.setMaximumSize(new java.awt.Dimension(1284, 695));
        pnlEditAnimal.setMinimumSize(new java.awt.Dimension(1284, 695));
        pnlEditAnimal.setPreferredSize(new java.awt.Dimension(1284, 695));

        pnlEditAnimalBottom.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlEditAnimalBottomLayout = new javax.swing.GroupLayout(pnlEditAnimalBottom);
        pnlEditAnimalBottom.setLayout(pnlEditAnimalBottomLayout);
        pnlEditAnimalBottomLayout.setHorizontalGroup(
            pnlEditAnimalBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pnlEditAnimalBottomLayout.setVerticalGroup(
            pnlEditAnimalBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        pnlEditAnimalTop.setBackground(new java.awt.Color(255, 204, 0));

        lblIconEditAnimalLLA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/love (1).png"))); // NOI18N

        lblIconEditAnimalLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/logooo (1).png"))); // NOI18N

        lblEditAnimalUpdateAnimalInformation.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        lblEditAnimalUpdateAnimalInformation.setForeground(new java.awt.Color(255, 255, 255));
        lblEditAnimalUpdateAnimalInformation.setText("UPDATE ANIMAL INFORMATION");

        javax.swing.GroupLayout pnlEditAnimalTopLayout = new javax.swing.GroupLayout(pnlEditAnimalTop);
        pnlEditAnimalTop.setLayout(pnlEditAnimalTopLayout);
        pnlEditAnimalTopLayout.setHorizontalGroup(
            pnlEditAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconEditAnimalLogo)
                .addGap(18, 18, 18)
                .addComponent(lblEditAnimalUpdateAnimalInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblIconEditAnimalLLA, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        pnlEditAnimalTopLayout.setVerticalGroup(
            pnlEditAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalTopLayout.createSequentialGroup()
                .addGroup(pnlEditAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditAnimalTopLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlEditAnimalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEditAnimalUpdateAnimalInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIconEditAnimalLogo)))
                    .addGroup(pnlEditAnimalTopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIconEditAnimalLLA)))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/woofs.png.png"))); // NOI18N

        javax.swing.GroupLayout pnlEditAnimalBottomRightLayout = new javax.swing.GroupLayout(pnlEditAnimalBottomRight);
        pnlEditAnimalBottomRight.setLayout(pnlEditAnimalBottomRightLayout);
        pnlEditAnimalBottomRightLayout.setHorizontalGroup(
            pnlEditAnimalBottomRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomRightLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlEditAnimalBottomRightLayout.setVerticalGroup(
            pnlEditAnimalBottomRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomRightLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblEditAnimalDescription.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalDescription.setText("Description");

        lblEditAnimalPetCategory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalPetCategory.setText("Pet Category");

        lblEditAnimalPetID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalPetID.setText("Pet ID");

        lblEditAnimalAge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalAge.setText("Age");

        lblEditAnimalColor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalColor.setText("Color");

        lblEditAnimalGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalGender.setText("Gender");

        lblEditAnimalName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalName.setText("Name");

        lblEditAnimalSize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalSize.setText("Size");

        lblEditAnimalBreed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalBreed.setText("Breed");

        lblIconEditAnimalImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/GERMANSEPHERD (1).jpg"))); // NOI18N
        lblIconEditAnimalImage.setText("jLabel27");

        lblEditAnimalAdoptionFee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalAdoptionFee.setText("Adoption Fees");

        txtFldEditAnimalAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldEditAnimalAgeActionPerformed(evt);
            }
        });

        txtFldEditAnimalPetID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldEditAnimalPetIDActionPerformed(evt);
            }
        });

        btnEditAnimalImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalImage.setText(" Image");

        btnEditAnimalSave.setBackground(new java.awt.Color(255, 204, 0));
        btnEditAnimalSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalSave.setForeground(new java.awt.Color(255, 255, 255));
        btnEditAnimalSave.setText("SAVE");
        btnEditAnimalSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalSaveActionPerformed(evt);
            }
        });

        btnEditAnimalCheck.setBackground(new java.awt.Color(102, 204, 0));
        btnEditAnimalCheck.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnEditAnimalCheck.setText("Check");
        btnEditAnimalCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalCheckActionPerformed(evt);
            }
        });

        btnEditAnimalDelete.setBackground(new java.awt.Color(204, 0, 51));
        btnEditAnimalDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnEditAnimalDelete.setText("DELETE");
        btnEditAnimalDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalDeleteActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dog", "Cat", "Bird", "Fish" }));

        buttonGroup2.add(btnMale1);
        btnMale1.setText("Male");

        buttonGroup2.add(btnFemale1);
        btnFemale1.setText("Female");
        btnFemale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemale1ActionPerformed(evt);
            }
        });

        sizeSlider1.setMaximum(3);
        sizeSlider1.setMinimum(1);
        sizeSlider1.setPaintLabels(true);
        sizeSlider1.setPaintTicks(true);
        sizeSlider1.setSnapToTicks(true);
        sizeSlider1.setValue(1);

        jLabel10.setText("S");

        jLabel11.setText("M");

        jLabel12.setText("L");

        javax.swing.GroupLayout pnlEditAnimalBottomMiddleLayout = new javax.swing.GroupLayout(pnlEditAnimalBottomMiddle);
        pnlEditAnimalBottomMiddle.setLayout(pnlEditAnimalBottomMiddleLayout);
        pnlEditAnimalBottomMiddleLayout.setHorizontalGroup(
            pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                        .addComponent(lblIconEditAnimalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblEditAnimalPetID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldEditAnimalPetID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                        .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEditAnimalBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEditAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEditAnimalPetCategory))
                                    .addComponent(lblEditAnimalAge, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEditAnimalGender, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEditAnimalColor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEditAnimalDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnEditAnimalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditAnimalSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditAnimalAdoptionFee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                                .addComponent(btnMale1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFemale1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                                .addComponent(txtFldEditAnimalAdoptionFees, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addGroup(pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                                .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel11)
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnEditAnimalCheck)
                                    .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(sizeSlider1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                                            .addComponent(btnEditAnimalDelete)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnEditAnimalSave))
                                        .addComponent(txtFldEditAnimalName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(txtFldEditAnimalAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(txtFldEditAnimalColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(txtFldEditAnimalDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(txtFldEditAnimalBreed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlEditAnimalBottomMiddleLayout.setVerticalGroup(
            pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                        .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFldEditAnimalPetID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEditAnimalCheck))
                            .addComponent(lblEditAnimalPetID, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFldEditAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditAnimalName))
                        .addGap(9, 9, 9)
                        .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditAnimalPetCategory)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditAnimalBreed)
                            .addComponent(txtFldEditAnimalBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFldEditAnimalAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditAnimalAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditAnimalGender)
                            .addComponent(btnMale1)
                            .addComponent(btnFemale1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEditAnimalColor)
                            .addComponent(txtFldEditAnimalColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlEditAnimalBottomMiddleLayout.createSequentialGroup()
                        .addComponent(lblIconEditAnimalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditAnimalImage)))
                .addGap(17, 17, 17)
                .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditAnimalSize)
                    .addComponent(sizeSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditAnimalAdoptionFee)
                    .addComponent(txtFldEditAnimalAdoptionFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditAnimalDescription)
                    .addComponent(txtFldEditAnimalDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pnlEditAnimalBottomMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditAnimalDelete)
                    .addComponent(btnEditAnimalSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEditAnimalBottomLeft.setBackground(new java.awt.Color(255, 204, 0));

        btnEditAnimalHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalHome.setText("HOME");
        btnEditAnimalHome.setMaximumSize(new java.awt.Dimension(115, 23));
        btnEditAnimalHome.setMinimumSize(new java.awt.Dimension(115, 23));
        btnEditAnimalHome.setPreferredSize(new java.awt.Dimension(115, 23));
        btnEditAnimalHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalHomeActionPerformed(evt);
            }
        });

        btnEditAnimalAllAnimal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalAllAnimal.setText("All Animals");
        btnEditAnimalAllAnimal.setMaximumSize(new java.awt.Dimension(115, 23));
        btnEditAnimalAllAnimal.setMinimumSize(new java.awt.Dimension(115, 23));
        btnEditAnimalAllAnimal.setPreferredSize(new java.awt.Dimension(115, 23));
        btnEditAnimalAllAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalAllAnimalActionPerformed(evt);
            }
        });

        btnEditAnimalManageAnimal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalManageAnimal.setText("Manage Animal");
        btnEditAnimalManageAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalManageAnimalActionPerformed(evt);
            }
        });

        btnEditAnimalCustomerRequest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalCustomerRequest.setText("Customer Request");
        btnEditAnimalCustomerRequest.setPreferredSize(new java.awt.Dimension(115, 23));
        btnEditAnimalCustomerRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalCustomerRequestActionPerformed(evt);
            }
        });

        btnEditAnimalCustomerMessages.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalCustomerMessages.setText("Customer messages");
        btnEditAnimalCustomerMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalCustomerMessagesActionPerformed(evt);
            }
        });

        btnEditAnimalHistory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalHistory.setText("History");

        btnEditAnimalLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalLogout.setText("LOG OUT");
        btnEditAnimalLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalLogoutActionPerformed(evt);
            }
        });

        btnEditAnimalAboutUs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalAboutUs.setText("ABOUT US");
        btnEditAnimalAboutUs.setPreferredSize(new java.awt.Dimension(72, 23));
        btnEditAnimalAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalAboutUsActionPerformed(evt);
            }
        });

        btnEditAnimalBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalBack.setText("Back");
        btnEditAnimalBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEditAnimalBottomLeftLayout = new javax.swing.GroupLayout(pnlEditAnimalBottomLeft);
        pnlEditAnimalBottomLeft.setLayout(pnlEditAnimalBottomLeftLayout);
        pnlEditAnimalBottomLeftLayout.setHorizontalGroup(
            pnlEditAnimalBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditAnimalBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditAnimalHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditAnimalLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditAnimalAboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditAnimalCustomerMessages, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(btnEditAnimalCustomerRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditAnimalManageAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditAnimalAllAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditAnimalBottomLeftLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditAnimalBack))
                    .addComponent(btnEditAnimalHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEditAnimalBottomLeftLayout.setVerticalGroup(
            pnlEditAnimalBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditAnimalHome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditAnimalAllAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditAnimalManageAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditAnimalCustomerRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditAnimalCustomerMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditAnimalHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditAnimalAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnEditAnimalLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditAnimalBack)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlEditAnimalLayout = new javax.swing.GroupLayout(pnlEditAnimal);
        pnlEditAnimal.setLayout(pnlEditAnimalLayout);
        pnlEditAnimalLayout.setHorizontalGroup(
            pnlEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlEditAnimalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlEditAnimalLayout.createSequentialGroup()
                        .addComponent(pnlEditAnimalBottomLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlEditAnimalBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlEditAnimalBottomMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(pnlEditAnimalBottomRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        pnlEditAnimalLayout.setVerticalGroup(
            pnlEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalLayout.createSequentialGroup()
                .addComponent(pnlEditAnimalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditAnimalLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(pnlEditAnimalBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEditAnimalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlEditAnimalBottomMiddle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlEditAnimalBottomLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlEditAnimalBottomRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        pnlIconAllAnimaLeftPanel1.setBackground(new java.awt.Color(255, 204, 0));
        pnlIconAllAnimaLeftPanel1.setMaximumSize(new java.awt.Dimension(1100, 670));
        pnlIconAllAnimaLeftPanel1.setMinimumSize(new java.awt.Dimension(1100, 670));

        btnAllAnimalManageAnimal1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalManageAnimal1.setText("Manage Animal");
        btnAllAnimalManageAnimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAnimalManageAnimal1ActionPerformed(evt);
            }
        });

        btnAllAnimalCustomerRequest1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalCustomerRequest1.setText("Customer Request");
        btnAllAnimalCustomerRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAnimalCustomerRequest1ActionPerformed(evt);
            }
        });

        btnAllAnimalCustomermessages1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalCustomermessages1.setText("Customer messages");
        btnAllAnimalCustomermessages1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAnimalCustomermessages1ActionPerformed(evt);
            }
        });

        btnAllAnimalAboutUs1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalAboutUs1.setText("About Us");
        btnAllAnimalAboutUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAnimalAboutUs1ActionPerformed(evt);
            }
        });

        btnAllAnimalHome1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalHome1.setText("HOME");
        btnAllAnimalHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAnimalHome1ActionPerformed(evt);
            }
        });

        btnAllAnimalLogout1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllAnimalLogout1.setText("LOG OUT");
        btnAllAnimalLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAnimalLogout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIconAllAnimaLeftPanel1Layout = new javax.swing.GroupLayout(pnlIconAllAnimaLeftPanel1);
        pnlIconAllAnimaLeftPanel1.setLayout(pnlIconAllAnimaLeftPanel1Layout);
        pnlIconAllAnimaLeftPanel1Layout.setHorizontalGroup(
            pnlIconAllAnimaLeftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconAllAnimaLeftPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlIconAllAnimaLeftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAllAnimalLogout1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllAnimalManageAnimal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllAnimalAboutUs1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllAnimalCustomermessages1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnAllAnimalCustomerRequest1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllAnimalHome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlIconAllAnimaLeftPanel1Layout.setVerticalGroup(
            pnlIconAllAnimaLeftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconAllAnimaLeftPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnAllAnimalHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAllAnimalManageAnimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnAllAnimalCustomerRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAllAnimalCustomermessages1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnAllAnimalAboutUs1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAllAnimalLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pet ID", "Name", "Pet category", "Breed", "Age", "Gender", "Color", "Size", "Adoption Fees", "Pet Description"
            }
        ));
        scrlpaneAllAnimalAnimalList1.setViewportView(jTable12);

        pnlAllAnimalTop2.setBackground(new java.awt.Color(255, 204, 0));

        lblAllAnimalAL2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblAllAnimalAL2.setForeground(new java.awt.Color(255, 255, 255));
        lblAllAnimalAL2.setText("Customer Requests");

        pnlIconAllAnimalLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/logooo (1).png"))); // NOI18N

        pnlIconAllAnimaLLA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/love (1).png"))); // NOI18N

        javax.swing.GroupLayout pnlAllAnimalTop2Layout = new javax.swing.GroupLayout(pnlAllAnimalTop2);
        pnlAllAnimalTop2.setLayout(pnlAllAnimalTop2Layout);
        pnlAllAnimalTop2Layout.setHorizontalGroup(
            pnlAllAnimalTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAllAnimalTop2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlIconAllAnimalLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(lblAllAnimalAL2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(pnlIconAllAnimaLLA2)
                .addGap(33, 33, 33))
        );
        pnlAllAnimalTop2Layout.setVerticalGroup(
            pnlAllAnimalTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAllAnimalTop2Layout.createSequentialGroup()
                .addGroup(pnlAllAnimalTop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAllAnimalTop2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlIconAllAnimaLLA2))
                    .addComponent(pnlIconAllAnimalLogo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAllAnimalTop2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAllAnimalAL2)
                .addGap(41, 41, 41))
        );

        jButton1.setText("Review");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCustomerRequestsLayout = new javax.swing.GroupLayout(pnlCustomerRequests);
        pnlCustomerRequests.setLayout(pnlCustomerRequestsLayout);
        pnlCustomerRequestsLayout.setHorizontalGroup(
            pnlCustomerRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerRequestsLayout.createSequentialGroup()
                .addGroup(pnlCustomerRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlAllAnimalTop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCustomerRequestsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlIconAllAnimaLeftPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCustomerRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrlpaneAllAnimalAnimalList1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCustomerRequestsLayout.setVerticalGroup(
            pnlCustomerRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCustomerRequestsLayout.createSequentialGroup()
                .addComponent(pnlAllAnimalTop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCustomerRequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlIconAllAnimaLeftPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCustomerRequestsLayout.createSequentialGroup()
                        .addComponent(scrlpaneAllAnimalAnimalList1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(20, 20, 20))
        );

        pnlEditAnimalTop1.setBackground(new java.awt.Color(255, 204, 0));

        lblIconEditAnimalLLA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/love (1).png"))); // NOI18N

        lblIconEditAnimalLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/logooo (1).png"))); // NOI18N

        lblEditAnimalUpdateAnimalInformation1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblEditAnimalUpdateAnimalInformation1.setForeground(new java.awt.Color(255, 255, 255));
        lblEditAnimalUpdateAnimalInformation1.setText("Customer Request");

        javax.swing.GroupLayout pnlEditAnimalTop1Layout = new javax.swing.GroupLayout(pnlEditAnimalTop1);
        pnlEditAnimalTop1.setLayout(pnlEditAnimalTop1Layout);
        pnlEditAnimalTop1Layout.setHorizontalGroup(
            pnlEditAnimalTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalTop1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconEditAnimalLogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEditAnimalUpdateAnimalInformation1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(lblIconEditAnimalLLA1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlEditAnimalTop1Layout.setVerticalGroup(
            pnlEditAnimalTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalTop1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditAnimalTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIconEditAnimalLLA1)
                    .addGroup(pnlEditAnimalTop1Layout.createSequentialGroup()
                        .addGroup(pnlEditAnimalTop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEditAnimalUpdateAnimalInformation1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIconEditAnimalLogo1))
                        .addGap(30, 30, 30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEditAnimalBottom1.setBackground(new java.awt.Color(255, 255, 255));

        lblEditAnimalDescription1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalDescription1.setText("Description");

        lblEditAnimalPetCategory1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalPetCategory1.setText("Pet Category");

        lblEditAnimalPetID1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalPetID1.setText("Pet ID");

        lblEditAnimalAge1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalAge1.setText("Age");

        lblEditAnimalColor1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalColor1.setText("Color");

        lblEditAnimalGender1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalGender1.setText("Gender");

        lblEditAnimalName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalName1.setText("Name");

        lblEditAnimalSize1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalSize1.setText("Size");

        lblEditAnimalBreed1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalBreed1.setText("Breed");

        lblIconEditAnimalImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/GERMANSEPHERD (1).jpg"))); // NOI18N
        lblIconEditAnimalImage1.setText("jLabel27");

        lblEditAnimalAdoptionFee1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEditAnimalAdoptionFee1.setText("Adoption Fees");

        txtFldEditAnimalAge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldEditAnimalAge1ActionPerformed(evt);
            }
        });

        txtFldEditAnimalGender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldEditAnimalGender1ActionPerformed(evt);
            }
        });

        txtFldEditAnimalPetID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldEditAnimalPetID1ActionPerformed(evt);
            }
        });

        btnEditAnimalImage1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalImage1.setText(" Image");

        btnEditAnimalSave1.setBackground(new java.awt.Color(102, 204, 0));
        btnEditAnimalSave1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalSave1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditAnimalSave1.setText("APPROVE");
        btnEditAnimalSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalSave1ActionPerformed(evt);
            }
        });

        btnEditAnimalCheck1.setBackground(new java.awt.Color(102, 204, 0));
        btnEditAnimalCheck1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalCheck1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditAnimalCheck1.setText("Check");
        btnEditAnimalCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalCheck1ActionPerformed(evt);
            }
        });

        btnEditAnimalDelete1.setBackground(new java.awt.Color(204, 0, 51));
        btnEditAnimalDelete1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditAnimalDelete1.setText("DELETE");
        btnEditAnimalDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEditAnimalBottomMiddle1Layout = new javax.swing.GroupLayout(pnlEditAnimalBottomMiddle1);
        pnlEditAnimalBottomMiddle1.setLayout(pnlEditAnimalBottomMiddle1Layout);
        pnlEditAnimalBottomMiddle1Layout.setHorizontalGroup(
            pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomMiddle1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditAnimalImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEditAnimalBottomMiddle1Layout.createSequentialGroup()
                            .addComponent(lblIconEditAnimalImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(lblEditAnimalPetID1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFldEditAnimalPetID1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditAnimalCheck1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEditAnimalBottomMiddle1Layout.createSequentialGroup()
                            .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEditAnimalSize1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlEditAnimalBottomMiddle1Layout.createSequentialGroup()
                                    .addGap(181, 181, 181)
                                    .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblEditAnimalBreed1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEditAnimalName1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEditAnimalPetCategory1))
                                        .addComponent(lblEditAnimalAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEditAnimalGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEditAnimalColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEditAnimalAdoptionFee1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEditAnimalDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFldEditAnimalPetCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFldEditAnimalName1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFldEditAnimalAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFldEditAnimalGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFldEditAnimalColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFldEditAnimalSize1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFldEditAnimalAdoptionFees1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFldEditAnimalDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFldEditAnimalBreed1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditAnimalBottomMiddle1Layout.createSequentialGroup()
                                    .addComponent(btnEditAnimalSave1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditAnimalDelete1))))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pnlEditAnimalBottomMiddle1Layout.setVerticalGroup(
            pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomMiddle1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditAnimalBottomMiddle1Layout.createSequentialGroup()
                        .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFldEditAnimalPetID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEditAnimalCheck1))
                            .addComponent(lblEditAnimalPetID1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFldEditAnimalName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditAnimalName1))
                        .addGap(9, 9, 9)
                        .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditAnimalPetCategory1)
                            .addComponent(txtFldEditAnimalPetCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditAnimalBreed1)
                            .addComponent(txtFldEditAnimalBreed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFldEditAnimalAge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditAnimalAge1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFldEditAnimalGender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditAnimalGender1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEditAnimalColor1)
                            .addComponent(txtFldEditAnimalColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlEditAnimalBottomMiddle1Layout.createSequentialGroup()
                        .addComponent(lblIconEditAnimalImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditAnimalImage1)))
                .addGap(15, 15, 15)
                .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldEditAnimalSize1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditAnimalSize1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditAnimalAdoptionFee1)
                    .addComponent(txtFldEditAnimalAdoptionFees1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditAnimalBottomMiddle1Layout.createSequentialGroup()
                        .addComponent(txtFldEditAnimalDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlEditAnimalBottomMiddle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditAnimalDelete1)
                            .addComponent(btnEditAnimalSave1)))
                    .addComponent(lblEditAnimalDescription1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEditAnimalBottomLeft1.setBackground(new java.awt.Color(255, 204, 0));

        btnEditAnimalHome1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalHome1.setText("HOME");
        btnEditAnimalHome1.setMaximumSize(new java.awt.Dimension(115, 23));
        btnEditAnimalHome1.setMinimumSize(new java.awt.Dimension(115, 23));
        btnEditAnimalHome1.setPreferredSize(new java.awt.Dimension(115, 23));
        btnEditAnimalHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalHome1ActionPerformed(evt);
            }
        });

        btnEditAnimalAllAnimal1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalAllAnimal1.setText("All Animals");
        btnEditAnimalAllAnimal1.setMaximumSize(new java.awt.Dimension(115, 23));
        btnEditAnimalAllAnimal1.setMinimumSize(new java.awt.Dimension(115, 23));
        btnEditAnimalAllAnimal1.setPreferredSize(new java.awt.Dimension(115, 23));
        btnEditAnimalAllAnimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalAllAnimal1ActionPerformed(evt);
            }
        });

        btnEditAnimalManageAnimal1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalManageAnimal1.setText("Manage Animal");
        btnEditAnimalManageAnimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalManageAnimal1ActionPerformed(evt);
            }
        });

        btnEditAnimalHistory1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalHistory1.setText("History");

        btnEditAnimalLogout1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalLogout1.setText("LOG OUT");
        btnEditAnimalLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalLogout1ActionPerformed(evt);
            }
        });

        btnEditAnimalAboutUs1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalAboutUs1.setText("ABOUT US");
        btnEditAnimalAboutUs1.setPreferredSize(new java.awt.Dimension(72, 23));
        btnEditAnimalAboutUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalAboutUs1ActionPerformed(evt);
            }
        });

        btnEditAnimalBack1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditAnimalBack1.setText("Back");
        btnEditAnimalBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEditAnimalBottomLeft1Layout = new javax.swing.GroupLayout(pnlEditAnimalBottomLeft1);
        pnlEditAnimalBottomLeft1.setLayout(pnlEditAnimalBottomLeft1Layout);
        pnlEditAnimalBottomLeft1Layout.setHorizontalGroup(
            pnlEditAnimalBottomLeft1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomLeft1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditAnimalBottomLeft1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditAnimalHome1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditAnimalLogout1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditAnimalAboutUs1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditAnimalManageAnimal1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(btnEditAnimalAllAnimal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditAnimalBottomLeft1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditAnimalBack1))
                    .addComponent(btnEditAnimalHistory1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEditAnimalBottomLeft1Layout.setVerticalGroup(
            pnlEditAnimalBottomLeft1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomLeft1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnEditAnimalHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEditAnimalAllAnimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEditAnimalManageAnimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnEditAnimalHistory1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnEditAnimalAboutUs1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnEditAnimalLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditAnimalBack1)
                .addGap(12, 12, 12))
        );

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/woofs.png.png"))); // NOI18N

        javax.swing.GroupLayout pnlEditAnimalBottomRight1Layout = new javax.swing.GroupLayout(pnlEditAnimalBottomRight1);
        pnlEditAnimalBottomRight1.setLayout(pnlEditAnimalBottomRight1Layout);
        pnlEditAnimalBottomRight1Layout.setHorizontalGroup(
            pnlEditAnimalBottomRight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomRight1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEditAnimalBottomRight1Layout.setVerticalGroup(
            pnlEditAnimalBottomRight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottomRight1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlEditAnimalBottom1Layout = new javax.swing.GroupLayout(pnlEditAnimalBottom1);
        pnlEditAnimalBottom1.setLayout(pnlEditAnimalBottom1Layout);
        pnlEditAnimalBottom1Layout.setHorizontalGroup(
            pnlEditAnimalBottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottom1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEditAnimalBottomLeft1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEditAnimalBottomMiddle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlEditAnimalBottomRight1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEditAnimalBottom1Layout.setVerticalGroup(
            pnlEditAnimalBottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditAnimalBottom1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEditAnimalBottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditAnimalBottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlEditAnimalBottomMiddle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlEditAnimalBottomRight1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlEditAnimalBottomLeft1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCustomerRequestLayout = new javax.swing.GroupLayout(pnlCustomerRequest);
        pnlCustomerRequest.setLayout(pnlCustomerRequestLayout);
        pnlCustomerRequestLayout.setHorizontalGroup(
            pnlCustomerRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerRequestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCustomerRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlEditAnimalBottom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEditAnimalTop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCustomerRequestLayout.setVerticalGroup(
            pnlCustomerRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCustomerRequestLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(pnlEditAnimalTop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEditAnimalBottom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSignUp.setBackground(new java.awt.Color(105, 192, 217));
        pnlSignUp.setForeground(new java.awt.Color(105, 192, 217));
        pnlSignUp.setMaximumSize(new java.awt.Dimension(1100, 670));
        pnlSignUp.setMinimumSize(new java.awt.Dimension(1100, 670));
        pnlSignUp.setPreferredSize(new java.awt.Dimension(1100, 670));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Create a new Account");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setText("First Name");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel15.setText("Age");

        jLabel16.setText("Username");

        jLabel17.setText("Password");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel18.setText("Contact Number");

        jLabel19.setText("Gender");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(180, 50, 43));
        jButton2.setText("Sign up");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/woofs.png.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/love (1).png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/logooo (1).png"))); // NOI18N

        javax.swing.GroupLayout pnlSignUpLayout = new javax.swing.GroupLayout(pnlSignUp);
        pnlSignUp.setLayout(pnlSignUpLayout);
        pnlSignUpLayout.setHorizontalGroup(
            pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSignUpLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(412, 412, 412)
                        .addComponent(jLabel9))
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlSignUpLayout.setVerticalGroup(
            pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSignUpLayout.createSequentialGroup()
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 670));
        setSize(new java.awt.Dimension(1100, 670));

        pnlWelcome.setBackground(new java.awt.Color(255, 255, 255));
        pnlWelcome.setMaximumSize(new java.awt.Dimension(1100, 670));
        pnlWelcome.setMinimumSize(new java.awt.Dimension(1100, 670));

        lblIconWelcomeWoofs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/woofs.png.png"))); // NOI18N

        lblIconWelcomeLLA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/love (1).png"))); // NOI18N

        lblIconWelcomeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/logooo (1).png"))); // NOI18N

        lblIconWelcomeWTWAW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/WELCOME (1).png"))); // NOI18N

        lblIconWelcomeClickHere.setBackground(new java.awt.Color(255, 255, 255));

        lblIconWelcomeClick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/petadoptionapp/views/WELCOMEEEE (1).png"))); // NOI18N

        btnWelcomeLogin.setBackground(new java.awt.Color(153, 0, 0));
        btnWelcomeLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnWelcomeLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnWelcomeLogin.setText("LOGIN");
        btnWelcomeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWelcomeLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblIconWelcomeClickHereLayout = new javax.swing.GroupLayout(lblIconWelcomeClickHere);
        lblIconWelcomeClickHere.setLayout(lblIconWelcomeClickHereLayout);
        lblIconWelcomeClickHereLayout.setHorizontalGroup(
            lblIconWelcomeClickHereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblIconWelcomeClickHereLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconWelcomeClick, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnWelcomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblIconWelcomeClickHereLayout.setVerticalGroup(
            lblIconWelcomeClickHereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblIconWelcomeClickHereLayout.createSequentialGroup()
                .addGroup(lblIconWelcomeClickHereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblIconWelcomeClickHereLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIconWelcomeClick, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblIconWelcomeClickHereLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnWelcomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblIconWelcomeWoofs, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblIconWelcomeLogo)))
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIconWelcomeWTWAW)
                        .addGap(131, 131, 131))
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                                .addGap(465, 465, 465)
                                .addComponent(lblIconWelcomeLLA))
                            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblIconWelcomeClickHere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(65, Short.MAX_VALUE))))
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addComponent(lblIconWelcomeLogo)
                        .addGap(54, 54, 54)
                        .addComponent(lblIconWelcomeWoofs, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addComponent(lblIconWelcomeLLA, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblIconWelcomeWTWAW)
                        .addGap(74, 74, 74)
                        .addComponent(lblIconWelcomeClickHere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void txtFldLoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldLoginUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldLoginUsernameActionPerformed

    private void btnLoginLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginLoginActionPerformed
        
        String username = txtFldLoginUsername.getText();
        String password = new String(pwdFldLogin.getPassword());

        // Validation logic
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username or Password cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        } else if (username.equals("admin") && password.equals("admin")) {
            JOptionPane.showMessageDialog(null, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadScreen("Home");
            // Proceed to the next action, e.g., open a new window
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Username or Password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginLoginActionPerformed

    private void btnAllAnimalManageAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAnimalManageAnimalActionPerformed
        loadScreen("ManageAnimals");
    }//GEN-LAST:event_btnAllAnimalManageAnimalActionPerformed

    private void btnAllAnimalHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAnimalHomeActionPerformed
        loadScreen("Home");
    }//GEN-LAST:event_btnAllAnimalHomeActionPerformed

    private void btnAllAnimalLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAnimalLogoutActionPerformed
        loadScreen("Login");
    }//GEN-LAST:event_btnAllAnimalLogoutActionPerformed

    private void btnAddAnimalHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnimalHomeActionPerformed
        loadScreen("Home");
    }//GEN-LAST:event_btnAddAnimalHomeActionPerformed

    private void btnAddAnimalAllAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnimalAllAnimalActionPerformed
        loadScreen("AllAnimals");
    }//GEN-LAST:event_btnAddAnimalAllAnimalActionPerformed

    private void btnAddAnimalManageAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnimalManageAnimalActionPerformed
        loadScreen("ManageAnimals");
    }//GEN-LAST:event_btnAddAnimalManageAnimalActionPerformed

    private void btnAddAnimalLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnimalLogoutActionPerformed
        loadScreen("Login");
    }//GEN-LAST:event_btnAddAnimalLogoutActionPerformed

    private void btnAddAnimalAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnimalAboutUsActionPerformed
        loadScreen("AboutUs");
    }//GEN-LAST:event_btnAddAnimalAboutUsActionPerformed

    private void btnAddAnimalBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnimalBackActionPerformed
        loadScreen("ManageAnimals");
    }//GEN-LAST:event_btnAddAnimalBackActionPerformed

    private void btnHomeLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeLogOutActionPerformed
        loadScreen("Login");
    }//GEN-LAST:event_btnHomeLogOutActionPerformed

    private void btnHomeManageAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeManageAnimalActionPerformed
        loadScreen("ManageAnimals");
    }//GEN-LAST:event_btnHomeManageAnimalActionPerformed

    private void btnHomeAllAnimalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeAllAnimalsActionPerformed
        loadScreen("AllAnimals");
    }//GEN-LAST:event_btnHomeAllAnimalsActionPerformed

    private void jButton239ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton239ActionPerformed
        loadScreen("EditAnimal");
    }//GEN-LAST:event_jButton239ActionPerformed

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton104ActionPerformed
        loadScreen("EditAnimal");
    }//GEN-LAST:event_jButton104ActionPerformed

    private void jButton188ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton188ActionPerformed
        loadScreen("EditAnimal");
    }//GEN-LAST:event_jButton188ActionPerformed

    private void jButton190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton190ActionPerformed
        loadScreen("EditAnimal");
    }//GEN-LAST:event_jButton190ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
        loadScreen("EditAnimal");
    }//GEN-LAST:event_jButton103ActionPerformed

    private void jButton189ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton189ActionPerformed
        loadScreen("EditAnimal");
    }//GEN-LAST:event_jButton189ActionPerformed

    private void jButton187ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton187ActionPerformed
        loadScreen("EditAnimal");
    }//GEN-LAST:event_jButton187ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
        loadScreen("EditAnimal");
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton195ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton195ActionPerformed

    private void jButton196ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton196ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton196ActionPerformed

    private void btnWelcomeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWelcomeLoginActionPerformed
        loadScreen("Login");
    }//GEN-LAST:event_btnWelcomeLoginActionPerformed

    private void txtFldAddAnimalAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldAddAnimalAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldAddAnimalAgeActionPerformed

    private void btnAddAnimalAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnimalAddActionPerformed
        addAnimal();
    }//GEN-LAST:event_btnAddAnimalAddActionPerformed

    private void btnManageAnimalAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAnimalAddActionPerformed
        loadScreen("AddAnimal");
    }//GEN-LAST:event_btnManageAnimalAddActionPerformed

    private void btnManageAnimalEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAnimalEditActionPerformed
        loadScreen("EditAnimal");
    }//GEN-LAST:event_btnManageAnimalEditActionPerformed

    private void btnLoginFpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginFpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginFpActionPerformed

    private void btnManageAnimalAllAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAnimalAllAnimalActionPerformed
        loadScreen("AllAnimals");
    }//GEN-LAST:event_btnManageAnimalAllAnimalActionPerformed

    private void btnManageAnimalHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAnimalHomeActionPerformed
        loadScreen("Home");
    }//GEN-LAST:event_btnManageAnimalHomeActionPerformed

    private void btnManageAnimaLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAnimaLogoutActionPerformed
        loadScreen("Home");
    }//GEN-LAST:event_btnManageAnimaLogoutActionPerformed

    private void btnAllAnimalAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAnimalAboutUsActionPerformed
        loadScreen("AboutUs");
    }//GEN-LAST:event_btnAllAnimalAboutUsActionPerformed

    private void btnAboutUsManageAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsManageAnimalActionPerformed
        loadScreen("ManageAnimals");
    }//GEN-LAST:event_btnAboutUsManageAnimalActionPerformed

    private void btnAboutUsHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAboutUsHistoryActionPerformed

    private void btnAboutUsHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsHomeActionPerformed
        loadScreen("Home");
    }//GEN-LAST:event_btnAboutUsHomeActionPerformed

    private void btnAboutUsLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsLogoutActionPerformed
        loadScreen("Login");
    }//GEN-LAST:event_btnAboutUsLogoutActionPerformed

    private void btnHomeAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeAboutUsActionPerformed
        loadScreen("AboutUs");
    }//GEN-LAST:event_btnHomeAboutUsActionPerformed

    private void btnManageAnimalAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAnimalAboutUsActionPerformed
        loadScreen("AboutUs");
    }//GEN-LAST:event_btnManageAnimalAboutUsActionPerformed

    private void btnAllAnimalManageAnimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAnimalManageAnimal1ActionPerformed
        loadScreen("ManageAnimals");
    }//GEN-LAST:event_btnAllAnimalManageAnimal1ActionPerformed

    private void btnAllAnimalAboutUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAnimalAboutUs1ActionPerformed
        loadScreen("AbouUs");
    }//GEN-LAST:event_btnAllAnimalAboutUs1ActionPerformed

    private void btnAllAnimalHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAnimalHome1ActionPerformed
        loadScreen("Home");
    }//GEN-LAST:event_btnAllAnimalHome1ActionPerformed

    private void btnAllAnimalLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAnimalLogout1ActionPerformed
        loadScreen("Login");
    }//GEN-LAST:event_btnAllAnimalLogout1ActionPerformed

    private void txtFldEditAnimalAge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldEditAnimalAge1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldEditAnimalAge1ActionPerformed

    private void txtFldEditAnimalGender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldEditAnimalGender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldEditAnimalGender1ActionPerformed

    private void txtFldEditAnimalPetID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldEditAnimalPetID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldEditAnimalPetID1ActionPerformed

    private void btnEditAnimalSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalSave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditAnimalSave1ActionPerformed

    private void btnEditAnimalCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalCheck1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditAnimalCheck1ActionPerformed

    private void btnEditAnimalDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalDelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditAnimalDelete1ActionPerformed

    private void btnEditAnimalHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalHome1ActionPerformed
        loadScreen("Home");
    }//GEN-LAST:event_btnEditAnimalHome1ActionPerformed

    private void btnEditAnimalAllAnimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalAllAnimal1ActionPerformed
        loadScreen("AllAnimals");
    }//GEN-LAST:event_btnEditAnimalAllAnimal1ActionPerformed

    private void btnEditAnimalManageAnimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalManageAnimal1ActionPerformed
        loadScreen("ManageAnimals");
    }//GEN-LAST:event_btnEditAnimalManageAnimal1ActionPerformed

    private void btnEditAnimalLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalLogout1ActionPerformed
        loadScreen("Login");
    }//GEN-LAST:event_btnEditAnimalLogout1ActionPerformed

    private void btnEditAnimalAboutUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalAboutUs1ActionPerformed
        loadScreen("AboutUs");
    }//GEN-LAST:event_btnEditAnimalAboutUs1ActionPerformed

    private void btnEditAnimalBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalBack1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditAnimalBack1ActionPerformed

    private void btnHomeCustomerRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeCustomerRequestActionPerformed
        loadScreen("CustomerRequests");
    }//GEN-LAST:event_btnHomeCustomerRequestActionPerformed

    private void btnAllAnimalCustomerRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAnimalCustomerRequestActionPerformed
        loadScreen("CustomerRequests");
    }//GEN-LAST:event_btnAllAnimalCustomerRequestActionPerformed

    private void btnManageAnimalCustomerRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAnimalCustomerRequest1ActionPerformed
        loadScreen("CustomerRequests");
    }//GEN-LAST:event_btnManageAnimalCustomerRequest1ActionPerformed

    private void btnAddAnimalCustomerRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnimalCustomerRequestActionPerformed
        loadScreen("CustomerRequests");
    }//GEN-LAST:event_btnAddAnimalCustomerRequestActionPerformed

    private void btnAddAnimalCustomerMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnimalCustomerMessagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddAnimalCustomerMessagesActionPerformed

    private void btnAllAnimalCustomerRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAnimalCustomerRequest1ActionPerformed
        loadScreen("CustomerRequest");
    }//GEN-LAST:event_btnAllAnimalCustomerRequest1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadScreen("CustomerRequests");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        BinarySearch search = new BinarySearch();
        List<AnimalModel> sortedList = selectionSort.sortByName(petList, false);
        ArrayList<AnimalModel> searchedData = search.searchByPetName(jTextField7.getText().trim(), sortedList, 0, petList.size()-1);
        if(searchedData!=null){
            addDataToTable(searchedData);
        }
        else{
            JOptionPane.showMessageDialog(this,"Data not found","Not Found",JOptionPane.ERROR_MESSAGE);
            addDataToTable(petList);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        addDataToTable(petList);
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnManageAnimalSortByPetID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAnimalSortByPetID1ActionPerformed
        if (jComboBox3.getSelectedItem() == "Pet ID") {
            List<AnimalModel> sortedList = selectionSort.sortByPetId(petList, false);
            addDataToTable(sortedList);  
            }
        else if (jComboBox3.getSelectedItem() == "Name") {
            List<AnimalModel> sortedList = selectionSort.sortByName(petList, false);
            addDataToTable(sortedList);
            }
        else if (jComboBox3.getSelectedItem() == "Age") {
            List<AnimalModel> sortedList = insertionSort.sortByAge(petList, false);
        addDataToTable(sortedList);
            }
        else{
            List<AnimalModel> sortedList = mergeSort.sortByAdoptionFees(petList, false);
            addDataToTable(sortedList);
        }
    }//GEN-LAST:event_btnManageAnimalSortByPetID1ActionPerformed

    private void btnAboutUsCustomerRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsCustomerRequestActionPerformed
      loadScreen("AllAnimals");
    }//GEN-LAST:event_btnAboutUsCustomerRequestActionPerformed

    private void btnAboutussCustomermessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutussCustomermessagesActionPerformed
        loadScreen("CustomerRequest");
    }//GEN-LAST:event_btnAboutussCustomermessagesActionPerformed

    private void btnAllAnimalCustomermessages1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAnimalCustomermessages1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAllAnimalCustomermessages1ActionPerformed

    private void btnEditAnimalBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalBackActionPerformed
        loadScreen("ManageAnimals");
    }//GEN-LAST:event_btnEditAnimalBackActionPerformed

    private void btnEditAnimalAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalAboutUsActionPerformed
        loadScreen("AboutUs");
    }//GEN-LAST:event_btnEditAnimalAboutUsActionPerformed

    private void btnEditAnimalLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalLogoutActionPerformed
        loadScreen("Login");
    }//GEN-LAST:event_btnEditAnimalLogoutActionPerformed

    private void btnEditAnimalCustomerMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalCustomerMessagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditAnimalCustomerMessagesActionPerformed

    private void btnEditAnimalCustomerRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalCustomerRequestActionPerformed
        loadScreen("CustomerRequests");
    }//GEN-LAST:event_btnEditAnimalCustomerRequestActionPerformed

    private void btnEditAnimalManageAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalManageAnimalActionPerformed
        loadScreen("ManageAnimals");
    }//GEN-LAST:event_btnEditAnimalManageAnimalActionPerformed

    private void btnEditAnimalAllAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalAllAnimalActionPerformed
        loadScreen("AllAnimals");
    }//GEN-LAST:event_btnEditAnimalAllAnimalActionPerformed

    private void btnEditAnimalHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalHomeActionPerformed
        loadScreen("Home");
    }//GEN-LAST:event_btnEditAnimalHomeActionPerformed

    private void btnFemale1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemale1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFemale1ActionPerformed

    private void btnEditAnimalDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalDeleteActionPerformed
        deleteAnimal();
    }//GEN-LAST:event_btnEditAnimalDeleteActionPerformed

    private void btnEditAnimalCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalCheckActionPerformed
        updateSetText();
    }//GEN-LAST:event_btnEditAnimalCheckActionPerformed

    private void btnEditAnimalSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalSaveActionPerformed
        updateAnimal();
    }//GEN-LAST:event_btnEditAnimalSaveActionPerformed

    private void txtFldEditAnimalPetIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldEditAnimalPetIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldEditAnimalPetIDActionPerformed

    private void txtFldEditAnimalAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldEditAnimalAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldEditAnimalAgeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PetAdoptionSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetAdoptionSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetAdoptionSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetAdoptionSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetAdoptionSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUsCustomerRequest;
    private javax.swing.JButton btnAboutUsHistory;
    private javax.swing.JButton btnAboutUsHome;
    private javax.swing.JButton btnAboutUsLogout;
    private javax.swing.JButton btnAboutUsManageAnimal;
    private javax.swing.JButton btnAboutussCustomermessages;
    private javax.swing.JButton btnAddAnimalAboutUs;
    private javax.swing.JButton btnAddAnimalAdd;
    private javax.swing.JButton btnAddAnimalAllAnimal;
    private javax.swing.JButton btnAddAnimalBack;
    private javax.swing.JButton btnAddAnimalCustomerMessages;
    private javax.swing.JButton btnAddAnimalCustomerRequest;
    private javax.swing.JButton btnAddAnimalHistory;
    private javax.swing.JButton btnAddAnimalHome;
    private javax.swing.JButton btnAddAnimalImage;
    private javax.swing.JButton btnAddAnimalLogout;
    private javax.swing.JButton btnAddAnimalManageAnimal;
    private javax.swing.JButton btnAllAnimalAboutUs;
    private javax.swing.JButton btnAllAnimalAboutUs1;
    private javax.swing.JButton btnAllAnimalCustomerRequest;
    private javax.swing.JButton btnAllAnimalCustomerRequest1;
    private javax.swing.JButton btnAllAnimalCustomermessages;
    private javax.swing.JButton btnAllAnimalCustomermessages1;
    private javax.swing.JButton btnAllAnimalHome;
    private javax.swing.JButton btnAllAnimalHome1;
    private javax.swing.JButton btnAllAnimalLogout;
    private javax.swing.JButton btnAllAnimalLogout1;
    private javax.swing.JButton btnAllAnimalManageAnimal;
    private javax.swing.JButton btnAllAnimalManageAnimal1;
    private javax.swing.JButton btnEditAnimalAboutUs;
    private javax.swing.JButton btnEditAnimalAboutUs1;
    private javax.swing.JButton btnEditAnimalAllAnimal;
    private javax.swing.JButton btnEditAnimalAllAnimal1;
    private javax.swing.JButton btnEditAnimalBack;
    private javax.swing.JButton btnEditAnimalBack1;
    private javax.swing.JButton btnEditAnimalCheck;
    private javax.swing.JButton btnEditAnimalCheck1;
    private javax.swing.JButton btnEditAnimalCustomerMessages;
    private javax.swing.JButton btnEditAnimalCustomerRequest;
    private javax.swing.JButton btnEditAnimalDelete;
    private javax.swing.JButton btnEditAnimalDelete1;
    private javax.swing.JButton btnEditAnimalHistory;
    private javax.swing.JButton btnEditAnimalHistory1;
    private javax.swing.JButton btnEditAnimalHome;
    private javax.swing.JButton btnEditAnimalHome1;
    private javax.swing.JButton btnEditAnimalImage;
    private javax.swing.JButton btnEditAnimalImage1;
    private javax.swing.JButton btnEditAnimalLogout;
    private javax.swing.JButton btnEditAnimalLogout1;
    private javax.swing.JButton btnEditAnimalManageAnimal;
    private javax.swing.JButton btnEditAnimalManageAnimal1;
    private javax.swing.JButton btnEditAnimalSave;
    private javax.swing.JButton btnEditAnimalSave1;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnFemale1;
    private javax.swing.JButton btnHomeAboutUs;
    private javax.swing.JButton btnHomeAllAnimals;
    private javax.swing.JButton btnHomeCustomerMessage;
    private javax.swing.JButton btnHomeCustomerRequest;
    private javax.swing.JButton btnHomeLogOut;
    private javax.swing.JButton btnHomeManageAnimal;
    private javax.swing.JButton btnLoginCna;
    private javax.swing.JButton btnLoginFp;
    private javax.swing.JButton btnLoginLogin;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnMale1;
    private javax.swing.JButton btnManageAnimaCustomermessages;
    private javax.swing.JButton btnManageAnimaLogout;
    private javax.swing.JButton btnManageAnimalAboutUs;
    private javax.swing.JButton btnManageAnimalAdd;
    private javax.swing.JButton btnManageAnimalAllAnimal;
    private javax.swing.JButton btnManageAnimalCustomerRequest1;
    private javax.swing.JButton btnManageAnimalEdit;
    private javax.swing.JButton btnManageAnimalHome;
    private javax.swing.JButton btnManageAnimalSortByPetID1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnWelcomeLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton187;
    private javax.swing.JButton jButton188;
    private javax.swing.JButton jButton189;
    private javax.swing.JButton jButton190;
    private javax.swing.JButton jButton195;
    private javax.swing.JButton jButton196;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton239;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel190;
    private javax.swing.JPanel jPanel191;
    private javax.swing.JPanel jPanel192;
    private javax.swing.JPanel jPanel193;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblAddAnimalAddanimal;
    private javax.swing.JLabel lblAddAnimalAdoptiionFees;
    private javax.swing.JLabel lblAddAnimalAge;
    private javax.swing.JLabel lblAddAnimalBreed;
    private javax.swing.JLabel lblAddAnimalColor;
    private javax.swing.JLabel lblAddAnimalDescription;
    private javax.swing.JLabel lblAddAnimalGender;
    private javax.swing.JLabel lblAddAnimalName;
    private javax.swing.JLabel lblAddAnimalName1;
    private javax.swing.JLabel lblAddAnimalPetCategory;
    private javax.swing.JLabel lblAddAnimalSize;
    private javax.swing.JPanel lblAddAnimalTop;
    private javax.swing.JLabel lblAllAnimalAL;
    private javax.swing.JLabel lblAllAnimalAL1;
    private javax.swing.JLabel lblAllAnimalAL2;
    private javax.swing.JLabel lblEditAnimalAdoptionFee;
    private javax.swing.JLabel lblEditAnimalAdoptionFee1;
    private javax.swing.JLabel lblEditAnimalAge;
    private javax.swing.JLabel lblEditAnimalAge1;
    private javax.swing.JLabel lblEditAnimalBreed;
    private javax.swing.JLabel lblEditAnimalBreed1;
    private javax.swing.JLabel lblEditAnimalColor;
    private javax.swing.JLabel lblEditAnimalColor1;
    private javax.swing.JLabel lblEditAnimalDescription;
    private javax.swing.JLabel lblEditAnimalDescription1;
    private javax.swing.JLabel lblEditAnimalGender;
    private javax.swing.JLabel lblEditAnimalGender1;
    private javax.swing.JLabel lblEditAnimalName;
    private javax.swing.JLabel lblEditAnimalName1;
    private javax.swing.JLabel lblEditAnimalPetCategory;
    private javax.swing.JLabel lblEditAnimalPetCategory1;
    private javax.swing.JLabel lblEditAnimalPetID;
    private javax.swing.JLabel lblEditAnimalPetID1;
    private javax.swing.JLabel lblEditAnimalSize;
    private javax.swing.JLabel lblEditAnimalSize1;
    private javax.swing.JLabel lblEditAnimalUpdateAnimalInformation;
    private javax.swing.JLabel lblEditAnimalUpdateAnimalInformation1;
    private javax.swing.JLabel lblIconAddAnimalLLA;
    private javax.swing.JLabel lblIconAddAnimalLogo;
    private javax.swing.JLabel lblIconEditAnimalImage;
    private javax.swing.JLabel lblIconEditAnimalImage1;
    private javax.swing.JLabel lblIconEditAnimalLLA;
    private javax.swing.JLabel lblIconEditAnimalLLA1;
    private javax.swing.JLabel lblIconEditAnimalLogo;
    private javax.swing.JLabel lblIconEditAnimalLogo1;
    private javax.swing.JLabel lblIconLoginLLA;
    private javax.swing.JLabel lblIconLoginLogo;
    private javax.swing.JLabel lblIconLoginWoofs;
    private javax.swing.JLabel lblIconLoginWoofs1;
    private javax.swing.JLabel lblIconWelcomeClick;
    private javax.swing.JPanel lblIconWelcomeClickHere;
    private javax.swing.JLabel lblIconWelcomeLLA;
    private javax.swing.JLabel lblIconWelcomeLogo;
    private javax.swing.JLabel lblIconWelcomeWTWAW;
    private javax.swing.JLabel lblIconWelcomeWoofs;
    private javax.swing.JLabel lblLoginLogin;
    private javax.swing.JLabel lblLoginPassword;
    private javax.swing.JLabel lblLoginUsername;
    private javax.swing.JLabel lblManageAnimalMA;
    private javax.swing.JPanel pnlAboutUs;
    private javax.swing.JPanel pnlAddAnimal;
    private javax.swing.JPanel pnlAddAnimalBottom;
    private javax.swing.JPanel pnlAddAnimalBottomLeft;
    private javax.swing.JPanel pnlAddAnimalBottomMiddle;
    private javax.swing.JPanel pnlAddAnimalBottomRight;
    private javax.swing.JPanel pnlAllAnimal;
    private javax.swing.JPanel pnlAllAnimalTop;
    private javax.swing.JPanel pnlAllAnimalTop1;
    private javax.swing.JPanel pnlAllAnimalTop2;
    private javax.swing.JPanel pnlCustomerRequest;
    private javax.swing.JPanel pnlCustomerRequests;
    private javax.swing.JPanel pnlEditAnimal;
    private javax.swing.JPanel pnlEditAnimalBottom;
    private javax.swing.JPanel pnlEditAnimalBottom1;
    private javax.swing.JPanel pnlEditAnimalBottomLeft;
    private javax.swing.JPanel pnlEditAnimalBottomLeft1;
    private javax.swing.JPanel pnlEditAnimalBottomMiddle;
    private javax.swing.JPanel pnlEditAnimalBottomMiddle1;
    private javax.swing.JPanel pnlEditAnimalBottomRight;
    private javax.swing.JPanel pnlEditAnimalBottomRight1;
    private javax.swing.JPanel pnlEditAnimalTop;
    private javax.swing.JPanel pnlEditAnimalTop1;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlIconAboutUsLeftPanel;
    private javax.swing.JLabel pnlIconAddAnimalImage;
    private javax.swing.JLabel pnlIconAddAnimalWoofs;
    private javax.swing.JLabel pnlIconAllAnimaLLA;
    private javax.swing.JLabel pnlIconAllAnimaLLA1;
    private javax.swing.JLabel pnlIconAllAnimaLLA2;
    private javax.swing.JPanel pnlIconAllAnimaLeftPanel;
    private javax.swing.JPanel pnlIconAllAnimaLeftPanel1;
    private javax.swing.JLabel pnlIconAllAnimalLogo;
    private javax.swing.JLabel pnlIconAllAnimalLogo1;
    private javax.swing.JLabel pnlIconAllAnimalLogo2;
    private javax.swing.JLabel pnlIconManageAnimalLLA;
    private javax.swing.JLabel pnlIconManageAnimalLogo;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLoginMain;
    private javax.swing.JPanel pnlManageAnimal;
    private javax.swing.JPanel pnlManageAnimalLeft;
    private javax.swing.JPanel pnlManageAnimalMiddle;
    private javax.swing.JPanel pnlManageAnimalTop;
    private javax.swing.JPanel pnlSignUp;
    private javax.swing.JPanel pnlWelcome;
    private javax.swing.JPasswordField pwdFldLogin;
    private javax.swing.JScrollPane scrlpaneAllAnimalAnimalList1;
    private javax.swing.JScrollPane scrlpaneManageAnimalAD;
    private javax.swing.JScrollPane scrlpaneManageAnimalAD1;
    private javax.swing.JSlider sizeSlider;
    private javax.swing.JSlider sizeSlider1;
    private javax.swing.JTextField txtFldAddAnimalAdoptionFees;
    private javax.swing.JTextField txtFldAddAnimalAge;
    private javax.swing.JTextField txtFldAddAnimalBreed;
    private javax.swing.JTextField txtFldAddAnimalColor;
    private javax.swing.JTextField txtFldAddAnimalDescription;
    private javax.swing.JTextField txtFldAddAnimalName;
    private javax.swing.JTextField txtFldAddAnimalName1;
    private javax.swing.JTextField txtFldEditAnimalAdoptionFees;
    private javax.swing.JTextField txtFldEditAnimalAdoptionFees1;
    private javax.swing.JTextField txtFldEditAnimalAge;
    private javax.swing.JTextField txtFldEditAnimalAge1;
    private javax.swing.JTextField txtFldEditAnimalBreed;
    private javax.swing.JTextField txtFldEditAnimalBreed1;
    private javax.swing.JTextField txtFldEditAnimalColor;
    private javax.swing.JTextField txtFldEditAnimalColor1;
    private javax.swing.JTextField txtFldEditAnimalDescription;
    private javax.swing.JTextField txtFldEditAnimalDescription1;
    private javax.swing.JTextField txtFldEditAnimalGender1;
    private javax.swing.JTextField txtFldEditAnimalName;
    private javax.swing.JTextField txtFldEditAnimalName1;
    private javax.swing.JTextField txtFldEditAnimalPetCategory1;
    private javax.swing.JTextField txtFldEditAnimalPetID;
    private javax.swing.JTextField txtFldEditAnimalPetID1;
    private javax.swing.JTextField txtFldEditAnimalSize1;
    private javax.swing.JTextField txtFldLoginUsername;
    // End of variables declaration//GEN-END:variables
}
