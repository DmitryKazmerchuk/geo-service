package ru.netology.i18n;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import static org.junit.Assert.assertEquals;

class LocalizationServiceImplTest {
    LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
    @Test
    void localeRusTest() {
        Country country = Country.RUSSIA;
        String expected = localizationService.locale(country);
        String actual = "Добро пожаловать";
        assertEquals(expected, actual);
    }

    @Test
    void localeEngTest() {
        Country country = Country.USA;
        String expected = localizationService.locale(country);
        String actual = "Welcome";
        assertEquals(expected, actual);
    }
}