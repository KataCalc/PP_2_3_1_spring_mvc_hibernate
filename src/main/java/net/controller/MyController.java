package net.controller;

import net.model.User;
import net.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    private UserService userService;

    @Autowired
    public MyController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String showAllEmployees(Model model) {

        List<User> allUsers = userService.allUsers();
        model.addAttribute("allUs", allUsers);
        return "all-user";
    }

    @RequestMapping("/addNewUser")
    public String addNewUser(Model model) {
        User user1 = new User();
        model.addAttribute("user1", user1);
        return "user-info";
    }

    @RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute("user1") User user) {
        userService.add(user);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateUser(@RequestParam("usId") int id, Model model) {
        User user = userService.getById(id);
        model.addAttribute("user1", user);
        return "user-info";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("usId") int id) {
        userService.delete(id);
        return "redirect:/";
    }

}
