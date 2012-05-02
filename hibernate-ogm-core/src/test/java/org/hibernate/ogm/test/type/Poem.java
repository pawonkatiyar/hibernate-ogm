/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * JBoss, Home of Professional Open Source
 * Copyright 2012 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package org.hibernate.ogm.test.type;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.UUID;

/**
* @author Emmanuel Bernard <emmanuel@hibernate.org>
*/
@Entity
public class Poem {
	@Id
	@GeneratedValue(generator = "uuid") @GenericGenerator( name = "uuid", strategy = "uuid2")
	public String getId() { return id; }
	public void setId(String id) {  this.id = id; }
	private String id;

	public String getName() { return name; }
	public void setName(String name) {  this.name = name; }
	private String name;

	public UUID getPoemSocietyId() { return poemSocietyId; }
	public void setPoemSocietyId(UUID poemSocietyId) {  this.poemSocietyId =  poemSocietyId; }
	private UUID poemSocietyId;

	@Temporal( TemporalType.DATE )
	public Date getCreation() { return creation; }
	public void setCreation(Date creation) {  this.creation = creation; }
	private Date creation;
}