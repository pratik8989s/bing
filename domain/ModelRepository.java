package com.techm.domain;

import java.util.HashMap;

public class ModelRepository {


	//HasHMap
	HashMap<String, Float> hm=new HashMap<String, Float>();


	//init method
	public void init() {

		hm.put("HeroPassionPlus", 2500.0F);
		hm.put("HondaActiva", 1500.0F);
		hm.put("HondaDio", 1200.0F);
		hm.put("HeroPleasure", 1550.0F);
		hm.put("VespaGrand", 3000.0F);
		hm.put("Aprilia", 4000.0F);


	}


	public ModelRepository() {
		super();
		
	}




}
