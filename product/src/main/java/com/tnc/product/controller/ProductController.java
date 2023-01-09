package com.tnc.product.controller;

import com.tnc.product.controller.dto.ProductDto;
import com.tnc.product.controller.mapper.DtoMapper;
import com.tnc.product.service.ProductService;
import com.tnc.product.service.domain.ProductDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;
    private final DtoMapper dtoMapper;

    @RequestMapping("/add")
    ResponseEntity<ProductDto> add(@RequestBody ProductDto productDto){
        var prod_domain = productService.add(dtoMapper.toDomain(productDto));
        return ResponseEntity.ok(dtoMapper.toDto(prod_domain));
    }

    @RequestMapping("/getOne/{id}")
    ResponseEntity<ProductDto>get(@PathVariable Long id){
        return ResponseEntity.ok(dtoMapper.toDto(productService.getById(id)));
    }

    @RequestMapping("/getAll")
    ResponseEntity<List<ProductDto>> getAll(){
        return ResponseEntity.ok(dtoMapper.toDtoList(productService.getAll()));
    }

    @RequestMapping("/delete/{id}")
    String deleteById(@PathVariable Long id){
        productService.delete(id);
        return "The product with id number " + id +" was successfully deleted.";
    }

}
