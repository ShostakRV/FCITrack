package com.bics.fcitrack.managedbeans;

import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.interfaces.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by godex_000
 * on 22.01.2015.
 */
@Controller
@Scope(value = "request")
public class ReleaseBean {
    @Autowired
    private ReleaseService releaseService;

    private Release selectedRelease;
    private List<Release> releases;

    @PostConstruct
    public void init() {
        selectedRelease = new Release();
        if (releases == null) {
            releases = releaseService.findAll();
        }
    }

    public void save() {
        try {
            releaseService.create(selectedRelease);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Release getSelectedRelease() {
        return selectedRelease;
    }

    public List<Release> getReleases() {
        return releases;
    }
}
