package com.aliendev.mslist.dtos;

import com.aliendev.mslist.entities.Game;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {}
    public GameMinDTO(Game entiti) {
        id = entiti.getId();
        title = entiti.getTitle();
        year = entiti.getYear();
        imgUrl = entiti.getImgUrl();
        shortDescription = entiti.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
