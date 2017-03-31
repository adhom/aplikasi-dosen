package id.ac.tazkia.dosen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by juragan on 3/30/17.
 */
@Controller
public class ProgramStudiController {
    @RequestMapping("/programstudi/form")
    public ModelMap formProgramStudi(){
        return new ModelMap();
    }
}
