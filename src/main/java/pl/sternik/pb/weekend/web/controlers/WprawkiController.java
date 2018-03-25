package pl.sternik.pb.weekend.web.controlers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class WprawkiController {

    
    @RequestMapping(path = "/wprawki-jsp", method = RequestMethod.GET)
    public String wprawki(ModelMap model) {
        model.put("msg", "Wartosc z modelu");
        model.addAttribute("data", new Date());
        return "wprawki-jsp";
    }

    @GetMapping("/wprawki-jsp/{id}")
    public String wprawki(@PathVariable String cos, ModelMap model) {
        model.addAttribute("cos", cos);
        model.put("msg", "Wartosc z modelu");
        model.addAttribute("data", new Date());
        return "wprawki-jsp";
    }
    
    @RequestMapping(value="/wprawki2")
    @ResponseBody
    public String wprawkiParam(@RequestParam("id") int id, ModelMap model) {
    	return "wprawki z id= " + id;
    }
}