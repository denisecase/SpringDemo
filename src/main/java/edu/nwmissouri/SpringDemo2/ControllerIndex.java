
package edu.nwmissouri.SpringDemo2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Controller that handles the default request ("/").
 *
 * Use the new Java 15 text blocks to provide our menu. Thymeleaf:
 * https://spring.io/guides/gs/serving-web-content/
 *
 * @author Denise Case
 */
@Controller
public class ControllerIndex {
     /**
     * Map GET request to "/" to index() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/")
    public String index() {
        return "index";
    }
}
