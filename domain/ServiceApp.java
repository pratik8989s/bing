package com.techm.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

public class ServiceApp {

	Customer cus=new Customer();
	ModelRepository mr= new ModelRepository();
	float price1=0;
	//method to search model
	public float searchModel(String modeln)
	{

		float price=0;


		Set<String> s=mr.hm.keySet();
		for (String i:s) 
		{
			System.out.println(i);
			//if(mr.hm.containsKey(modeln))
			if(i.contains(modeln))

			{
				price=mr.hm.get(i);
				System.out.println("The price for that modelname is "+price);
				break;
			}

			else
			{

				try {
					throw new ModelNameNotFound("Model Name not Found");
				} catch (ModelNameNotFound e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}



		}

		return price;


	}


	//method to add Customer
	public int addCustomer(String custName,long custMobile,String modelName) 
	{
		int a=(int)((Math.random())*10);

		price1=searchModel(modelName);


		File f= new File("customerInfo.txt");

		if(!f.exists())
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}






		try {

			PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));
			pw.println(custName);
			pw.println(custMobile);
			pw.println(modelName);
			pw.println(String.valueOf(price1));




			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		return a;

	}











}