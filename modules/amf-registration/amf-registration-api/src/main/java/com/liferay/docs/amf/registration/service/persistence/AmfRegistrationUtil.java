/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.amf.registration.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.amf.registration.model.AmfRegistration;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the amf registration service. This utility wraps {@link com.liferay.docs.amf.registration.service.persistence.impl.AmfRegistrationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see AmfRegistrationPersistence
 * @see com.liferay.docs.amf.registration.service.persistence.impl.AmfRegistrationPersistenceImpl
 * @generated
 */
@ProviderType
public class AmfRegistrationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AmfRegistration amfRegistration) {
		getPersistence().clearCache(amfRegistration);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AmfRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AmfRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AmfRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AmfRegistration> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AmfRegistration update(AmfRegistration amfRegistration) {
		return getPersistence().update(amfRegistration);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AmfRegistration update(AmfRegistration amfRegistration,
		ServiceContext serviceContext) {
		return getPersistence().update(amfRegistration, serviceContext);
	}

	/**
	* Caches the amf registration in the entity cache if it is enabled.
	*
	* @param amfRegistration the amf registration
	*/
	public static void cacheResult(AmfRegistration amfRegistration) {
		getPersistence().cacheResult(amfRegistration);
	}

	/**
	* Caches the amf registrations in the entity cache if it is enabled.
	*
	* @param amfRegistrations the amf registrations
	*/
	public static void cacheResult(List<AmfRegistration> amfRegistrations) {
		getPersistence().cacheResult(amfRegistrations);
	}

	/**
	* Creates a new amf registration with the primary key. Does not add the amf registration to the database.
	*
	* @param fakeAttribute the primary key for the new amf registration
	* @return the new amf registration
	*/
	public static AmfRegistration create(java.lang.String fakeAttribute) {
		return getPersistence().create(fakeAttribute);
	}

	/**
	* Removes the amf registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fakeAttribute the primary key of the amf registration
	* @return the amf registration that was removed
	* @throws NoSuchAmfRegistrationException if a amf registration with the primary key could not be found
	*/
	public static AmfRegistration remove(java.lang.String fakeAttribute)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationException {
		return getPersistence().remove(fakeAttribute);
	}

	public static AmfRegistration updateImpl(AmfRegistration amfRegistration) {
		return getPersistence().updateImpl(amfRegistration);
	}

	/**
	* Returns the amf registration with the primary key or throws a {@link NoSuchAmfRegistrationException} if it could not be found.
	*
	* @param fakeAttribute the primary key of the amf registration
	* @return the amf registration
	* @throws NoSuchAmfRegistrationException if a amf registration with the primary key could not be found
	*/
	public static AmfRegistration findByPrimaryKey(
		java.lang.String fakeAttribute)
		throws com.liferay.docs.amf.registration.exception.NoSuchAmfRegistrationException {
		return getPersistence().findByPrimaryKey(fakeAttribute);
	}

	/**
	* Returns the amf registration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fakeAttribute the primary key of the amf registration
	* @return the amf registration, or <code>null</code> if a amf registration with the primary key could not be found
	*/
	public static AmfRegistration fetchByPrimaryKey(
		java.lang.String fakeAttribute) {
		return getPersistence().fetchByPrimaryKey(fakeAttribute);
	}

	public static java.util.Map<java.io.Serializable, AmfRegistration> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the amf registrations.
	*
	* @return the amf registrations
	*/
	public static List<AmfRegistration> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the amf registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf registrations
	* @param end the upper bound of the range of amf registrations (not inclusive)
	* @return the range of amf registrations
	*/
	public static List<AmfRegistration> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the amf registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf registrations
	* @param end the upper bound of the range of amf registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of amf registrations
	*/
	public static List<AmfRegistration> findAll(int start, int end,
		OrderByComparator<AmfRegistration> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf registrations
	* @param end the upper bound of the range of amf registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of amf registrations
	*/
	public static List<AmfRegistration> findAll(int start, int end,
		OrderByComparator<AmfRegistration> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the amf registrations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of amf registrations.
	*
	* @return the number of amf registrations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AmfRegistrationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AmfRegistrationPersistence, AmfRegistrationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AmfRegistrationPersistence.class);
}