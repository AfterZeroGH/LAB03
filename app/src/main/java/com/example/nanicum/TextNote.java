package com.example.nanicum;

public class TextNote extends Note {
    //Attribute
    private String textContent ;

    //getter method
    public String getTextContent(){
        return  textContent;
    }

    //setter method
    public String setTextContent(String newContent){
        this.textContent = newContent;
        return newContent;
    }

    //Method
    public  String getSummary(){
        return  title+":"+textContent+"("+createdDate+")";
        //System.out.println(title+":"+textContent+"("+createdDate+")");

    }



}
