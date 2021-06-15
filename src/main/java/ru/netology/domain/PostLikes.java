package ru.netology.domain;

public class PostLikes { //отношение один ко многим - один пост, много лайков
    long postID;    //идентификатор поста
    long authorLikeID;  //идентификатор автора, который нажал Like

    public void setPostLike(long imagesID, long authorLikeID) {
    }
    public long getPostLike(long postID) {return authorLikeID;
    }
}
