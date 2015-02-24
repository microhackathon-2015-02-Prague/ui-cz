package com.ofg.ui.config;

public final class UiCzVersions {
    private UiCzVersions() {
        throw new UnsupportedOperationException("Can't instantiate a utility class");
    }

    public static final String APP_NAME = "com.ofg.ui-cz";
    public static final String VND_PREFIX = "application/vnd";
    public static final String JSON_TYPE_SUFFIX = "+json";

    public static final String VERSION_1 = "v1";
    public static final String UI_CZ_JSON_VERSION_1 = VND_PREFIX + "." + APP_NAME + "." + VERSION_1 + JSON_TYPE_SUFFIX;
}
