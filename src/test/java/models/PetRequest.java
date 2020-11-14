package models;

import enums.PetStatus;

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
}
