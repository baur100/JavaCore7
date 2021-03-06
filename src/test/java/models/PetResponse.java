package models;

import enums.PetStatus;

public class PetResponse {
    private long id;
    private Category category;
    private String name;
    private String[]photoUrls;
    Tag[] tags;
    private PetStatus status;

    public long getId() {
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
