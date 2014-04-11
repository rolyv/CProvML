/**
 */
package CPmodeling.impl;

import CPmodeling.CPmodelingPackage;
import CPmodeling.mainMemory;
import CPmodeling.processor;
import CPmodeling.virtualMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPmodeling.impl.virtualMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link CPmodeling.impl.virtualMachineImpl#getVMs <em>VMs</em>}</li>
 *   <li>{@link CPmodeling.impl.virtualMachineImpl#getCPUs <em>CP Us</em>}</li>
 *   <li>{@link CPmodeling.impl.virtualMachineImpl#getRAMs <em>RA Ms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class virtualMachineImpl extends MinimalEObjectImpl.Container implements virtualMachine {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVMs() <em>VMs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMs()
	 * @generated
	 * @ordered
	 */
	protected EList<virtualMachine> vMs;

	/**
	 * The cached value of the '{@link #getCPUs() <em>CP Us</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUs()
	 * @generated
	 * @ordered
	 */
	protected EList<processor> cPUs;

	/**
	 * The cached value of the '{@link #getRAMs() <em>RA Ms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAMs()
	 * @generated
	 * @ordered
	 */
	protected EList<mainMemory> rAMs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected virtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPmodelingPackage.Literals.VIRTUAL_MACHINE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPmodelingPackage.VIRTUAL_MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<virtualMachine> getVMs() {
		if (vMs == null) {
			vMs = new EObjectResolvingEList<virtualMachine>(virtualMachine.class, this, CPmodelingPackage.VIRTUAL_MACHINE__VMS);
		}
		return vMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<processor> getCPUs() {
		if (cPUs == null) {
			cPUs = new EObjectResolvingEList<processor>(processor.class, this, CPmodelingPackage.VIRTUAL_MACHINE__CP_US);
		}
		return cPUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<mainMemory> getRAMs() {
		if (rAMs == null) {
			rAMs = new EObjectResolvingEList<mainMemory>(mainMemory.class, this, CPmodelingPackage.VIRTUAL_MACHINE__RA_MS);
		}
		return rAMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPmodelingPackage.VIRTUAL_MACHINE__NAME:
				return getName();
			case CPmodelingPackage.VIRTUAL_MACHINE__VMS:
				return getVMs();
			case CPmodelingPackage.VIRTUAL_MACHINE__CP_US:
				return getCPUs();
			case CPmodelingPackage.VIRTUAL_MACHINE__RA_MS:
				return getRAMs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CPmodelingPackage.VIRTUAL_MACHINE__NAME:
				setName((String)newValue);
				return;
			case CPmodelingPackage.VIRTUAL_MACHINE__VMS:
				getVMs().clear();
				getVMs().addAll((Collection<? extends virtualMachine>)newValue);
				return;
			case CPmodelingPackage.VIRTUAL_MACHINE__CP_US:
				getCPUs().clear();
				getCPUs().addAll((Collection<? extends processor>)newValue);
				return;
			case CPmodelingPackage.VIRTUAL_MACHINE__RA_MS:
				getRAMs().clear();
				getRAMs().addAll((Collection<? extends mainMemory>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CPmodelingPackage.VIRTUAL_MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CPmodelingPackage.VIRTUAL_MACHINE__VMS:
				getVMs().clear();
				return;
			case CPmodelingPackage.VIRTUAL_MACHINE__CP_US:
				getCPUs().clear();
				return;
			case CPmodelingPackage.VIRTUAL_MACHINE__RA_MS:
				getRAMs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CPmodelingPackage.VIRTUAL_MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CPmodelingPackage.VIRTUAL_MACHINE__VMS:
				return vMs != null && !vMs.isEmpty();
			case CPmodelingPackage.VIRTUAL_MACHINE__CP_US:
				return cPUs != null && !cPUs.isEmpty();
			case CPmodelingPackage.VIRTUAL_MACHINE__RA_MS:
				return rAMs != null && !rAMs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //virtualMachineImpl
