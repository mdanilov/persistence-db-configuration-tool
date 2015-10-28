/*******************************************************************************
 * Persistence Configuration Tool Model
 *
 * Copyright (c) 2015 Mentor Graphics and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Mentor Graphics - initial API and implementation
 ******************************************************************************/
package com.xse.optstack.persconf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconf.EConfiguration;
import com.xse.optstack.persconf.EDefaultData;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconf.PersconfPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see com.xse.optstack.persconf.PersconfPackage
 * @generated
 */
public class PersconfAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static PersconfPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersconfAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = PersconfPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance
     * object of the model.
     * <!-- end-user-doc -->
     * 
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected PersconfSwitch<Adapter> modelSwitch = new PersconfSwitch<Adapter>() {
        @Override
        public Adapter caseEApplicationGroup(final EApplicationGroup object) {
            return PersconfAdapterFactory.this.createEApplicationGroupAdapter();
        }

        @Override
        public Adapter caseEApplication(final EApplication object) {
            return PersconfAdapterFactory.this.createEApplicationAdapter();
        }

        @Override
        public Adapter caseEConfiguration(final EConfiguration object) {
            return PersconfAdapterFactory.this.createEConfigurationAdapter();
        }

        @Override
        public Adapter caseEDefaultData(final EDefaultData object) {
            return PersconfAdapterFactory.this.createEDefaultDataAdapter();
        }

        @Override
        public Adapter caseEResource(final EResource object) {
            return PersconfAdapterFactory.this.createEResourceAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return PersconfAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link com.xse.optstack.persconf.EApplicationGroup
     * <em>EApplication Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see com.xse.optstack.persconf.EApplicationGroup
     * @generated
     */
    public Adapter createEApplicationGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link com.xse.optstack.persconf.EApplication
     * <em>EApplication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see com.xse.optstack.persconf.EApplication
     * @generated
     */
    public Adapter createEApplicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link com.xse.optstack.persconf.EConfiguration
     * <em>EConfiguration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see com.xse.optstack.persconf.EConfiguration
     * @generated
     */
    public Adapter createEConfigurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link com.xse.optstack.persconf.EDefaultData
     * <em>EDefault Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see com.xse.optstack.persconf.EDefaultData
     * @generated
     */
    public Adapter createEDefaultDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link com.xse.optstack.persconf.EResource <em>EResource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see com.xse.optstack.persconf.EResource
     * @generated
     */
    public Adapter createEResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //PersconfAdapterFactory