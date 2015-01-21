package com.bics.fcitrack.service.interfaces;

import com.bics.fcitrack.model.Release;

/**
 * Created by godex_000 on 20.01.2015.
 */
public interface ReleaseService extends AbstractService<Release> {
    Release findFull(long id);
}
