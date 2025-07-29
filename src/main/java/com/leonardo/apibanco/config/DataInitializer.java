package com.leonardo.apibanco.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.leonardo.apibanco.model.domain.Categoria;
import com.leonardo.apibanco.repository.CategoriaRepository;

@Component
public class DataInitializer implements CommandLineRunner {
    private final CategoriaRepository categoriaRepository;

    public DataInitializer(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (categoriaRepository.count() == 0) {
            System.out.println("Nenhuma categoria encontrada, carregando dados iniciais...");

            List<Categoria> categorias = Arrays.asList(
                    Categoria.builder().descricao("Alimentação").build(),
                    Categoria.builder().descricao("Assinaturas e Serviços").build(),
                    Categoria.builder().descricao("Casa").build(),
                    Categoria.builder().descricao("Mercado").build(),
                    Categoria.builder().descricao("Cuidados Pessoais").build(),
                    Categoria.builder().descricao("Educação").build(),
                    Categoria.builder().descricao("Familia").build(),
                    Categoria.builder().descricao("Lazer").build(),
                    Categoria.builder().descricao("Pets").build(),
                    Categoria.builder().descricao("Presentes").build(),
                    Categoria.builder().descricao("Roupas").build(),
                    Categoria.builder().descricao("Saúde").build(),
                    Categoria.builder().descricao("Transporte").build(),
                    Categoria.builder().descricao("Salário").build(),
                    Categoria.builder().descricao("Vendas").build(),
                    Categoria.builder().descricao("Outras receitas").build(),
                    Categoria.builder().descricao("Outras despesas").build()
            );

            categoriaRepository.saveAll(categorias);
            System.out.println("Categorias iniciais carregadas com sucesso.");
        }
    }
}

