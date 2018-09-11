package com.nisum.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class CustomItemWriter implements ItemWriter<String> {

	public void write(List<? extends String> bookNameWithAuthorList) throws Exception {
		System.out.println("CustomItemWriter::write()");
		System.out.println(bookNameWithAuthorList);
	}

}
