/*
 * Copyright (c) 2002-2016 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 *  conditions of the subcomponent's license, as noted in the LICENSE file.
 */
package org.neo4j.ogm;

import org.neo4j.ogm.annotations.DefaultEntityAccessStrategy;
import org.neo4j.ogm.annotations.EntityAccessStrategy;
import org.neo4j.ogm.metadata.ClassInfo;

/**
 * The utility methods here will all throw a <code>NullPointerException</code> if invoked with <code>null</code>.
 *
 * @author Luanne Misquitta
 */
public class EntityUtils {

	public static Long identity(Object entity, MetaData metaData) {
		EntityAccessStrategy entityAccessStrategy = new DefaultEntityAccessStrategy();
		ClassInfo classInfo = metaData.classInfo(entity);

		assert (classInfo != null);

		Object id = entityAccessStrategy.getIdentityPropertyReader(classInfo).read(entity);

		return (id == null ? -System.identityHashCode(entity) : (Long) id);
	}
}