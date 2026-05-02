import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

// Michael made these tests

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
		List<String> list2 = new ArrayList<>();
        var list3 = List.of("A", "B", "C");
        var list4 = List.of("Z", "T", "F");

        assertFalse(Ingrid.same(list1, list2));
        assertFalse(Ingrid.same(list1, list3));
        assertFalse(Ingrid.same(list3, list4));
        assertTrue(Ingrid.same(list3, list3));
	}
	
}
