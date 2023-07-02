package com.varman.myrecipe.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Recipes {
    List<Recipe> recipeList;
}
