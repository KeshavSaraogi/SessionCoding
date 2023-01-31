package Collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashEquals {
	
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(long i) {
		this.id = i;
	}

	public static void main(String[] args) {
		HashEquals h1 = new HashEquals();
		HashEquals h2 = new HashEquals();
		
		h1.setId(100);
		h2.setId(100);
		
		System.out.println(h1.equals(h2));
		
		Set<HashEquals> s = new HashSet<HashEquals>();
		s.add(h1);
		s.add(h2);
		System.out.println(s);

	}
	
	//why we need to override the hashcode methods - very important 

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashEquals other = (HashEquals) obj;
		return Objects.equals(id, other.id);
	}
}
