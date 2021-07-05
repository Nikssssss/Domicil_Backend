package common.entities;

import common.enums.AccommodationType;
import common.enums.SortingType;
import common.enums.TransactionType;

public class AdFilters {
    private String locality;
    private AccommodationType accommodationType;
    private TransactionType transactionType;
    private Integer[] roomsCount;
    private Integer minTotalArea;
    private Integer maxTotalArea;
    private Integer minFloor;
    private Integer maxFloor;
    private Integer minPrice;
    private Integer maxPrice;
    private SortingType sortingType;
    private Boolean longTerm;
    private Integer page;

    public AdFilters locality(String locality) {
        this.locality = locality;
        return this;
    }

    public AdFilters accommodationType(AccommodationType accommodationType) {
        this.accommodationType = accommodationType;
        return this;
    }

    public AdFilters transactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    public AdFilters roomsCount(Integer[] roomsCount) {
        this.roomsCount = roomsCount;
        return this;
    }

    public AdFilters minTotalArea(Integer minTotalArea) {
        this.minTotalArea = minTotalArea;
        return this;
    }

    public AdFilters maxTotalArea(Integer maxTotalArea) {
        this.maxTotalArea = maxTotalArea;
        return this;
    }

    public AdFilters minFloor(Integer minFloor) {
        this.minFloor = minFloor;
        return this;
    }

    public AdFilters maxFloor(Integer maxFloor) {
        this.maxFloor = maxFloor;
        return this;
    }

    public AdFilters minPrice(Integer minPrice) {
        this.minPrice = minPrice;
        return this;
    }

    public AdFilters maxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    public AdFilters longTerm(Boolean longTerm) {
        this.longTerm = longTerm;
        return this;
    }

    public AdFilters sortingType(SortingType sortingType) {
        this.sortingType = sortingType;
        return this;
    }

    public AdFilters page(Integer page) {
        this.page = page;
        return this;
    }

    public String getLocality() {
        return locality;
    }

    public AccommodationType getAccommodationType() {
        return accommodationType;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public Integer[] getRoomsCount() {
        return roomsCount;
    }

    public Integer getMinTotalArea() {
        return minTotalArea;
    }

    public Integer getMaxTotalArea() {
        return maxTotalArea;
    }

    public Integer getMinFloor() {
        return minFloor;
    }

    public Integer getMaxFloor() {
        return maxFloor;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public SortingType getSortingType() {
        return sortingType;
    }

    public Boolean getLongTerm() {
        return longTerm;
    }

    public Integer getPage() {
        return page;
    }
}
