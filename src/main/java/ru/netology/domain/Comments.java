package ru.netology.domain;

public class Comments {
    private long count;
    private boolean can_post;
    private boolean groups_can_post;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public boolean isCan_post() {
        return can_post;
    }

    public void setCan_post(boolean can_post) {
        this.can_post = can_post;
    }

    public boolean isGroups_can_post() {
        return groups_can_post;
    }

    public void setGroups_can_post(boolean groups_can_post) {
        this.groups_can_post = groups_can_post;
    }
}
