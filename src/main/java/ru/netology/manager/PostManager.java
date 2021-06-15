package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;

    public Post[] search(long ownerID, String domain, String query, boolean ownersOnly, int count, int offset) { return null; }
    public void delete(long ownerID, long postID) {}

    public Post[] getPostsForFeed() {
// TODO: add logic
        return null;
    }
}
