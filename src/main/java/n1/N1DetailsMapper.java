package n1;

import common.AdDetailsMapper;
import common.entities.DetailedAd;
import common.entities.PreviewAd;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class N1DetailsMapper implements AdDetailsMapper {
    private final Properties properties;
    private final Document document;

    public N1DetailsMapper(Properties properties, Document document) {
        this.properties = properties;
        this.document = document;
    }

    @Override
    public DetailedAd mapPreviewAdToDetailedAd(PreviewAd previewAd) {
        DetailedAd detailedAd = new DetailedAd();
        detailedAd.setAccommodationType(previewAd.getAccommodationType());
        detailedAd.setRoomsCount(previewAd.getRoomsCount());
        detailedAd.setAddress(previewAd.getAddress());
        detailedAd.setPartOfTown(previewAd.getPartOfTown());
        detailedAd.setTotalArea(previewAd.getTotalArea());
        detailedAd.setFloor(previewAd.getFloor());
        detailedAd.setNumberOfFloors(previewAd.getNumberOfFloors());
        detailedAd.setPrice(previewAd.getPrice());
        detailedAd.setSourceUrl(previewAd.getSourceUrl());
        return detailedAd;
    }

    @Override
    public List<String> mapImageUrls() {
        Elements imageUrlElements = document.select(properties.getProperty("detailed_ad_images_query"));
        return imageUrlElements
                .stream()
                .map(element -> element.attr("href"))
                .collect(Collectors.toList());
    }

    @Override
    public String mapDescription() {
        return document.select(properties.getProperty("detailed_ad_description_query")).text();
    }
}
