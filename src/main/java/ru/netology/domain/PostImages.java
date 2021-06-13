package ru.netology.domain;

public class PostImages {//для возможности пролистывать картинки, не заходя в посты
    long imagesID;   //идентификатор картинки/видео
    long postID;     //идентификатор родительского поста
    long authorID;   //идентификатор автора картинки/видео
    String pathImage;//путь к хранению картинки/видео
    int  typeImage;       //тип - картинка или видео

    public void setPathImage(long imagesID) {
    }
    public void getPathImage(long imagesID) {
    }
    public void setTypeImage(long imagesID) {
    }
    public void getTypeImage(long imagesID) {
    }
}
