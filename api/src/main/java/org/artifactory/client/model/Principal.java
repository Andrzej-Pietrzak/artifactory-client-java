package org.artifactory.client.model;

import java.util.List;

/**
 * @author jbaruch
 * @since 22/11/12
 */
public interface Principal {

    String getName();
    List<Privilege> getPrivileges();

    boolean isAllowedTo(Privilege... privileges);
}
