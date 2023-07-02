package com.varman.myrecipe.resources;

import com.varman.myrecipe.model.Recipe;
import com.varman.myrecipe.model.RecipeRepository;
import com.varman.myrecipe.model.Recipes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @CrossOrigin
    @GetMapping("/recipes")
    public Mono<Recipes> getRecipes() {
        recipeRepository.save(Recipe.builder().id(UUID.randomUUID()).name("Sambar").build());
        List<Recipe> recipeList = Arrays.asList(
                Recipe.builder().id(UUID.randomUUID()).name("Rasam").build(),
                Recipe.builder().id(UUID.randomUUID()).name("Sambar").build()
        );
        return Mono.just(Recipes.builder().recipeList(recipeList).build());
    }
}
