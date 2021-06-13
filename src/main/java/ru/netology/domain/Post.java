package ru.netology.domain;

public class Post {
    long postID;        //идентификатор поста верхнего уровня   = id
    long parentID;      //идентификатор родительского поста, если это комментарий к другому посту =reply_owner_id
    long shareID;       //идентификатор родительского поста, если этот пост был добавлен по кнопке Share
    long authorID;      //идентификатор автора      = from_id
    long communityID;   //идентификатор сообщества, где опубликован пост    = owner_id
    String dateTime;    //время создания        = date
    String postSubject; //заголовок             = text
    String postBody;    //текст  в формает HTML
    int viewCounter;    //количество просмотров поств
    int likeCounter;    //количество людей, которые нажали Like  = likes.count
    int commentCounter;     //количество постов, которые ответили на этот пост =comments.count
    int shareCounter;      //количество постов, которые зашарили этот пост  =reposts.count
    int rating;             //внутренний рейтинг поста для отображения самых интересных
    int editVersion;        //номер для хранения промежуточных версий постов, которые потом были отредактирвоаны или удалены

    public void setDateTime(long postID) {
    }
    public void getDateTime(long postID) {
    }
    public void setPostSubject(long postID) {
    }
    public void getPostSubject(long postID) {
    }
    public void setPostBody(long postID) {
    }
    public void getPostBody(long postID) {
    }
    public void setViewCounter(long postID) {
    }
    public void getViewCounter(long postID) {
    }
    public void setLikeCounter(long postID) {
    }
    public void getLikeCounter(long postID) {
    }
    public void setCommentCounter(long postID) {
    }
    public void getCommentCounter(long postID) {
    }
    public void setShareCounter(long postID) {
    }
    public void getShareCounter(long postID) {
    }
    public void setRating(long postID) {
    }
    public void getRating(long postID) {
    }
    public void setEditVersion(long postID) {
    }
    public void getEditVersion(long postID) {
    }
    
}
