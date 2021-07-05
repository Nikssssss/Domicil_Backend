package n1;

import common.AdFilterMapper;
import common.enums.AccommodationType;
import common.enums.SortingType;
import common.enums.TransactionType;

import java.util.Properties;

public class N1FilterMapper implements AdFilterMapper {
    private final Properties properties;

    public N1FilterMapper(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String mapDomain(String locality) {
        return "https://" + locality + ".n1.ru";
    }

    @Override
    public String mapAccommodation(AccommodationType accommodationType) {
        switch (accommodationType) {
            case APARTMENT -> { return this.properties.getProperty("apartments"); }
            case ROOM -> { return this.properties.getProperty("rooms"); }
            case HOUSE, COTTAGE -> { return this.properties.getProperty("cottages"); }
            default -> { return ""; }
        }
    }

    @Override
    public String mapTransaction(TransactionType transactionType) {
        switch (transactionType) {
            case RENT -> { return "&" + this.properties.getProperty("rent"); }
            case SELL -> { return "&" + this.properties.getProperty("sell"); }
            default -> { return ""; }
        }
    }

    @Override
    public String mapRoomsCount(Integer[] roomsCount) {
        StringBuilder rooms = new StringBuilder();
        if (roomsCount != null) {
            rooms.append("&");
            rooms.append(this.properties.getProperty("rooms_filter"));
            for (int i = 0; i < roomsCount.length; i++) {
                if (i == 0) {
                    rooms.append(roomsCount[i]);
                }
                rooms.append(this.properties.getProperty(String.valueOf(roomsCount[i])));
            }
        }
        return rooms.toString();
    }

    @Override
    public String mapMinTotalArea(Integer minTotalArea) {
        if (minTotalArea != null) {
            return "&" + this.properties.getProperty("min_total_area") + minTotalArea;
        } else {
            return "";
        }
    }

    @Override
    public String mapMaxTotalArea(Integer maxTotalArea) {
        if (maxTotalArea != null) {
            return "&" + this.properties.getProperty("max_total_area") + maxTotalArea;
        } else {
            return "";
        }
    }

    @Override
    public String mapMinFloor(Integer minFloor) {
        if (minFloor != null) {
            return "&" + this.properties.getProperty("min_floor") + minFloor;
        } else {
            return "";
        }
    }

    @Override
    public String mapMaxFloor(Integer maxFloor) {
        if (maxFloor != null) {
            return "&" + this.properties.getProperty("max_floor") + maxFloor;
        } else {
            return "";
        }
    }

    @Override
    public String mapMinPrice(Integer minPrice) {
        if (minPrice != null) {
            return "&" + this.properties.getProperty("min_price") + minPrice;
        } else {
            return "";
        }
    }

    @Override
    public String mapMaxPrice(Integer maxPrice) {
        if (maxPrice != null) {
            return "&" + this.properties.getProperty("max_price") + maxPrice;
        } else {
            return "";
        }
    }

    @Override
    public String mapTerm(Boolean longTerm) {
        if (longTerm != null) {
            if (longTerm) {
                return "&" + this.properties.getProperty("long_term");
            } else {
                return "&" + this.properties.getProperty("short_term");
            }
        } else {
            return "";
        }
    }

    @Override
    public String mapSorting(SortingType sortingType) {
        switch (sortingType) {
            case DATE_FROM_NEW -> { return "&" + this.properties.getProperty("date_sort"); }
            case PRICE_FROM_LEAST -> { return "&" + this.properties.getProperty("price_sort"); }
            default -> { return ""; }
        }
    }

    @Override
    public String mapPage(Integer page) {
        return "&page=" + page;
    }
}
