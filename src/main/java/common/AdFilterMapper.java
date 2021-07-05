package common;

import common.enums.AccommodationType;
import common.enums.SortingType;
import common.enums.TransactionType;

public interface AdFilterMapper {
    String mapDomain(String locality);
    String mapAccommodation(AccommodationType accommodationType);
    String mapTransaction(TransactionType transactionType);
    String mapRoomsCount(Integer[] roomsCount);
    String mapMinTotalArea(Integer minTotalArea);
    String mapMaxTotalArea(Integer maxTotalArea);
    String mapMinFloor(Integer minFloor);
    String mapMaxFloor(Integer maxFloor);
    String mapMinPrice(Integer minPrice);
    String mapMaxPrice(Integer maxPrice);
    String mapTerm(Boolean longTerm);
    String mapSorting(SortingType sortingType);
    String mapPage(Integer page);
}
