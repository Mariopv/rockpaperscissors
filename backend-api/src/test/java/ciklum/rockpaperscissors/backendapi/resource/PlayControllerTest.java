package ciklum.rockpaperscissors.backendapi.resource;

import ciklum.rockpaperscissors.backendapi.model.RoundDto;
import ciklum.rockpaperscissors.backendapi.service.PlayService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class PlayControllerTest {

    @InjectMocks
    private PlayController playController;

    @Mock
    private PlayService playService;

    RoundDto roundDtoResponse;
    @Before
    public void setup() {
        roundDtoResponse = mock(RoundDto.class);
        Mockito.when(playService.getRound()).thenReturn(roundDtoResponse);
    }

    @Test
    public void shouldReturnPlayedRound() {
        ResponseEntity<RoundDto> response = playController.getRound();

        Mockito.verify(playService, Mockito.times(1)).getRound();

        Assert.assertNotNull(response);
        Assert.assertEquals(200, response.getStatusCodeValue());
        Assert.assertEquals(roundDtoResponse, response.getBody());
    }

}
