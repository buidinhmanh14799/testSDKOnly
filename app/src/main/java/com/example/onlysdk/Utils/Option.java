package com.example.onlysdk.Utils;

import java.io.Serializable;

public class Option implements Serializable {
    private Boolean showTitle;
    private String title;
    private int backIcon;

    public Option(Boolean showTitle, String title, int backIcon) {
        this.showTitle = showTitle;
        this.title = title;
        this.backIcon = backIcon;
    }

    public Option(int backIcon) {
        this.backIcon = backIcon;
    }

    public Option(String title) {
        this.title = title;
    }

    public Option(Boolean showTitle) {
        this.showTitle = showTitle;
    }

    public Boolean getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(Boolean showTitle) {
        this.showTitle = showTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBackIcon() {
        return backIcon;
    }

    public void setBackIcon(int backIcon) {
        this.backIcon = backIcon;
    }
}

