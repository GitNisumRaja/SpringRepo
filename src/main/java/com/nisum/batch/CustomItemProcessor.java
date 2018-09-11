package com.nisum.batch;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<String, String> {

	public String process(String bookNameWithoutAuthor) throws Exception {

		System.out.println("CudtomItemProcessor:: process()");
		String bookNameWithAuthor = "Book Name::"+bookNameWithoutAuthor +" Author Name::";
		if(bookNameWithoutAuthor.equalsIgnoreCase("Core Java")){
			bookNameWithAuthor += "Rajesh";
		} else if(bookNameWithoutAuthor.equalsIgnoreCase("Design Patterns")){
			bookNameWithAuthor += "Rajendra";
		}else if(bookNameWithoutAuthor.equalsIgnoreCase("Advance Java")){
			bookNameWithAuthor += "Raju";
		}else if(bookNameWithoutAuthor.equalsIgnoreCase("Spring FrameWork")){
			bookNameWithAuthor += "RajPal";
		}else if(bookNameWithoutAuthor.equalsIgnoreCase("Hibernate Framework")){
			bookNameWithAuthor += "Raghuvendra";
		}
		return bookNameWithAuthor;
	}

}
