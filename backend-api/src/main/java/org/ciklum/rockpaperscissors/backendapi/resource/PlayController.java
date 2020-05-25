package org.ciklum.rockpaperscissors.backendapi.resource;

import org.ciklum.rockpaperscissors.backendapi.model.RoundDto;
import org.ciklum.rockpaperscissors.backendapi.service.PlayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/play")
public class PlayController {

    private static final Logger LOG = LoggerFactory.getLogger(PlayController.class);

    private final PlayService playService;

    /**
     * Arg Constructor.
     *
     * @param playService the {@link PlayService} to set.
     */
    @Autowired
    public PlayController(final PlayService playService) {
        this.playService = playService;
    }

    @GetMapping(path = "round", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RoundDto> getRound() {
        LOG.info("Round is getting created");
        return ResponseEntity.ok(this.playService.getRound());
    }

}
