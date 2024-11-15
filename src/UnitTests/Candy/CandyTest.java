package UnitTests.Candy;

import Candy.Candy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CandyTest {
    private Candy candy;

    @BeforeEach
    public void setUp() {
        candy = new Candy ("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник",
                "Поліетилен", 8, 318, 65.5, false,
                "Фруктовий сік", "-", "Фрукти");
    }

    @Test
    void getSetNameTest() {
        String name = "testData";
        candy.setName(name);
        assertEquals(name, candy.getName());
    }

    @Test
    void getSetBrandTest() {
        String brand = "testData";
        candy.setBrand(brand);
        assertEquals(brand, candy.getBrand());
    }

    @Test
    void getSetTypeTest() {
        String type = "testData";
        candy.setType(type);
        assertEquals(type, candy.getType());
    }

    @Test
    void getSetShapeTest() {
        String shape = "testData";
        candy.setShape(shape);
        assertEquals(shape, candy.getShape());
    }

    @Test
    void getSetPackageTypeTest() {
        String PackageType = "testData";
        candy.setPackageType(PackageType);
        assertEquals(PackageType, candy.getPackageType());
    }

    @Test
    void getSetWeightTest() {
        double Weight = 20.57;
        candy.setWeight(Weight);
        assertEquals(Weight, candy.getWeight());
    }

    @Test
    void getSetCalorieContentTest() {
        double CalorieContent = 20.57;
        candy.setCalorieContent(CalorieContent);
        assertEquals(CalorieContent, candy.getCalorieContent());
    }

    @Test
    void getSetSugarContentTest() {
        double SugarContent = 20.57;
        candy.setSugarContent(SugarContent);
        assertEquals(SugarContent, candy.getSugarContent());
    }

    @Test
    void getSetHypoallergenicTest() {
        boolean Hypoallergenic = true;
        candy.setHypoallergenic(Hypoallergenic);
        assertEquals(Hypoallergenic, candy.getHypoallergenic());
    }

    @Test
    void getSetFillingTest() {
        String Filling = "testData";
        candy.setFilling(Filling);
        assertEquals(Filling, candy.getFilling());
    }

    @Test
    void getSetAdditivesTest() {
        String Additives = "testData";
        candy.setAdditives(Additives);
        assertEquals(Additives, candy.getAdditives());
    }

    @Test
    void getSetFlavorsTest() {
        String Flavors = "testData";
        candy.setFlavors(Flavors);
        assertEquals(Flavors, candy.getFlavors());
    }

    @Test
    void toStringTest() {
        String expected = "\nНазва: " + "Шалена Бджілка" + "\n Виробник: " + "Roshen" + "\n Тип: " + "Желейна" +
                "\n Форма: " + "Прямокутник" + "\n Тип пакунку: " + "Поліетилен" + "\n Вага: " + 8.0 + " грам" +
                "\n Калорійність: " + 318.0 + " ккал" + "\n Вміст цукру: " + 65.5 + " грам" + "\n Гіпоалергенність: " + false +
                "\n Наповнювач: " + "Фруктовий сік" + "\n Добавки: " + "-" + "\n Ароматизатори: " + "Фрукти";

        String tested = candy.toString();
        assertEquals(expected, tested);
    }

}
