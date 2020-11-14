package models;

import helpers.PetStatus;

public class PetRequest {
    private int id;
    private Category category;
    private String name;
    private String[] photoUrls;
    private Tag[] tags;
    private PetStatus status;

    public PetRequest(int id, Category category, String name, String[] photoUrls, Tag[] tags, PetStatus status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }
}
