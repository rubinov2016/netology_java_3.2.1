package ru.netology.domain;

public class Reposts {
    private long count;
    private boolean user_reposted;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public boolean isUser_reposted() {
        return user_reposted;
    }

    public void setUser_reposted(boolean user_reposted) {
        this.user_reposted = user_reposted;
    }
}
