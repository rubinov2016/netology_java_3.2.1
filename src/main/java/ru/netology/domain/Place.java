package ru.netology.domain;

public class Place {
    private long id;
    private String title;
    private long latitude;
    private long longitude;
    private long created;
    private String icon;
    private String country;
    private String city;
    //If place id added as a checkin, place object has additional fields:
    private long type;
    private long group_id;
    private String group_photo;
    private long checkins;
    private long updated;
    private long address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(long group_id) {
        this.group_id = group_id;
    }

    public String getGroup_photo() {
        return group_photo;
    }

    public void setGroup_photo(String group_photo) {
        this.group_photo = group_photo;
    }

    public long getCheckins() {
        return checkins;
    }

    public void setCheckins(long checkins) {
        this.checkins = checkins;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public long getAddress() {
        return address;
    }

    public void setAddress(long address) {
        this.address = address;
    }
}
