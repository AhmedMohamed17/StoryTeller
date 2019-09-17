package com.example.android.storyteller;

public class story {
    private  String stroy;

    private  int img;
    private  String reference;
    private  String content;
    public String getContent() {
        return content;
    }

    public String getStroy() {
        return stroy;
    }

    public void setStroy(String stroy) {
        this.stroy = stroy;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public story(String stroy, int img, String reference) {
        this.stroy = stroy;
        this.img = img;
        this.reference = reference;
    }

    public story(String stroy, int img, String reference, String content) {
        this.stroy = stroy;
        this.img = img;
        this.reference = reference;
        this.content = content;
    }

}
