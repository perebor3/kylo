/**
 * 
 */
package com.thinkbiganalytics.alerts.spi;

import java.net.URL;

import com.thinkbiganalytics.alerts.api.Alert;

/**
 *
 * @author Sean Felten
 */
public interface AlertManager extends AlertSource {

    <C> Alert create(URL type, String description, C content);
    
    Alert remove(Alert.ID id);
}
