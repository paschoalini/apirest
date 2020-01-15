package com.paschoalini.apirest.repository;

import com.paschoalini.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
