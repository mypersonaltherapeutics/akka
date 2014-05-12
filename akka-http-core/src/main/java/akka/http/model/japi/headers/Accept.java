package akka.http.model.japi.headers;

import akka.http.model.japi.MediaRange;

/**
 *  Model for the `Accept` header.
 *  Specification: http://tools.ietf.org/html/draft-ietf-httpbis-p2-semantics-26#section-5.3.2
 */
public interface Accept {
    Iterable<MediaRange> getMediaRanges();
}