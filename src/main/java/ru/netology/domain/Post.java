package ru.netology.domain;
//TODO
//В первом задании у вас в итоге должна получиться структура классов, соответствующая структуре ответа вк
// - классы для информации о лайках/комментах/… и класс поста, у которого будут в том числе поля с типами ваших классов
// (например, private LikesInfo likesInfo;).

//о ссылке описано какие данные и каких типов внутри себя содержит объект, хранящий информацию о посте; обратите внимание,
// что под integer они имеют целочисленный тип (т.е. нам в джаве надо указывать int),
// а там где у них указано object нам надо создавать  отдельные классы, описывающие структуру этих объектов,
// а в классе поста хранить поля с типами этих классов (непонятно? см. подсказку ниже).
//
public class Post {
    private long postID;        //идентификатор поста верхнего уровня   = id
    private long parentID;      //идентификатор родительского поста, если это комментарий к другому посту =reply_owner_id
    private long shareID;       //идентификатор родительского поста, если этот пост был добавлен по кнопке Share
    private long authorID;      //идентификатор автора      = from_id
    private long communityID;   //идентификатор сообщества, где опубликован пост    = owner_id
    private String dateTime;    //время создания        = date
    private String postSubject; //заголовок             = text
    private String postBody;    //текст  в формает HTML

    //objects
    private Comments comments;
    private Likes likes;
    private Reposts reposts;
    private Geo geo;
    private Post_source post_source;

    //поля, которые я добавил
    private int friendsAccess;       //поле для хранения прав доступа        ~~= friends_only
    private int isPinned;            // = is_pinned
    private int isAds;               // = marked_as_ads


    public Post_source getPost_source() {
        return post_source;
    }

    public void setPost_source(Post_source post_source) {
        this.post_source = post_source;
    }

    public long getPostID() {
        return postID;
    }

    public void setPostID(long postID) {
        this.postID = postID;
    }

    public long getParentID() {
        return parentID;
    }

    public void setParentID(long parentID) {
        this.parentID = parentID;
    }

    public long getShareID() {
        return shareID;
    }

    public void setShareID(long shareID) {
        this.shareID = shareID;
    }

    public long getAuthorID() {
        return authorID;
    }

    public void setAuthorID(long authorID) {
        this.authorID = authorID;
    }

    public long getCommunityID() {
        return communityID;
    }

    public void setCommunityID(long communityID) {
        this.communityID = communityID;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getPostSubject() {
        return postSubject;
    }

    public void setPostSubject(String postSubject) {
        this.postSubject = postSubject;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public Reposts getReposts() {
        return reposts;
    }

    public void setReposts(Reposts reposts) {
        this.reposts = reposts;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getFriendsAccess() {
        return friendsAccess;
    }

    public void setFriendsAccess(int friendsAccess) {
        this.friendsAccess = friendsAccess;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getIsAds() {
        return isAds;
    }

    public void setIsAds(int isAds) {
        this.isAds = isAds;
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
