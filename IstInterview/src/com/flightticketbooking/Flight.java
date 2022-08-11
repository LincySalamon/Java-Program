package com.flightticketbooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Flight {
	HashMap<String,ArrayList<Integer>> general = new HashMap<String,ArrayList<Integer>>();
	HashMap<String,ArrayList<Integer>> tatkal = new HashMap<String,ArrayList<Integer>>();
	HashMap<String, Integer> general_price = new HashMap<String, Integer>();
	HashMap<String, Integer> tatkal_price = new HashMap<String, Integer>();
	
	List<Integer> removedseats = new ArrayList<Integer>();
	int mealPrice = 200;
	boolean isSeniorCitizen = false;
	int cancelGeneral = 200;
	int tatkalcancel = 1000;
	
	Flight(HashMap<String, ArrayList<Integer>> business,HashMap<String,ArrayList<Integer>> economy,
			HashMap<String, Integer> businessPrice,HashMap<String, Integer> economyPrice){
		this.general = business;
		this.tatkal = economy;
		this.general_price = businessPrice;
		this.tatkal_price = economyPrice;
	}
	Flight(HashMap<String,ArrayList<Integer>> general){ 
		this.general = general;
	}
}
 