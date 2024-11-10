package com.example.gtics_lab9_20182693.controller;
import com.example.gtics_lab9_20182693.dao.CoctelDao;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/coctel")
public class CoctelController {

    final CoctelDao coctelDao;

    public CoctelController(CoctelDao coctelDao) {

        this.coctelDao = coctelDao;
    }
    @GetMapping({"/list", "", "/"})
    public String listarProductos(Model model) {
        model.addAttribute("listaCocteles", coctelDao.listar());
        return "product/list";
    }
}
