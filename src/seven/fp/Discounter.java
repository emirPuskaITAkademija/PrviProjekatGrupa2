package seven.fp;

import java.math.BigDecimal;

/**
 * Apstraktne klase:
 * <li>1. static and non static fields ili polja</li>
 * <li>2. konstruktor</li>
 * <li>3. metode ili funkcije potpuno definirane ali može imati i apstraktne metode(non-static and static)</li>
 *
 * Interfejsi:
 * <li>1. public static final polja..ne može imati non static polja</li>
 * <li>2. NE MOŽE imati konstruktor</li>
 * <li>3. default metode i apstraktne metode i static metode</li>
 */
@FunctionalInterface
public interface Discounter {
    double applyDiscount(double amount);
}
