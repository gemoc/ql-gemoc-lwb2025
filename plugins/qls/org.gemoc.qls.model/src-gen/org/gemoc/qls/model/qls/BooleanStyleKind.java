/**
 */
package org.gemoc.qls.model.qls;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Boolean Style Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.gemoc.qls.model.qls.QlsPackage#getBooleanStyleKind()
 * @model
 * @generated
 */
public enum BooleanStyleKind implements Enumerator {
	/**
	 * The '<em><b>CHECKBOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKBOX(0, "CHECKBOX", "CHECKBOX"),

	/**
	 * The '<em><b>TWO RADIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_RADIO_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_RADIO(1, "TWO_RADIO", "TWO_RADIO"),

	/**
	 * The '<em><b>DROPDOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROPDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DROPDOWN(2, "DROPDOWN", "DROPDOWN");

	/**
	 * The '<em><b>CHECKBOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHECKBOX_VALUE = 0;

	/**
	 * The '<em><b>TWO RADIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_RADIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_RADIO_VALUE = 1;

	/**
	 * The '<em><b>DROPDOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROPDOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DROPDOWN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Boolean Style Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BooleanStyleKind[] VALUES_ARRAY = new BooleanStyleKind[] { CHECKBOX, TWO_RADIO, DROPDOWN, };

	/**
	 * A public read-only list of all the '<em><b>Boolean Style Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BooleanStyleKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Boolean Style Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BooleanStyleKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BooleanStyleKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Boolean Style Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BooleanStyleKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BooleanStyleKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Boolean Style Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BooleanStyleKind get(int value) {
		switch (value) {
		case CHECKBOX_VALUE:
			return CHECKBOX;
		case TWO_RADIO_VALUE:
			return TWO_RADIO;
		case DROPDOWN_VALUE:
			return DROPDOWN;
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
	private BooleanStyleKind(int value, String name, String literal) {
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

} //BooleanStyleKind
