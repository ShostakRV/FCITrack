package com.bics.fcitrack.utils;

import com.bics.fcitrack.model.Release;
import org.hibernate.Hibernate;

/**
 * Created by godex_000
 * on 21.01.2015.
 */
public class EntytyUtils {
    public static Release initializeRelease(Release release) {
        Hibernate.initialize(release.getCommonConfigs());
        return release;
    }
}
