package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.Assert.assertEquals;

class GeoServiceImplTest {
    GeoServiceImpl geoService = new GeoServiceImpl();
    @Test
    void byIpRus() {
        String ip = "172.";
        Location expected = geoService.byIp(ip);
        Location actual = new Location("Moscow", Country.RUSSIA, null, 0);
        assertEquals(expected.getCity(), actual.getCity());
        assertEquals(expected.getCountry(), actual.getCountry());
    }

    @Test
    void byIpEng() {
        String ip = "96.";
        Location expected = geoService.byIp(ip);
        Location actual = new Location("New York", Country.USA, null, 0);
        assertEquals(expected.getCity(), actual.getCity());
        assertEquals(expected.getCountry(), actual.getCountry());
    }
}