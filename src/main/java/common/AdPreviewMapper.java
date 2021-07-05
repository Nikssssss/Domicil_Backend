package common;

import common.enums.AccommodationType;

public interface AdPreviewMapper {
    AccommodationType mapAccommodationType();
    Integer mapRoomsCount();
    String mapAddress();
    String mapPartOfTown();
    Integer mapTotalArea();
    Integer mapFloor();
    Integer mapNumberOfFloors();
    Integer mapPrice();
    String mapImageUrl();
    String mapSourceUrl();
}
