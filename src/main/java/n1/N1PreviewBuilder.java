package n1;

import common.AdPreviewBuilder;
import common.AdPreviewMapper;
import common.entities.AdFilters;
import common.entities.PreviewAd;
import org.jsoup.nodes.Element;

import java.util.Properties;

public class N1PreviewBuilder implements AdPreviewBuilder {
    @Override
    public PreviewAd buildPreviewFrom(Element ad, Properties properties, AdFilters adFilters) {
        AdPreviewMapper adPreviewMapper = new N1PreviewMapper(properties, ad, adFilters);
        PreviewAd previewAd = new PreviewAd();
        previewAd.setAccommodationType(adPreviewMapper.mapAccommodationType());
        previewAd.setRoomsCount(adPreviewMapper.mapRoomsCount());
        previewAd.setAddress(adPreviewMapper.mapAddress());
        previewAd.setPartOfTown(adPreviewMapper.mapPartOfTown());
        previewAd.setTotalArea(adPreviewMapper.mapTotalArea());
        previewAd.setFloor(adPreviewMapper.mapFloor());
        previewAd.setNumberOfFloors(adPreviewMapper.mapNumberOfFloors());
        previewAd.setPrice(adPreviewMapper.mapPrice());
        previewAd.setImageUrl(adPreviewMapper.mapImageUrl());
        previewAd.setSourceUrl(adPreviewMapper.mapSourceUrl());
        return previewAd;
    }
}
