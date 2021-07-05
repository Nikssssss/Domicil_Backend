package n1;

import common.AdFilterMapper;
import common.AdUrlBuilder;
import common.entities.AdFilters;

import java.util.Properties;

public class N1UrlBuilder implements AdUrlBuilder {
    @Override
    public String buildUrlUsing(AdFilters adFilters, Properties properties) {
        AdFilterMapper adFilterMapper = new N1FilterMapper(properties);
        String domain = adFilterMapper.mapDomain(adFilters.getLocality());
        String accommodation = adFilterMapper.mapAccommodation(adFilters.getAccommodationType());
        String transaction = adFilterMapper.mapTransaction(adFilters.getTransactionType());
        String roomsCount = adFilterMapper.mapRoomsCount(adFilters.getRoomsCount());
        String minTotalArea = adFilterMapper.mapMinTotalArea(adFilters.getMinTotalArea());
        String maxTotalArea = adFilterMapper.mapMaxTotalArea(adFilters.getMaxTotalArea());
        String minFloor = adFilterMapper.mapMinFloor(adFilters.getMinFloor());
        String maxFloor = adFilterMapper.mapMaxFloor(adFilters.getMaxFloor());
        String minPrice = adFilterMapper.mapMinPrice(adFilters.getMinPrice());
        String maxPrice = adFilterMapper.mapMaxPrice(adFilters.getMaxPrice());
        String term = adFilterMapper.mapTerm(adFilters.getLongTerm());
        String sorting = adFilterMapper.mapSorting(adFilters.getSortingType());
        String page = adFilterMapper.mapPage(adFilters.getPage());
        return domain + accommodation + transaction + roomsCount +
                minTotalArea + maxTotalArea + minFloor + maxFloor +
                minPrice + maxPrice + term + sorting + page;
    }
}
