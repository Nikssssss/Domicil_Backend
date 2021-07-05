import common.AdParser;
import common.entities.AdFilters;
import common.entities.PreviewAd;
import common.enums.AccommodationType;
import common.enums.SortingType;
import common.enums.TransactionType;
import n1.N1Parser;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AdParser n1Parser = new N1Parser();
        AdFilters adFilters = new AdFilters();
        adFilters
                .locality("novosibirsk")
                .accommodationType(AccommodationType.APARTMENT)
                .transactionType(TransactionType.SELL)
                .roomsCount(new Integer[]{1, 2})
                .minTotalArea(25)
                .maxTotalArea(45)
                .minFloor(2)
                .maxFloor(5)
                .minPrice(1000000)
                .maxPrice(2000000)
                .sortingType(SortingType.DATE_FROM_NEW)
                .page(1);
        ArrayList<PreviewAd> previewAds = n1Parser.parsePreviewsUsing(adFilters);
        for (var previewAd : previewAds) {
            System.out.println(previewAd);
        }
    }
}
