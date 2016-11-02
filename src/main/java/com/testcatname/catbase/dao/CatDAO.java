package com.testcatname.catbase.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.testcatname.catsbase.model.Cat;

@Repository
public class CatDAO {
	
	List<Cat> cats = new ArrayList<Cat>();
	
	public List<Cat> getCats() {
		return cats;
	}

	public void setCats(List<Cat> cats) {
		this.cats = cats;
	}

	public void addCat(Cat cat) {
		cats.add(cat);
		System.out.println("Done, cats added to collection");
	}
	
	public String tellYourName(int index){
		return "\nThis cat names: " +cats.get(index).getName()+ "\nhe born in: " +cats.get(index).getBirthDate()+"\nhis weight is: "+cats.get(index).getWeight()+"\nand his guargian name is: "+cats.get(index).getGuardianName();
	}
	
	//to chyba powinno byc w serwisie..
	public void initCats() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		
		Cat cat1 = new Cat();
		cat1.setName("Tesla");
		cat1.setBirthDate(sdf.parse("12.04.2013"));
		cat1.setWeight((float) 6.0);
		cat1.setGuardianName("Ania");
		cats.add(cat1);
		Cat cat2 = new Cat();
		cat2.setName("Bonifacy");
		cat2.setBirthDate(sdf.parse("14.01.2011"));
		cat2.setWeight((float) 5.5);
		cat2.setGuardianName("Kuba");
		cats.add(cat2);
	}

}
