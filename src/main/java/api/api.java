package api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.Jsonresult;

@RestController
public class api {
    @RequestMapping("/api/role/findpermission")
    public Jsonresult findpermission(String Rolerid){
        return new Jsonresult("200","500",null);
    }
}
