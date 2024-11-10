package com.example.gtics_lab9_20182693.controller;
import com.example.gtics_lab9_20182693.entity.Coctel;
import com.example.gtics_lab9_20182693.repository.CoctelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/coctel")
public class CoctelController {

final CoctelRepository coctelRepository;
public CoctelController(CoctelRepository coctelRepository) {
    this.coctelRepository = coctelRepository;
}

    private static final String URL_COCKTAILS = "https://www.thecocktaildb.com/api/json/v1/1/filter.php?c=Cocktail";


    //LISTAR
    @GetMapping(value = {"/list", ""})
    public List<Coctel> listaCocteles() {
        return coctelRepository.findAll();
    }


}
