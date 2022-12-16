package com.ankurmaurya.solidprinciples.singleresponsibility;

public class BadBook {

	private String name;
    private String author;
    private String text;
    
    
	public BadBook(String name, String author, String text) {
		super();
		this.name = name;
		this.author = author;
		this.text = text;
	}


	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}


	public String getText() {
		return text;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setText(String text) {
		this.text = text;
	}
	
	// methods that directly relate to the book properties
	public String replaceWordInText(String word, String replacementWord){
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
    
    
    void printTextToConsole(){
        System.out.println(this.getText());
    }
	
}
