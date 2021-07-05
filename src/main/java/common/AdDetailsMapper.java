package common;

import common.entities.DetailedAd;
import common.entities.PreviewAd;

import java.util.List;

public interface AdDetailsMapper {
    DetailedAd mapPreviewAdToDetailedAd(PreviewAd previewAd);
    List<String> mapImageUrls();
    String mapDescription();
}
