package throttling.better;

public interface Throttler {

    int getAllowedClientCount(String clientName);

    int getActualClientCount(String clientName);

    default boolean canAccessReource(String clientName) {
        return getAllowedClientCount(clientName) >= getActualClientCount(clientName);
    }
}
