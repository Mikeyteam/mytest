package ru.mai.springmvc.actions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * User: Eugene
 * Date: 04.12.2010
 * Time: 11:18:24
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class WelcomeController {

    @RequestMapping("/index.html")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(value = "/login.html", method = {RequestMethod.POST})
    public ModelAndView login(LoginForm form, HttpSession session) {
        System.out.println("Login: " + form.getLogin());
        System.out.println("Password: " + form.getPassword());

        session.setAttribute("login", form.getLogin());

        form.setSuccess(true);

//        return new ModelAndView("welcome", "form", form);
        return new ModelAndView("redirect:/index.html");
    }

    @RequestMapping("/logout.html")
    public String logout(HttpSession session) {
        session.removeAttribute("login");
        return "welcome";
    }

}
