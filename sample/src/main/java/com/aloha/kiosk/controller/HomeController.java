package com.aloha.kiosk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aloha.kiosk.dto.RamenDTO;
import com.aloha.kiosk.service.RamenService;

@Controller
public class HomeController {

    private final RamenService ramenService;

    @Autowired
    public HomeController(RamenService ramenService) {
        this.ramenService = ramenService;
    }

    // 🏠 메인 페이지
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // 🍜 라면 주문 페이지
    @GetMapping("/order")
    public String order(Model model) {
        List<RamenDTO> ramenList = ramenService.getAllRamen();
        model.addAttribute("ramenList", ramenList);
        return "order";
    }

    // 🔍 라면 상세 페이지
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id, Model model) {
        RamenDTO ramen = ramenService.getRamenById(id);
        model.addAttribute("ramen", ramen);
        return "detail";
    }

    // 🛒 장바구니 페이지 (임시)
    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }

    // ✅ 결제 확인 페이지 (임시)
    @GetMapping("/confirm")
    public String confirm() {
        return "confirm";
    }
}
