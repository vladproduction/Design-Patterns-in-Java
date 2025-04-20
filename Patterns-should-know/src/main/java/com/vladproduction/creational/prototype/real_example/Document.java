package com.vladproduction.creational.prototype.real_example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Document implements Cloneable {

    private String title;
    private final String author;
    private List<String> content;
    private DocumentFormat format;

    public Document(String title, String author, DocumentFormat format) {
        this.title = title;
        this.author = author;
        this.content = new LinkedList<>();
        this.format = format;
    }

    public void addContent(String content) {
        this.content.add(content);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getContent() {
        return content;
    }

    public DocumentFormat getFormat() {
        return format;
    }

    public void setFormat(DocumentFormat format) {
        this.format = format;
    }

    @Override
    public Document clone(){
        try{
            Document clone = (Document) super.clone();

            //deep copy of mutable state:
            clone.content = new ArrayList<>(this.content);
            clone.format = this.format;  // Enum is immutable, so no need to clone

            return clone;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    //toString():
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Document: ").append(title).append(", created by: ").append(author).append(" (").append(format).append(")\n");
        sb.append("Content:\n");
        for (String line : content) {
            sb.append("- ").append(line).append("\n");
        }
        return sb.toString();
    }
}




















