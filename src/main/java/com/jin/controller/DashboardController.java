package com.jin.controller;

import com.jin.domain.User;
import com.jin.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/dashboard")
    public String getDashboard(@AuthenticationPrincipal User user, ModelMap model) {
        model.put("user", user);
        List<User> allUserAccounts = adminService.getAllUserAccounts();
        return "dashboard";
    }
}
