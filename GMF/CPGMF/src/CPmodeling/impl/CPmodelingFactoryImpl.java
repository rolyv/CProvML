/**
 */
package CPmodeling.impl;

import CPmodeling.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CPmodelingFactoryImpl extends EFactoryImpl implements CPmodelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPmodelingFactory init() {
		try {
			CPmodelingFactory theCPmodelingFactory = (CPmodelingFactory)EPackage.Registry.INSTANCE.getEFactory(CPmodelingPackage.eNS_URI);
			if (theCPmodelingFactory != null) {
				return theCPmodelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CPmodelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPmodelingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CPmodelingPackage.ENVIRONMENT: return createenvironment();
			case CPmodelingPackage.MAIN_MEMORY: return createmainMemory();
			case CPmodelingPackage.PROCESSOR: return createprocessor();
			case CPmodelingPackage.VIRTUAL_MACHINE: return createvirtualMachine();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environment createenvironment() {
		environmentImpl environment = new environmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mainMemory createmainMemory() {
		mainMemoryImpl mainMemory = new mainMemoryImpl();
		return mainMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processor createprocessor() {
		processorImpl processor = new processorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public virtualMachine createvirtualMachine() {
		virtualMachineImpl virtualMachine = new virtualMachineImpl();
		return virtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPmodelingPackage getCPmodelingPackage() {
		return (CPmodelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CPmodelingPackage getPackage() {
		return CPmodelingPackage.eINSTANCE;
	}

} //CPmodelingFactoryImpl
