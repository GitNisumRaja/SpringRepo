package com.nisum.batch;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class CustomItemReader implements ItemReader<String> {

	private List<String> bookNameList;
	private int bookCount = 0;
	
	
	public void setBookNameList(List<String> bookNameList) {
		this.bookNameList = bookNameList;
	}


	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
	
		System.out.println("ItemReader::read()");
		if(bookCount < bookNameList.size()){
			return bookNameList.get(bookCount++);
		}
		return null;
	}

}
