/**
 */
package org.gemoc.qls.model.qls;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enumeration Style Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.gemoc.qls.model.qls.QlsPackage#getEnumerationStyleKind()
 * @model
 * @generated
 */
public enum EnumerationStyleKind implements Enumerator {
	/**
	 * The '<em><b>DROPDOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROPDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DROPDOWN(0, "DROPDOWN", "DROPDOWN"),

	/**
	 * The '<em><b>RADIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO(1, "RADIO", "RADIO");

	/**
	 * The '<em><b>DROPDOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROPDOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DROPDOWN_VALUE = 0;

	/**
	 * The '<em><b>RADIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_VALUE = 1;

	/**
	 * An array of all the '<em><b>Enumeration Style Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumerationStyleKind[] VALUES_ARRAY = new EnumerationStyleKind[] { DROPDOWN, RADIO, };

	/**
	 * A public read-only list of all the '<em><b>Enumeration Style Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumerationStyleKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enumeration Style Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumerationStyleKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumerationStyleKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enumeration Style Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumerationStyleKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumerationStyleKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enumeration Style Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumerationStyleKind get(int value) {
		switch (value) {
		case DROPDOWN_VALUE:
			return DROPDOWN;
		case RADIO_VALUE:
			return RADIO;
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
	private EnumerationStyleKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //EnumerationStyleKind
