package co.uk.honestsoftware.pido;

import java.util.concurrent.atomic.AtomicLong;

import org.joda.time.LocalDateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Resource controller.
 */

@RestController
public class PidoController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=GET, path="/entry")
    public PidoEntry entry(
            @RequestParam(value="desc") String desc,
            @RequestParam(value="hence") int daysHence) {
        return new PidoEntry(counter.incrementAndGet(), desc, LocalDateTime.now().plusDays(daysHence));
    }

}
