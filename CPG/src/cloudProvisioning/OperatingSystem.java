/**
 */
package cloudProvisioning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operating System</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudProvisioning.CloudProvisioningPackage#getOperatingSystem()
 * @model
 * @generated
 */
public enum OperatingSystem implements Enumerator {
	/**
	 * The '<em><b>Windows Server2008</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_SERVER2008_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS_SERVER2008(0, "WindowsServer2008", "WindowsServer2008"),

	/**
	 * The '<em><b>Window Server2012</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOW_SERVER2012_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOW_SERVER2012(0, "WindowServer2012", "WindowServer2012"),

	/**
	 * The '<em><b>Ubuntu12 04 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU12_04_3_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU12_04_3(0, "Ubuntu12_04_3", "Ubuntu12_04_3"),

	/**
	 * The '<em><b>Ubuntu13 10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU13_10_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU13_10(0, "Ubuntu13_10", "Ubuntu13_10"),

	/**
	 * The '<em><b>RHEL6 5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL6_5_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL6_5(0, "RHEL6_5", "RHEL6_5"),

	/**
	 * The '<em><b>SUSE11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSE11_VALUE
	 * @generated
	 * @ordered
	 */
	SUSE11(0, "SUSE11", "SUSE11"),

	/**
	 * The '<em><b>Windows7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS7_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS7(0, "Windows7", "Windows7");

	/**
	 * The '<em><b>Windows Server2008</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows Server2008</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_SERVER2008
	 * @model name="WindowsServer2008"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_SERVER2008_VALUE = 0;

	/**
	 * The '<em><b>Window Server2012</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Window Server2012</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOW_SERVER2012
	 * @model name="WindowServer2012"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOW_SERVER2012_VALUE = 0;

	/**
	 * The '<em><b>Ubuntu12 04 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ubuntu12 04 3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UBUNTU12_04_3
	 * @model name="Ubuntu12_04_3"
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU12_04_3_VALUE = 0;

	/**
	 * The '<em><b>Ubuntu13 10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ubuntu13 10</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UBUNTU13_10
	 * @model name="Ubuntu13_10"
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU13_10_VALUE = 0;

	/**
	 * The '<em><b>RHEL6 5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RHEL6 5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL6_5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHEL6_5_VALUE = 0;

	/**
	 * The '<em><b>SUSE11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUSE11</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSE11
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUSE11_VALUE = 0;

	/**
	 * The '<em><b>Windows7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS7
	 * @model name="Windows7"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS7_VALUE = 0;

	/**
	 * An array of all the '<em><b>Operating System</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperatingSystem[] VALUES_ARRAY =
		new OperatingSystem[] {
			WINDOWS_SERVER2008,
			WINDOW_SERVER2012,
			UBUNTU12_04_3,
			UBUNTU13_10,
			RHEL6_5,
			SUSE11,
			WINDOWS7,
		};

	/**
	 * A public read-only list of all the '<em><b>Operating System</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperatingSystem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operating System</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperatingSystem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatingSystem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operating System</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperatingSystem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatingSystem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operating System</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperatingSystem get(int value) {
		switch (value) {
			case WINDOWS_SERVER2008_VALUE: return WINDOWS_SERVER2008;
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
	private OperatingSystem(int value, String name, String literal) {
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
	
} //OperatingSystem
