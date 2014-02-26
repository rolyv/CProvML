/**
 */
package CPmodeling.impl;

import CPmodeling.CPmodelingPackage;
import CPmodeling.environment;
import CPmodeling.mainMemory;
import CPmodeling.processor;
import CPmodeling.virtualMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPmodeling.impl.environmentImpl#getVMs <em>VMs</em>}</li>
 *   <li>{@link CPmodeling.impl.environmentImpl#getCPUs <em>CP Us</em>}</li>
 *   <li>{@link CPmodeling.impl.environmentImpl#getRAMs <em>RA Ms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class environmentImpl extends MinimalEObjectImpl.Container implements environment {
	/**
	 * The cached value of the '{@link #getVMs() <em>VMs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMs()
	 * @generated
	 * @ordered
	 */
	protected EList<virtualMachine> vMs;

	/**
	 * The cached value of the '{@link #getCPUs() <em>CP Us</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUs()
	 * @generated
	 * @ordered
	 */
	protected EList<processor> cPUs;

	/**
	 * The cached value of the '{@link #getRAMs() <em>RA Ms</em>}' containment reference list.
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
	protected environmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPmodelingPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<virtualMachine> getVMs() {
		if (vMs == null) {
			vMs = new EObjectContainmentEList<virtualMachine>(virtualMachine.class, this, CPmodelingPackage.ENVIRONMENT__VMS);
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
			cPUs = new EObjectContainmentEList<processor>(processor.class, this, CPmodelingPackage.ENVIRONMENT__CP_US);
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
			rAMs = new EObjectContainmentEList<mainMemory>(mainMemory.class, this, CPmodelingPackage.ENVIRONMENT__RA_MS);
		}
		return rAMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPmodelingPackage.ENVIRONMENT__VMS:
				return ((InternalEList<?>)getVMs()).basicRemove(otherEnd, msgs);
			case CPmodelingPackage.ENVIRONMENT__CP_US:
				return ((InternalEList<?>)getCPUs()).basicRemove(otherEnd, msgs);
			case CPmodelingPackage.ENVIRONMENT__RA_MS:
				return ((InternalEList<?>)getRAMs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPmodelingPackage.ENVIRONMENT__VMS:
				return getVMs();
			case CPmodelingPackage.ENVIRONMENT__CP_US:
				return getCPUs();
			case CPmodelingPackage.ENVIRONMENT__RA_MS:
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
			case CPmodelingPackage.ENVIRONMENT__VMS:
				getVMs().clear();
				getVMs().addAll((Collection<? extends virtualMachine>)newValue);
				return;
			case CPmodelingPackage.ENVIRONMENT__CP_US:
				getCPUs().clear();
				getCPUs().addAll((Collection<? extends processor>)newValue);
				return;
			case CPmodelingPackage.ENVIRONMENT__RA_MS:
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
			case CPmodelingPackage.ENVIRONMENT__VMS:
				getVMs().clear();
				return;
			case CPmodelingPackage.ENVIRONMENT__CP_US:
				getCPUs().clear();
				return;
			case CPmodelingPackage.ENVIRONMENT__RA_MS:
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
			case CPmodelingPackage.ENVIRONMENT__VMS:
				return vMs != null && !vMs.isEmpty();
			case CPmodelingPackage.ENVIRONMENT__CP_US:
				return cPUs != null && !cPUs.isEmpty();
			case CPmodelingPackage.ENVIRONMENT__RA_MS:
				return rAMs != null && !rAMs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //environmentImpl
