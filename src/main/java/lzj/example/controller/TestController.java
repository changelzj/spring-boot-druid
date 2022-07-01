package lzj.example.controller;

import lzj.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("list")
    public List<Map<String, Object>> getList() {
        List<Map<String, Object>> list = testService.getList();
        return list;
    }

    @GetMapping("session")
    public String testSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return session.getId();
    }

}



