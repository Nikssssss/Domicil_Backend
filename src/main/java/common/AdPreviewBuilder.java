package common;

import common.entities.AdFilters;
import common.entities.PreviewAd;
import org.jsoup.nodes.Element;

import java.util.Properties;

public interface AdPreviewBuilder {
    PreviewAd buildPreviewFrom(Element ad, Properties properties, AdFilters adFilters);
}
