import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clojure.java.api.Clojure;

// Jacob made these tests

class Jacob {
	@BeforeAll
	static void requires() {
        var require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read("Christian"));
        require.invoke(Clojure.read("Michael"));
	}

	@Test
	void testChristianMemberClojure() {
		var member = Clojure.var("Christian", "member");
		var list = List.of("A", "B", "C", "D", "E");
		assertTrue((Boolean)member.invoke("D", list));
		assertFalse((Boolean)member.invoke("Z", list));
	}

	@Test
	void testIngridMemberJava() {
		var list = List.of("A", "B", "C", "D", "E");
		assertTrue(Ingrid.member("D", list));
		assertFalse(Ingrid.member("Z", list));
	}
	
	@Test
	void testIngridAppendJava() {
		var list = List.of("A", "B", "C");
		var list2 = List.of("Z", "Y", "X");
		assertEquals(List.of("A", "B", "C", "Z", "Y", "X"), Ingrid.append(list, list2));
		
		List<String> list3 = new ArrayList<>();
		assertEquals(List.of("A", "B", "C"), Ingrid.append(list, list3));
		assertEquals(List.of("A", "B", "C"), Ingrid.append(list3, list));
	}
	
	@Test
	void testIngridMapJava() {
		var list = List.of(1, 3, 5);
		assertEquals(List.of(2, 4, 6), Ingrid.map(x -> x + 1, list));
	}
	
}
