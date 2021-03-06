package com.bics.fcitrack.service.interfaces;

import com.bics.fcitrack.model.Release;

import java.util.List;

/**
 * Created by godex_000 on 20.01.2015.
 */
public interface ReleaseService extends AbstractService<Release, Long> {
    Release findFull(long id);
    public List<Release> findNoReleased();
}
