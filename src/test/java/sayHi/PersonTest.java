package sayHi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	Person R;
	Person J;
	Person K;
	Person L;

	@BeforeEach
	void setUp() throws Exception {
		R = new Person("romeo","Montegeux",11);
		J = new Person("juliette","gagliardi",17);
		K = new Person("kery","hey",25);
		L = new Person("larry","jobs",30);
	}

	@Test
	void testToString() {
		assertEquals("Person: romeo Montegeux, 11",R.toString());
	}
	
	@Test
	void testPerson() {
		assertThrows(UnderAgeException.class, ()-> {
			R.makePerson(J);
		});
		assertThrows(UnderAgeException.class, ()-> {
			K.makePerson(J);
		});
		assertThrows(UnderAgeException.class, ()-> {
			R.makePerson(L);
		});
		
		try {
			Person child = L.makePerson(K);
			assertEquals(L.getFname(),child.getFname());
			assertEquals(K.getLname(),child.getLname());
			assertEquals(0,child.getAge());
		} catch (UnderAgeException e) {
			e.printStackTrace();
			fail("person not made with adults");
		}
	}

}
