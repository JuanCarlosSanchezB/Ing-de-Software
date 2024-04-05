import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCafeteria {

    //Test de nombre inválido
    @Test
    public void testInvalidName() {
        String entrada = "C4, 7, 8, 9";
        try {
            App.Entrada(entrada);
        } catch (IllegalArgumentException e) {
            assertEquals("El nombre de la bebida no es valido", e.getMessage());
        }
    }

    //Test de tamaño de nombre inválido
    @Test
    public void testInvalidSizeName() {
        String entrada = "C, 7, 8, 9";
        try {
            App.Entrada(entrada);
        } catch (IllegalArgumentException e) {
            assertEquals("El nombre de la bebida no es valido", e.getMessage());
        }
    }

    //Test de tamaño inválido
    @Test
    public void testInvalidSize() {
        String entrada = "Cafe, 0, 500, 1000";
        try {
            App.Entrada(entrada);
        } catch (IllegalArgumentException e) {
            assertEquals("Tamaño inválido", e.getMessage());
        }
    }

    //Test de orden incorrecto
    @Test
    public void testInvalidOrder() {
        String entrada = "Cafe, 6, 5, 10";
        try {
            App.Entrada(entrada);
        } catch (IllegalArgumentException e) {
            assertEquals("Los tamaños no están ordenados de forma ascendente", e.getMessage());
        }
    }

    //Test de orden incorrecto
    @Test
    public void testMoreComas() {
        String entrada = "Cafe, 7, 8, 9,";
        try {
            App.Entrada(entrada);
        } catch (IllegalArgumentException e) {
            assertEquals("Asegurate de que cada numero esté separado SOLO por una coma", e.getMessage());
        }
    }

    //test más de 5 tamaños
    @Test
    public void testMoretamaños() {
        String entrada = "Cafe, 7, 8, 9,10,11,12";
        try {
            App.Entrada(entrada);
        } catch (IllegalArgumentException e) {
            assertEquals("Solo se pueden poner máximo 5 tamaños por bebida", e.getMessage());
        }
    }   
}
