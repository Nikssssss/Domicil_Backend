package common;

import common.entities.AdFilters;

import java.util.Properties;

public interface AdUrlBuilder {
    String buildUrlUsing(AdFilters adFilters, Properties properties);
}
