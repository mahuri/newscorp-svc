package au.com.newscorp.interview.model;


import java.util.HashMap;
import java.util.Map;

public enum MediaType {
    MOVIE("movie"),
    TV("tv"),
    PERSON("person");

    private static final Map<String, MediaType> lookup = prepareLookup();

    private static Map<String, MediaType> prepareLookup() {
        Map<String, MediaType> mtMap = new HashMap<>();
        for (MediaType mediaType : MediaType.values()) {
            mtMap.put(mediaType.value, mediaType);
        }
        return mtMap;
    }

    private final String value;

    public static MediaType get(String value) {
        return lookup.get(value);
    }

    MediaType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
