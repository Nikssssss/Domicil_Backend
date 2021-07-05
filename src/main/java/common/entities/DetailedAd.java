package common.entities;

import common.enums.AccommodationType;

import java.util.List;

public class DetailedAd {
    private AccommodationType accommodationType;
    private Integer roomsCount;
    private String address;
    private String partOfTown;
    private Integer totalArea;
    private Integer floor;
    private Integer numberOfFloors;
    private Integer price;
    private List<String> imageUrls;
    private String description;
    private String sourceUrl;

    public void setAccommodationType(AccommodationType accommodationType) {
        this.accommodationType = accommodationType;
    }

    public void setRoomsCount(Integer roomsCount) {
        this.roomsCount = roomsCount;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPartOfTown(String partOfTown) {
        this.partOfTown = partOfTown;
    }

    public void setTotalArea(Integer totalArea) {
        this.totalArea = totalArea;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public AccommodationType getAccommodationType() {
        return accommodationType;
    }

    public Integer getRoomsCount() {
        return roomsCount;
    }

    public String getAddress() {
        return address;
    }

    public String getPartOfTown() {
        return partOfTown;
    }

    public Integer getTotalArea() {
        return totalArea;
    }

    public Integer getFloor() {
        return floor;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public Integer getPrice() {
        return price;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public String getDescription() {
        return description;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    @Override
    public String toString() {
        return "DetailedAd{" +
                "accommodationType=" + accommodationType +
                ", roomsCount=" + roomsCount +
                ", address='" + address + '\'' +
                ", partOfTown='" + partOfTown + '\'' +
                ", totalArea=" + totalArea +
                ", floor=" + floor +
                ", numberOfFloors=" + numberOfFloors +
                ", price=" + price +
                ", imageUrls=" + imageUrls +
                ", description='" + description + '\'' +
                ", sourceUrl='" + sourceUrl + '\'' +
                '}';
    }
}
