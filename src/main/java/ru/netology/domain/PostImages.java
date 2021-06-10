package ru.netology.domain;

public class PostImages {//для возможности пролистывать картинки, не заходя в посты
    long imagesID;   //идентификатор картинки/видео
    int  type;        //тип - картинка или видео
    long postID;     //идентификатор родительского поста
    long authorID;   //идентификатор автора картинки/видео
}
