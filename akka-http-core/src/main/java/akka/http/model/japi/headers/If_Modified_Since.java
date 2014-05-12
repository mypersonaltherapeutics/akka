package akka.http.model.japi.headers;

import akka.http.model.japi.DateTime;

/**
 *  Model for the `If-Modified-Since` header.
 *  Specification: http://tools.ietf.org/html/draft-ietf-httpbis-p4-conditional-26#section-3.3
 */
public abstract class If_Modified_Since extends akka.http.model.HttpHeader {
    public abstract DateTime date();
}
