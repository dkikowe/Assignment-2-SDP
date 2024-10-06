package task2;

public class Main {
    public static void main(String[] args) {
        ThemeFactory lightFactory = new LightThemeFactory();
        Button lightButton = lightFactory.createButton();
        Checkbox lightCheckbox = lightFactory.createCheckbox();
        lightButton.display();
        lightCheckbox.display();

        ThemeFactory darkFactory = new DarkThemeFactory();
        Button darkButton = darkFactory.createButton();
        Checkbox darkCheckbox = darkFactory.createCheckbox();
        darkButton.display();
        darkCheckbox.display();
    }
}