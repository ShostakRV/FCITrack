package com.bics.fcitrack.dao;

import com.bics.fcitrack.model.Release;

import java.util.List;

/**
 * Created by godex_000 on 20.01.2015.
 */
public interface ReleaseDao extends AbstractDao<Release, Long> {
    public List<Release> findNoReleased();
}