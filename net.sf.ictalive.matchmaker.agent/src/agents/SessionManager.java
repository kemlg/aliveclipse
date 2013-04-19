package agents;

import agents.Message.ServiceQuery;
import com.google.common.collect.MapMaker;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class SessionManager {
    private final ConcurrentMap<String, ServiceQuery> sessions =
            new MapMaker().expiration(2, TimeUnit.MINUTES).softValues().makeMap();
    private final AtomicInteger sessionIdGenerator = new AtomicInteger(0);

    SessionManager() { }

    String addSession(ServiceQuery serviceQuery) {
        String sessionId = Integer.toHexString(sessionIdGenerator.getAndIncrement());
        sessions.put(sessionId, serviceQuery);
        return sessionId;
    }

    void removeSession(String sessionId) {
        sessions.remove(sessionId);
    }

    ServiceQuery lookupSession(String sessionId) {
        return sessions.get(sessionId);
    }
}
