package exo32Resto;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class RestoV32 {

	public static void displayMenu(List<Dish> listeEntrees) {
		for (int i = 0; i < listeEntrees.size(); i++) {
			int itemChoiceNumber = i + 1;
			System.out.print("[" + itemChoiceNumber + " - " + listeEntrees.get(i) + "]");
		}
		System.out.println();
	}

	public static void resumeMenu(String[] menuToDisplay) {
		for (int i = 0; i < menuToDisplay.length; i++) {
			int itemChoiceNumber = i + 1;
			System.out.print("[" + itemChoiceNumber + " - " + menuToDisplay[i] + "]");
		}
		System.out.println();
	}

	
}

