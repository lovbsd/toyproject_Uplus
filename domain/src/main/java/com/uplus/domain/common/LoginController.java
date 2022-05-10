package com.uplus.domain.common;

import com.uplus.domain.main.service.CodeMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class LoginController {

    String id = "hambuger";
    int password = 1234;

    private final CodeMainService codeMainService;
    @Autowired
    public LoginController(CodeMainService codeMainService) {
        this.codeMainService = codeMainService;
    }

    @RequestMapping("/loginTest")
    public ModelAndView login(HttpSession session) {
        ModelAndView model = new ModelAndView("loginTest");

        return model;
    }
    @RequestMapping("/loginTest1")
    public String login(Model model) {
        ModelAndView modelandview = new ModelAndView("index");

        return "index";
    }

    @RequestMapping("/logintest")
    public USER_ROLE logintests(USER_ROLE user, HttpSession session, String verifycode, Model model)
    {
        USER_ROLE user1 = codeMainService.finduser( id,  password);

        String code= (String) session.getAttribute("verifyCode");

//        if (user1 != null && code.equalsIgnoreCase(verifycode)) {
//            model.addAttribute("message", "Success");
//            return "entered";
//        } else {
//            model.addAttribute("message", "fail");
//            return "enterFailed";
//        }
        return user1;
    }
    @GetMapping("/ex_redirect1")
    public String exRedirect1() {
        return "loginTest";
    }

    @GetMapping("/ex_redirect2")
    public ModelAndView exRedirect2() {
        String projectUrl = "logintest";
        return new ModelAndView("redirect:" + projectUrl);
    }

    // httpServletResponse.sendRedirect
    @GetMapping("/ex_redirect3")
    public void exRedirect3(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendRedirect("index");
    }

    // RedirectView
    @RequestMapping("/ex_redirect4")
    public RedirectView exRedirect4() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("index");
        return redirectView;
    }

    // httpHeaders
    @RequestMapping("/ex_redirect5")
    public ResponseEntity<Object> exRedirect5() throws URISyntaxException {
        URI redirectUri = new URI("logintest");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(redirectUri);
        return new ResponseEntity<>(httpHeaders, HttpStatus.SEE_OTHER);
    }
}
