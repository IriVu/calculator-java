import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testCalculate_RedosledOperacija() {
        // Arrange (Priprema) - Kreiramo objekat kalkulatora i zadajemo izraz iz zadatka
        Calculator calculator = new Calculator();
        String aritmetickiIzraz = "10+5*4+3";
        
        // Očekivani rezultat u skladu sa matematičkim prioritetom (5*4=20, 10+20+3=33)
        double ocekivaniRezultat = 33.0;

        // Act (Izvršavanje) - Pozivamo metodu koju testiramo
        // NAPOMENA: Prilagodi naziv metode (npr. 'calculate' ili kako god da se zove u tvom Calculator.java)
        double stvarniRezultat = calculator.calculate(aritmetickiIzraz);

        // Assert (Provera) - Proveravamo da li je stvarni rezultat jednak očekivanom
        // Treći parametar (0.001) je delta (dozvoljeno odstupanje za double tipove podataka)
        assertEquals(ocekivaniRezultat, stvarniRezultat, 0.001, 
            "Greška: Metoda za računanje ne poštuje matematički prioritet operacija!");
    }
}
