package models;

import enums.PetStatus;

import java.util.Arrays;

public class PetRequest {
    private long id;
    private Category category;
    private String name;
    private String[]photoUrls;
    Tag[] tags;
    private PetStatus status;

    public PetRequest(long id, Category category, String name, String[] photoUrls, Tag[] tags, PetStatus status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    public void setId(long id) {
        this.id = id;
    }

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
