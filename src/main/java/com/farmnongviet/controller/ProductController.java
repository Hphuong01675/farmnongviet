package com.farmnongviet.controller;

import com.farmnongviet.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    // ================= LIST =================
    @GetMapping("/products")
    public String productList(Model model){

        List<Product> products = List.of(

            new Product("chanh-khong-hat","Chanh Không Hạt","/images/products/chanhkhonghat/chanh1.jpg"),
            new Product("ot","Ớt","/images/products/ot/ot1.jpg"),
            new Product("gung","Gừng","/images/products/gung/gung6.jpg"),
            new Product("thanh-long","Thanh Long","/images/products/thanhlong/thanhlong1.jpg"),
            new Product("dua","Dừa","/images/products/dua/dua1.jpg"),
            new Product("thom","Thơm (Dứa)","/images/products/thom/thom4.jpg"),
            new Product("sau-rieng","Sầu Riêng","/images/products/saurieng/sau1.jpg"),
            new Product("tieu","Tiêu","/images/products/tieu/tieu1.jpg")
        );

        model.addAttribute("products", products);
        model.addAttribute("content","pages/product-list");

        return "layout/base";
    }


    // ================= DETAIL =================
    @GetMapping("/product/{slug}")
    public String productDetail(
            @PathVariable String slug,
            Model model){

        // truyền template detail
        model.addAttribute(
                "content",
                "pages/product-detail"
        );

        // fragment sẽ load file trong templates/products/
        model.addAttribute(
                "contentTemplate",
                "products/" + slug
        );

        return "layout/base";
    }
}