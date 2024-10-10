package org.falcon.models.identifier;

import org.falcon.models.geo.Geographical;

public interface Identifiable {
    boolean matches(Geographical geographical);
}
