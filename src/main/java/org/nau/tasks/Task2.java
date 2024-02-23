package org.nau.tasks;

import org.nau.entities.Wine;
import org.nau.services.WineService;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        WineService wineService = new WineService();
        wineService.add("Chardonnay", "Robert Mondavi", "USA", LocalDate.of(2019, 8, 20), "Medium-bodied white wine");
        wineService.add("Merlot", "Casa Lapostolle", "Chile", LocalDate.of(2017, 5, 10), "Full-bodied red wine");

        System.out.println("All wines in catalog:");
        for (Wine wine : wineService.getAllWines()) {
            System.out.println(wine.getName() + " by " + wine.getBrand() + " from " + wine.getCountry());
        }

        long wineId = 1;
        Wine wineById = wineService.getWineById(wineId);
        if (wineById != null) {
            System.out.println("\nWine with ID " + wineId + ":");
            System.out.println("Name: " + wineById.getName());
            System.out.println("Brand: " + wineById.getBrand());
            System.out.println("Country: " + wineById.getCountry());
            System.out.println("Bottling Date: " + wineById.getBottlingDate());
            System.out.println("Note: " + wineById.getNote());
        } else {
            System.out.println("\nWine with ID " + wineId + " not found.");
        }

        long wineToUpdateId = 2;
        wineService.updateWine(wineToUpdateId, "Cabernet Sauvignon", "Concha y Toro", "Chile", LocalDate.of(2018, 9, 15), "Intense red wine");

        long wineToDeleteId = 3;
        wineService.deleteWine(wineToDeleteId);
    }
}
