/**
 */
package cloudProvisioning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Network Performance</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudProvisioning.CloudProvisioningPackage#getNetworkPerformance()
 * @model
 * @generated
 */
public enum NetworkPerformance implements Enumerator {
	/**
	 * The '<em><b>Very Low</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_LOW_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_LOW(0, "VeryLow", "VeryLow"),

	/**
	 * The '<em><b>Low</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_VALUE
	 * @generated
	 * @ordered
	 */
	LOW(0, "Low", "Low"),

	/**
	 * The '<em><b>Moderate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_VALUE
	 * @generated
	 * @ordered
	 */
	MODERATE(0, "Moderate", "Moderate"),

	/**
	 * The '<em><b>High</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH(0, "High", "High"),

	/**
	 * The '<em><b>Ten Gigabit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEN_GIGABIT_VALUE
	 * @generated
	 * @ordered
	 */
	TEN_GIGABIT(0, "TenGigabit", "TenGigabit");

	/**
	 * The '<em><b>Very Low</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Very Low</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERY_LOW
	 * @model name="VeryLow"
	 * @generated
	 * @ordered
	 */
	public static final int VERY_LOW_VALUE = 0;

	/**
	 * The '<em><b>Low</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Low</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @model name="Low"
	 * @generated
	 * @ordered
	 */
	public static final int LOW_VALUE = 0;

	/**
	 * The '<em><b>Moderate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Moderate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODERATE
	 * @model name="Moderate"
	 * @generated
	 * @ordered
	 */
	public static final int MODERATE_VALUE = 0;

	/**
	 * The '<em><b>High</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH
	 * @model name="High"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_VALUE = 0;

	/**
	 * The '<em><b>Ten Gigabit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ten Gigabit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEN_GIGABIT
	 * @model name="TenGigabit"
	 * @generated
	 * @ordered
	 */
	public static final int TEN_GIGABIT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Network Performance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NetworkPerformance[] VALUES_ARRAY =
		new NetworkPerformance[] {
			VERY_LOW,
			LOW,
			MODERATE,
			HIGH,
			TEN_GIGABIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Network Performance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NetworkPerformance> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Network Performance</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkPerformance get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkPerformance result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Performance</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkPerformance getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkPerformance result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Performance</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkPerformance get(int value) {
		switch (value) {
			case VERY_LOW_VALUE: return VERY_LOW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NetworkPerformance(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NetworkPerformance
