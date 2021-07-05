package common;

import common.entities.DetailedAd;
import common.entities.PreviewAd;
import org.jsoup.nodes.Document;

import java.util.Properties;

public interface AdDetailsBuilder {
    DetailedAd buildDetailedAdFrom(Document document, Properties properties, PreviewAd previewAd);
}
