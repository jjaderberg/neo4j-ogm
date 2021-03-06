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

package org.neo4j.ogm.domain.entityMapping.iterables;

import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.domain.entityMapping.Entity;

import java.util.Set;

/**
 * One incoming and one outgoing relationship of the same type. Incoming iterable field and methods annotated. Outgoing methods annotated, iterable field not annotated.
 *
 * @author Luanne Misquitta
 */
public class UserV12 extends Entity {

    private Set<UserV12> friend;

    @Relationship(type = "LIKES", direction = "INCOMING")
    private Set<UserV12> friendOf;

    public UserV12() {
    }

    @Relationship(type = "LIKES")
    public Set<UserV12> getFriend() {
        return friend;
    }

    @Relationship(type = "LIKES")
    public void setFriend(Set<UserV12> friend) {
        this.friend = friend;
    }

    @Relationship(type = "LIKES", direction = "INCOMING")
    public Set<UserV12> getFriendOf() {
        return friendOf;
    }

    @Relationship(type = "LIKES", direction = "INCOMING")
    public void setFriendOf(Set<UserV12> friendOf) {
        this.friendOf = friendOf;
    }
}
