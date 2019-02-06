package com.example.project.udacityfinal;

/**
 * Created by mosta on 2/6/2019.
 */

public class News {

    private String webUrl;

    private String type;

    private String date;

    private String section;

    private String title;

    public News(String title, String section, String type, String date, String webUrl) {
        this.webUrl = webUrl;
        this.type = type;
        this.date = date;
        this.section = section;
        this.title = title;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
