package developer.alldataint.com.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import developer.alldataint.com.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.web.bind.annotation.*;
import org.json.*;

@RestController
public class SendController {

    @Autowired
    private SendService sendService;


    @RequestMapping(value="/send", method = RequestMethod.POST)
    public String sendName(@RequestBody String name)
    {
        JSONObject json = new JSONObject(name);

        System.out.println("Succes send : "+ json);
        sendService.sendName(json.toString());
        return  name.toString();
    }
}
