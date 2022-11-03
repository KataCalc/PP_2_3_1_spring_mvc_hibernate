package net.controller;

import net.model.User;
import net.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyController {

    private UserService userService;

    @Autowired
    public MyController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String showAllUsers(Model model) {
        List<User> allUsers = userService.allUsers();
        model.addAttribute("allUs", allUsers);
        return "all-user";
    }

    @GetMapping (value = "/addNewUser")
    public String addNewUser(Model model) {
        User user1 = new User();
        model.addAttribute("user1", user1);
        return "user-info";
    }

    @PostMapping  (value = "/saveUser")
    public String saveUser(@ModelAttribute("user1") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @PostMapping  (value = "/getUser")
    public String getUser(@ModelAttribute("user1") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }


    @RequestMapping(value = "/updateInfo")
    public String updateUser(@RequestParam("usId") int id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user1", user);
        if (id!=0)
        return "user-info2";
        return "user-info";
    }

    @GetMapping(value = "/deleteUser")
    public String deleteUser(@RequestParam("usId") int id) {
        userService.delete(id);
        return "redirect:/";
    }

}
