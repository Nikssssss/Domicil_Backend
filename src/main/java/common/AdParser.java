package common;

import common.entities.AdFilters;
import common.entities.DetailedAd;
import common.entities.PreviewAd;

import java.util.ArrayList;

public interface AdParser {
    ArrayList<PreviewAd> parsePreviewsUsing(AdFilters adFilters);
    DetailedAd parseDetailsOf(PreviewAd previewAd);
}
