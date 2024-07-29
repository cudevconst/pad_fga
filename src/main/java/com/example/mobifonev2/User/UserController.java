package com.example.mobifonev2.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/login")
    public String loginView(Model model){
        model.addAttribute("user", new User());
        return "login";
    }
    @GetMapping("/home")
    public String homeView(Model model){
        return "home";
    }
    @PostMapping("/login")
    public String submitLoginForm(@ModelAttribute("user") User userForm,
                                  Model model) {

        User user = userService.findByUsernameAndPassword(userForm.getUsername(), userForm.getPassword());
        System.out.println(user);
        if (user != null) {
            return "redirect:/home"; // Ví dụ chuyển hướng đến trang /home
        } else {
            // Đăng nhập không thành công, gửi thông báo lỗi trở lại form
            model.addAttribute("error", true);
            return "login"; // Trả về lại trang đăng nhập để hiển thị thông báo lỗi
        }
    }
}
