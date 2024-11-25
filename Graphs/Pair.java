/** Stores a pair of Strings. 
* This is a homegrown version of the Java Pair with generic type. 
*/
public class Pair<T1,T2> {
	/** The first value of the pair */
	private T1 value1;
	/** The second value of the pair */
	private T2 value2;

	/** Constructor with values to add.
	 * 
	 * @param v1 value stored as the first in the pair
	 * @param v2 value stored as the second in the pair
	 */
	public Pair(T1 v1, T2 v2) {
		value1 = v1;
		value2 = v2;
	}
	
	@Override
	public String toString() {
		return value1+", "+value2;
	}
	
	/** Getter for either the first or second element. */
	T1 first() {
		return value1;
	}
	
	T2 second() {
		return value2;
	}
}