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

package com.liferay.docs.amf.registration.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.amf.registration.model.AmfRegistration;
import com.liferay.docs.amf.registration.model.AmfRegistrationModel;
import com.liferay.docs.amf.registration.model.AmfRegistrationSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the AmfRegistration service. Represents a row in the &quot;AR_AmfRegistration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AmfRegistrationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AmfRegistrationImpl}.
 * </p>
 *
 * @author liferay
 * @see AmfRegistrationImpl
 * @see AmfRegistration
 * @see AmfRegistrationModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class AmfRegistrationModelImpl extends BaseModelImpl<AmfRegistration>
	implements AmfRegistrationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a amf registration model instance should use the {@link AmfRegistration} interface instead.
	 */
	public static final String TABLE_NAME = "AR_AmfRegistration";
	public static final Object[][] TABLE_COLUMNS = {
			{ "fakeAttribute", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("fakeAttribute", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table AR_AmfRegistration (fakeAttribute VARCHAR(75) not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table AR_AmfRegistration";
	public static final String ORDER_BY_JPQL = " ORDER BY amfRegistration.fakeAttribute ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AR_AmfRegistration.fakeAttribute ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.docs.amf.registration.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.docs.amf.registration.model.AmfRegistration"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.docs.amf.registration.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.docs.amf.registration.model.AmfRegistration"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static AmfRegistration toModel(AmfRegistrationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		AmfRegistration model = new AmfRegistrationImpl();

		model.setFakeAttribute(soapModel.getFakeAttribute());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<AmfRegistration> toModels(
		AmfRegistrationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<AmfRegistration> models = new ArrayList<AmfRegistration>(soapModels.length);

		for (AmfRegistrationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.docs.amf.registration.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.docs.amf.registration.model.AmfRegistration"));

	public AmfRegistrationModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _fakeAttribute;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setFakeAttribute(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fakeAttribute;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return AmfRegistration.class;
	}

	@Override
	public String getModelClassName() {
		return AmfRegistration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fakeAttribute", getFakeAttribute());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String fakeAttribute = (String)attributes.get("fakeAttribute");

		if (fakeAttribute != null) {
			setFakeAttribute(fakeAttribute);
		}
	}

	@JSON
	@Override
	public String getFakeAttribute() {
		if (_fakeAttribute == null) {
			return "";
		}
		else {
			return _fakeAttribute;
		}
	}

	@Override
	public void setFakeAttribute(String fakeAttribute) {
		_fakeAttribute = fakeAttribute;
	}

	@Override
	public AmfRegistration toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AmfRegistration)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AmfRegistrationImpl amfRegistrationImpl = new AmfRegistrationImpl();

		amfRegistrationImpl.setFakeAttribute(getFakeAttribute());

		amfRegistrationImpl.resetOriginalValues();

		return amfRegistrationImpl;
	}

	@Override
	public int compareTo(AmfRegistration amfRegistration) {
		String primaryKey = amfRegistration.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AmfRegistration)) {
			return false;
		}

		AmfRegistration amfRegistration = (AmfRegistration)obj;

		String primaryKey = amfRegistration.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<AmfRegistration> toCacheModel() {
		AmfRegistrationCacheModel amfRegistrationCacheModel = new AmfRegistrationCacheModel();

		amfRegistrationCacheModel.fakeAttribute = getFakeAttribute();

		String fakeAttribute = amfRegistrationCacheModel.fakeAttribute;

		if ((fakeAttribute != null) && (fakeAttribute.length() == 0)) {
			amfRegistrationCacheModel.fakeAttribute = null;
		}

		return amfRegistrationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{fakeAttribute=");
		sb.append(getFakeAttribute());

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append("com.liferay.docs.amf.registration.model.AmfRegistration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fakeAttribute</column-name><column-value><![CDATA[");
		sb.append(getFakeAttribute());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = AmfRegistration.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			AmfRegistration.class
		};
	private String _fakeAttribute;
	private AmfRegistration _escapedModel;
}