package models;

import helpers.PetStatus;

public class PetResponse {
    private int id;
    private Category category;
    private String name;
    private String[] photoUrls;
    private Tag[] tags;
    private PetStatus status;

    public int getId() {
        return id;
    }
    public Category getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }
    public String[] getPhotoUrls() {
        return photoUrls;
    }
    public Tag[] getTags() {
        return tags;
    }
    public PetStatus getStatus() {
        return status;
    }
}
