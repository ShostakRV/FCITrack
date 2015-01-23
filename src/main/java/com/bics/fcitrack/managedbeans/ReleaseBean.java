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

    @PostConstruct
    public void init() {
        selectedRelease = new Release();
    }

    public void save() {
        try {
            releaseService.create(selectedRelease);
            selectedRelease = new Release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(Release release){
        releaseService.delete(release);
    }

    public Release getSelectedRelease() {
        return selectedRelease;
    }

    public List<Release> getReleases() {
        return releaseService.findAll();
    }
}
