package Vacation;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
class Foods extends Booking {

    String dishName;
    String description;
    List ingredients;
    double preparationTime;
    double cookTime;
    int servingSize; // an int variable to hold the number of servings the recipe makes
    enum cuisineType {Italian, Chinese, Mexican}
    enum dishType {appetizer, entree, dessert}
    enum difficultyLevel {easy, moderate, difficult}
    String recipe; // a String variable to hold the recipe for the dish.
}