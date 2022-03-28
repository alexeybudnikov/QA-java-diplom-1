import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class IngredientTest {

    private final static String NAME = "ingredient_name";
    private final static float PRICE = 10;

    @Test
    public void shouldReturnIngredientType() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, NAME, PRICE);
        IngredientType actualType = ingredient.getType();
        assertEquals("getType() returns incorrect type of ingredient", IngredientType.SAUCE, actualType);
    }

    @Test
    public void shouldReturnPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, NAME, PRICE);
        float actualPrice = ingredient.getPrice();
        assertEquals("getPrice() returns incorrect price of ingredient", 10, actualPrice, 0);
    }

    @Test
    public void shouldReturnName() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, NAME, PRICE);
        String actualResult = ingredient.getName();
        assertEquals("getName() returns incorrect name of ingredient", NAME, actualResult);
    }
}