import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class Michael {

	@Test
	void testIngridIntersectJava() {
        var list = List.of("A", "B", "C");
        var list2 = List.of("B", "C");
        var result = List.of("B", "C");

		assertEquals(result, Ingrid.intersect(list, list2));
        assertEquals(List.of(), Ingrid.intersect(List.of(), list));
	}
	
	@Test
	void testIngridSameJava() {
		var list1 = List.of("A", "B", "C", "D", "E", "F");
        var list2 = List.of();
        var list3 = List.of("A", "B", "C");

        assertFalse(Ingrid.same(list1, list2));
        assertFalse(Ingrid.same(list1, list3));
        assertTrue(Ingrid.same(list3, list3));
	}
	
}
