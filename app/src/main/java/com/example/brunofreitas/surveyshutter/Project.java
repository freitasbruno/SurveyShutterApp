package com.example.brunofreitas.surveyshutter;

public class Project {
    private final int id;
    private final int idParent;
    private final String title;



    private final String description;

    public Project(int id, int idParent, String name, String description){
        this.id = id;
        this.idParent = idParent;
        this.title = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getIdParent() {
        return idParent;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
