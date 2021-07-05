package n1;

import common.AdDetailsBuilder;
import common.AdDetailsMapper;
import common.entities.DetailedAd;
import common.entities.PreviewAd;
import org.jsoup.nodes.Document;

import java.util.Properties;

public class N1DetailsBuilder implements AdDetailsBuilder {
    @Override
    public DetailedAd buildDetailedAdFrom(Document document, Properties properties, PreviewAd previewAd) {
        AdDetailsMapper adDetailsMapper = new N1DetailsMapper(properties, document);
        DetailedAd detailedAd = adDetailsMapper.mapPreviewAdToDetailedAd(previewAd);
        detailedAd.setImageUrls(adDetailsMapper.mapImageUrls());
        detailedAd.setDescription(adDetailsMapper.mapDescription());
        return detailedAd;
    }
}
