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

    //поля, которые я добавил
    int friendsAccess;       //поле для хранения прав доступа        ~~= friends_only
    int isPinned;            // = is_pinned
    int isAds;               // = marked_as_ads
    int geoID;               //Информация о геоположении

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

// какие поля у меня отсутствовали
//created_by - ID of the administrator who posted the post (for communities only, returns for the requests with administrator's access token).
//reply_post_id - Replied post's id.
//friends_only - 1 if a post is marked "Friends only".
//post_type Type of the post, can be: post, copy, reply, postpone, suggest.
//post_source* Information about the means of posting (see Description of "post_source" field).
//attachments Information about attachments to the post (photos, links, etc.), if any; see
//can_pin Shows if current user can pin a post (1 – yes, 0 – no).
//can_delete Shows if current user can delete the post (1 – yes, 0 – no).
//can_edit Shows if current user can edit the post (1 – yes, 0 – no)
//is_pinned Shows if the post is pinned (1 – yes, 0 – no).
//marked_as_ads Information whether the post is marked as ads
//is_favorite true, if object is added to favorites by current users.

//класс comments
//can_post* (integer, [0,1]) — shows if current user can comment the post. ("1 — yes, 0'' — no);
//groups_can_post (integer, [0,1]) — information whether communities can comment this post.

//класс   likes
//user_likes* (integer, [0,1]) — Whether the user liked the post (0 — not liked, 1 — liked).
//can_like* (integer, [0,1]) — Whether the user can like the post (0 — cannot, 1 — can)
//can_publish* (integer, [0,1]) — Whether the user can repost (0 — cannot, 1 — can).

//класс   reposts
//user_reposted* (integer, [0,1]) — Whether the user reposted the post (0 — not reposted, 1 — reposted).

//класс geo
