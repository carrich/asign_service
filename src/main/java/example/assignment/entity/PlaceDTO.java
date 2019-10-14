package example.assignment.entity;

import service11.City;
import service11.District;
import service11.Member;

public class PlaceDTO {
    private City city;

    private long createdAt;

    private long deletedAt;

    private String description;

    private District district;

    private long id;

    private String images;



    private String name;

    private int point;



    private int status;

    private long updatedAt;

    public PlaceDTO(City city, long createdAt, long deletedAt, String description, District district, long id, String images, String name, int point, int status, long updatedAt) {
        this.city = city;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.description = description;
        this.district = district;
        this.id = id;
        this.images = images;
        this.name = name;
        this.point = point;
        this.status = status;
        this.updatedAt = updatedAt;
    }

    public PlaceDTO() {
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
