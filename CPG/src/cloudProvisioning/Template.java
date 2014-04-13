/**
 */
package cloudProvisioning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Template</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudProvisioning.CloudProvisioningPackage#getTemplate()
 * @model
 * @generated
 */
public enum Template implements Enumerator {
	/**
	 * The '<em><b>Linux 64 232 75H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX_64_232_75H_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX_64_232_75H(0, "Linux_64_2_32_7_5_H", "Linux_64_2_32_7_5_H"),

	/**
	 * The '<em><b>Windows 64 868 8H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_64_868_8H_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS_64_868_8H(0, "Windows_64_8_68_8_H", "Windows_64_8_68_8_H");

	/**
	 * The '<em><b>Linux 64 232 75H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Linux 64 232 75H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINUX_64_232_75H
	 * @model name="Linux_64_2_32_7_5_H"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_64_232_75H_VALUE = 0;

	/**
	 * The '<em><b>Windows 64 868 8H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows 64 868 8H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_64_868_8H
	 * @model name="Windows_64_8_68_8_H"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_64_868_8H_VALUE = 0;

	/**
	 * An array of all the '<em><b>Template</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Template[] VALUES_ARRAY =
		new Template[] {
			LINUX_64_232_75H,
			WINDOWS_64_868_8H,
		};

	/**
	 * A public read-only list of all the '<em><b>Template</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Template> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Template</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Template get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Template result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Template</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Template getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Template result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Template</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Template get(int value) {
		switch (value) {
			case LINUX_64_232_75H_VALUE: return LINUX_64_232_75H;
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
	private Template(int value, String name, String literal) {
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
	
} //Template
